package org.eclipse.papyrus.generators.xtext.athena.vle.main;

import java.awt.Dimension;
import java.util.Vector;

import org.xtext.athenaDSL.Project;
import org.xtext.athenaDSL.architectureElement;
import org.xtext.athenaDSL.instanceDeclaration;
import org.xtext.athenaDSL.parameterDeclaration;
import org.xtext.athenaDSL.prototypeDeclaration;
import org.xtext.athenaDSL.qualifiedName;
import org.xtext.athenaDSL.referenceDeclaration;

import edu.uci.ics.jung.algorithms.layout.ISOMLayout;
import edu.uci.ics.jung.graph.DirectedGraph;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.graph.util.EdgeType;

public class InstanceBuilder 
{
	/**
	 * Instance definition
	 * @author smillet
	 *
	 */
	private class Instance
	{
		String name;
		String protoName;
		Instance parent = null;
		Vector<Instance> children = new Vector<Instance>();
		Vector<String> inputs = new Vector<String>();
		Vector<referenceDeclaration> qinputs = new Vector<referenceDeclaration>();
		Vector<String> outputs = new Vector<String>();
		int x;
		int y;
	}
	
	/**
	 * Definition of a connection
	 * @author smillet
	 *
	 */
	private class Connector
	{
		Instance ifrom;
		String output;
		Instance ito;
		String input;
	}
	
	/**
	 * Constructor
	 */
	public InstanceBuilder()
	{
		
	}
	
	/**
	 * create an instance 
	 * @param parent
	 * @param proto
	 */
	public Instance createInstance(String iname, Instance parent, prototypeDeclaration proto)
	{
		//
		Instance i = new Instance();
		i.name = iname;
		i.protoName = proto.getName();
		i.parent = parent;
		System.out.println("# instance "+iname+" - parent "+(parent!=null?parent.name:"*"));
		
		// add inputs and outputs
		do {
			for (architectureElement elt : proto.getDefinitions())
			{
				if (elt instanceof parameterDeclaration)
				{
					parameterDeclaration param = (parameterDeclaration)elt;
					i.outputs.add(param.getName());
					System.out.println("\t* output "+param.getName());
				}
				else if (elt instanceof referenceDeclaration)
				{
					referenceDeclaration ref = (referenceDeclaration)elt;
					String name = DSLQueries.getNameFromQualifiedName(ref.getName());
					i.inputs.add(name);
					i.qinputs.add(ref);
					System.out.println("\t* input "+name);
				}
				else if (elt instanceof instanceDeclaration)
				{
					instanceDeclaration inst = (instanceDeclaration)elt;
					System.out.println("* child "+inst.getName()+" ---------------");
					Instance c = createInstance(inst.getName(), i, inst.getTypeName());
					System.out.println("* eof child "+inst.getName()+" ---------------");
					i.children.add(c);
				}
			}
			proto = proto.getSuperType();
		} 
		while (proto!=null);
		
		//
		return i;
		
	}
	
	
	/**
	 * build the text vpz declaration of an instance 
	 * @param inst
	 * @return
	 */
	public String buildInstanceDeclaration(Instance inst)
	{
		int width = 50;
		if ((inst.inputs.size()>0)&&(inst.inputs.size()>0)) width = 100;
		int height = 10+Math.max(inst.inputs.size(), inst.outputs.size())*15;
		String res = "    <model name=\""+inst.name+"\" type=\"atomic\" conditions=\"\" dynamics=\""+inst.protoName+"\" observables=\"\" x=\""+(inst.x-width/2)+"\" y=\""+(inst.y-height/2)+"\" width=\""+width+"\" height=\""+height+"\" >\n";
		res +=       "      <in>\n";
		for (String input : inst.inputs)
			res +=   "        <port name=\""+input+"\"/>\n";
		res +=       "      </in>\n";
		res +=       "      <out>\n";
		for (String output : inst.outputs)
			res +=   "        <port name=\""+output+"\"/>\n";
		res +=       "      </out>\n";
		res +=       "    </model>\n";
		for (Instance child : inst.children)
			res += buildInstanceDeclaration(child);
		return res;
	}

	/**
	 * look for a connected instance which is up in the instance tree
	 * @param qn
	 * @param instance
	 * @return
	 */
	public Instance lookUpFor(qualifiedName qn, Instance instance)
	{
		//
		int length = qn.getName().size();
		String qn0 = qn.getName().get(0);
		// 
		if (length==1)
		{
			//
			for (String output : instance.outputs)
			{
				if (output.equals(qn0))
				{
					return instance;
				}
			}
			
		}
		// length>1
		else 
		{
			//
			for(Instance child : instance.children)
			{
				if (child.name.equals(qn0)) {
					return lookDownFor(qn, child, 1);
				}
			}
		}
		//
		if (instance.parent!=null) {
			System.out.println("  ** looking up for "+qn0+" in "+instance.name);
			return lookUpFor(qn, instance.parent);
		}
		//
		return null;
	}
	
	/**
	 * look for a connection with an instance which is below in the instance tree
	 * @param qn
	 * @param instance
	 * @return
	 */
	public Instance lookDownFor(qualifiedName qn, Instance instance, int l)
	{
		//
		String qnl = qn.getName().get(l);
		System.out.println("  ** looking down for "+qnl+" in "+instance.name);
		//
		if (l<qn.getName().size()-1)
		{
			//
			for(Instance child : instance.children)
			{
				if (child.name.equals(qnl)) {
					return lookDownFor(qn, child, l+1);
				}
			}
		}
		//
		else {
			//
			for (String output : instance.outputs)
			{
				if (output.equals(qnl))
				{
					return instance;
				}
			}
		}
		return null;
	}
	
	/**
	 * create a new connection between 2 instances
	 * go through all inputs, try to find the connected output
	 * @param instance
	 */
	public void createConnectors(Instance instance, Vector<Connector> connectors)
	{
		// this instance
		int ninputs = instance.inputs.size();
		//
		for (int i=0; i<ninputs; i++)
		{
			//
			String inputName = instance.inputs.get(i);
			referenceDeclaration ref = instance.qinputs.get(i);
			qualifiedName qn = ref.getName();
			Instance ifrom = null;
			System.out.println("* trying to resolve "+instance.name+":"+inputName+", upway="+ref.isUpway());
			//
			if (ref.isUpway()&&(instance.parent!= null)) ifrom = lookUpFor(qn, instance.parent);
			else ifrom = lookDownFor(qn, instance, 0);
			// 
			if (ifrom != null)
			{
				Connector conn = new Connector();
				conn.ifrom = ifrom;
				conn.ito = instance;
				conn.output = qn.getName().get(qn.getName().size()-1);
				conn.input = inputName;
				connectors.add(conn);
				System.out.println("\t* connector from "+conn.ifrom.name+":"+conn.output+" to "+conn.ito.name+":"+conn.input);
			}
		}
		// child instances
		for (Instance child : instance.children) createConnectors(child, connectors);				
	}
	
	/**
	 * build the text vpz definition of connections
	 * @param connectors
	 * @return
	 */
	public String buildConnectors(Vector<Connector> connectors)
	{
		String res = "   <connections>\n";
		for (Connector conn : connectors)
		{
			res +=   "     <connection type=\"internal\">\n";
			res +=   "       <origin model=\""+conn.ifrom.name+"\" port=\""+conn.output+"\"/>\n";
			res +=   "       <destination model=\""+conn.ito.name+"\" port=\""+conn.input+"\"/>\n";
			res +=   "     </connection>\n";
		}
		res +=       "   </connections>";
		
		return res;
	}
	
	/**
	 * create a jung graph, add vertexes
	 * @param graph
	 * @param instance
	 */
	public void addInstancesToGraph(DirectedGraph<String, String> graph, Instance instance)
	{
		graph.addVertex(instance.name);
		for (Instance child : instance.children) addInstancesToGraph(graph, child);
	}
	
	/**
	 * set the positions of the instances for gvle presentation
	 * @param layout
	 * @param instance
	 */
	public void updateInstancesPosition(ISOMLayout<String, String> layout, Instance instance)
	{
		System.out.println("> "+instance.name+": "+layout.getX(instance.name)+", "+layout.getY(instance.name));
		instance.x = (int)layout.getX(instance.name);
		instance.y = (int)layout.getY(instance.name);
		for (Instance child : instance.children) updateInstancesPosition(layout, child);
	}
	
	/**
	 * compute the positions of the instances for gvle presentation
	 * @param rootInstance
	 * @param connectors
	 */
	public void updateInstancePositions(Instance rootInstance, Vector<Connector> connectors)
	{
		//
		DirectedGraph<String, String> graph = new DirectedSparseMultigraph<String, String>();
		addInstancesToGraph(graph, rootInstance);
		int i = 0;
		for (Connector conn : connectors) 
		{
			String name = "E"+i;
			graph.addEdge(name, conn.ifrom.name, conn.ito.name, EdgeType.DIRECTED);
			i++;
		}
		//
		System.out.println(graph);
		//
		ISOMLayout<String, String> layout = new ISOMLayout<String, String>(graph);
		layout.setSize(new Dimension(1000, 800));
		layout.initialize();
		//
		updateInstancesPosition(layout, rootInstance);
	}
	
	/**
	 * Get the root prototype
	 * @param p
	 * @return
	 * @throws Exception
	 */
	public prototypeDeclaration getRootPrototype(Project p) throws Exception
	{
		for (prototypeDeclaration proto : p.getPrototypes()) 
		{
			if (proto.getName().equals("Root")) 
			{
				return proto;
			}
		}
		System.out
				.println("------------------ getRootPrototype: no Root Prototype found !!!!");
		throw (new Exception());

	}
	
	/**
	 * create the VLE vpz file: add instances and connections
	 * @param p
	 * @param target
	 * @param ref
	 * @return
	 */
	public String createInstances(Project project) throws Exception
	{
		
		// create instance tree
		Instance rootInstance = createInstance("Root", null, getRootPrototype(project));
		// get the list of connections between instances
		Vector<Connector> connectors = new Vector<Connector>();
		createConnectors(rootInstance, connectors);
		// update the positions of instances for GVLE
		updateInstancePositions(rootInstance, connectors);
		
		// return text for vpz file
		return "   <submodels>\n" + buildInstanceDeclaration(rootInstance) + "   </submodels>\n" + buildConnectors(connectors);
	}
	
}
