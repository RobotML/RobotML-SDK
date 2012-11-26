package org.eclipse.acceleo.module.OrocosGenerator.mmqueries;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.RobotML.DataFlowDirectionKind;
import org.eclipse.papyrus.RobotML.DataFlowPort;
import org.eclipse.papyrus.RobotML.ServiceFlowKind;
import org.eclipse.papyrus.RobotML.ServicePort;
import org.eclipse.papyrus.uml.tools.utils.ElementUtil;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.FunctionBehavior;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.Vertex;


/**
 * 
 * @author scdtnsm
 *
 */
public class GeneralQueries {
	LinkedList<java.lang.String> dataTypes = new LinkedList<String>();
	LinkedList<java.lang.String> alldata=new LinkedList<String>();
	LinkedList<java.lang.String> rttData = new LinkedList<String>();

	/** setR
	 * Checks whether or not a port is a "source port" from the point of view of a given connector.
	 * A source port can be an output port for a connector stepping out of a component or it can be
	 * an input port for a connector linking a component model input port to a component input port
	 * inside the component model (e.g. from the model boundaries to a component inside the model). 
	 */
	private boolean isSourcePort(ConnectorEnd end, Port p) {
		return ((this.isAnInputPort(p) &&end.getPartWithPort() == null) || (this.isAnOutputPort(p) && end.getPartWithPort() != null));

	}

	/**
	 * Checks whether or not a port is a "destination port" from the point of view of a given connector.
	 * A destination port can be an input port for a connector stepping out of a component or it can be
	 * an output port for a connector linking a component model output port to a component output port
	 * inside the component model (e.g. from a component inside the model to the model boundaries). 
	 */
	private boolean isDestPort(ConnectorEnd end, Port p) {
		return ((this.isAnOutputPort(p) && end.getPartWithPort() == null) || (this.isAnInputPort(p) && end.getPartWithPort() != null));

	}

	/** 
	 * Retrieves the source port for a given connector 
	 * @see isDestPort and isSourcePort
	 */
	private int getSourcePort(org.eclipse.uml2.uml.Connector conn,  Port[] dest_port) {

		if (conn.getEnds().get(0).getRole() instanceof Port) {
			Port test_1 = (Port)conn.getEnds().get(0).getRole();
			if (isSourcePort(conn.getEnds().get(0),test_1)) {
				dest_port[0] = test_1;
				return 0;
			}
			Port test_2 = (Port)conn.getEnds().get(1).getRole();
			if (isSourcePort(conn.getEnds().get(1),test_2)) {
				dest_port[0] = test_2;
				return 1;
			}
		}
		dest_port = null;
		return -1;
	}

	/** 
	 * Retrieves the destination port for a given connector 
	 * @see isDestPort and isSourcePort
	 */
	private int getDestPort(org.eclipse.uml2.uml.Connector conn, Port[] dest_port) {
		if (conn.getEnds().get(0).getRole() instanceof Port) {
			Port test_1 = (Port)conn.getEnds().get(0).getRole();
			if (this.isDestPort(conn.getEnds().get(0),test_1)) {
				dest_port[0] = test_1;
				return 0;
			}
			Port test_2 = (Port)conn.getEnds().get(1).getRole();
			if (this.isDestPort(conn.getEnds().get(1),test_2)) {
				dest_port[0] = test_2;
				return 1;
			}
		}
		dest_port = null;
		return -1;
	}

	/** 
	 * Retrieves the long name of the source port for a given connector.
	 * The long name is in the form: component_name.port_name
	 * Returns a String.
	 */
	public String getSourceNameForConnector(org.eclipse.uml2.uml.Connector conn) {
		String inputName;
		Port[] inputPort = new Port[1];
		int index = getSourcePort(conn, inputPort);
		if (index < 0)
			return "Unknown";
		if (conn.getEnds().get(index).getPartWithPort()==null) {
			inputName = inputPort[0].getName(); 
		} else {
			inputName = conn.getEnds().get(index).getPartWithPort().getName() + "." + inputPort[0].getName();
		}
		return inputName;
	}
	/** 
	 * Get the source port name of a connector.
	 * @todo a valider par Nicolas
	 */
	public String getSourcePortName(org.eclipse.uml2.uml.Connector conn) {
		String inputName;
		Port[] inputPort = new Port[1];
		int index = getSourcePort(conn, inputPort);
		if (index < 0)
			return "Unknown";

		inputName = inputPort[0].getName(); 

		return inputName;
	}

	/**
	 * Get the source port instance of a connector
	 * @todo a valider par Nicolas
	 */
	public org.eclipse.uml2.uml.Property getSourcePropertyForConnector(org.eclipse.uml2.uml.Connector conn) {
		Property input;
		Port[] inputPort = new Port[1];
		int index = getSourcePort(conn, inputPort);
		if ( (index < 0) || (conn.getEnds().get(index).getPartWithPort()==null) )
			return null; 
		else
			input = conn.getEnds().get(index).getPartWithPort();
		return input;
	}

	/** 
	 * Retrieves the long name of the destination port for a given connector.
	 * The long name is in the form: component_name.port_name
	 * Returns a String.
	 */
	public String getDestNameForConnector(org.eclipse.uml2.uml.Connector conn) {
		String outputName;
		Port[] outputPort = new Port[1];
		int index = getDestPort(conn, outputPort);
		if (index < 0)
			return "Unknown";
		if (conn.getEnds().get(index).getPartWithPort()==null) {
			outputName = outputPort[0].getName(); 
		} else {
			outputName = conn.getEnds().get(index).getPartWithPort().getName() + "." + outputPort[0].getName();
		}
		return outputName;
	}

	/** 
	 * Get the destination port name of a connector
	 * @todo a valider par Nicolas
	 */
	public String getDestPortName(org.eclipse.uml2.uml.Connector conn) {
		String outputName;
		Port[] outputPort = new Port[1];
		int index = getDestPort(conn, outputPort);
		if (index < 0)
			return "Unknown";

		outputName = outputPort[0].getName(); 

		return outputName;
	}

	/**
	 * Get the destination port instance of a connector
	 * @todo a valider par Nicolas
	 */
	public org.eclipse.uml2.uml.Property getDestPropertyForConnector(org.eclipse.uml2.uml.Connector conn) {
		Property output;
		Port[] outputPort = new Port[1];
		int index = getDestPort(conn, outputPort);
		if ( (index < 0) || (conn.getEnds().get(index).getPartWithPort()==null) )
			return null; 
		else
			output = conn.getEnds().get(index).getPartWithPort();
		return output;
	}

	/**
	 * Retrieves all the connectors between subcomponents inside a given component model.
	 * (does not retrieve connectors between component model boundaries and subcomponents inside the model).
	 */
	public List<org.eclipse.uml2.uml.Connector> getInternalConnectors(org.eclipse.uml2.uml.Class c) {
		LinkedList<org.eclipse.uml2.uml.Connector> connectors = new LinkedList<org.eclipse.uml2.uml.Connector>();
		for (Connector conn : c.getOwnedConnectors()) {
			if (conn.getEnds().size() >= 2 && (conn.getEnds().get(0).getPartWithPort() != null) && (conn.getEnds().get(1).getPartWithPort() != null)) {
				connectors.add(conn);
			}
		}
		return connectors;
	}



	/**
	 * Retrieves all the connectors between the input component model boundaries and subcomponents that are inside the model.
	 * (does not retrieve connectors between subcomponents inside the component model, nor connectors from subcomponents to component model outputs).
	 */
	public List<org.eclipse.uml2.uml.Connector> getExternalInputConnectors(org.eclipse.uml2.uml.Class c) {
		LinkedList<org.eclipse.uml2.uml.Connector> connectors = new LinkedList<org.eclipse.uml2.uml.Connector>();
		for (Connector conn : c.getOwnedConnectors()) {
			if (conn.getEnds().size() >= 2) {// && (conn.getEnds().get(1).getPartWithPort() != null)) {
				if (conn.getEnds().get(0).getRole() instanceof Port && conn.getEnds().get(1).getRole() instanceof Port) {
					Port port_1 = (Port)conn.getEnds().get(0).getRole();
					Port port_2 = (Port)conn.getEnds().get(1).getRole();
					if ((this.isAnInputPort(port_1) && conn.getEnds().get(0).getPartWithPort() == null) || (this.isAnInputPort(port_2) && conn.getEnds().get(1).getPartWithPort() == null)) {
						connectors.add(conn);
					}
				}
			}
		}
		return connectors;
	}

	/**
	 * Retrieves all the connectors between subcomponents that are inside the component model and the component model outputs.
	 * (does not retrieve connectors between subcomponents inside the component model, nor connectors from component model inputs to subcomponents).
	 */
	public List<org.eclipse.uml2.uml.Connector> getExternalOutputConnectors(org.eclipse.uml2.uml.Class c) {
		LinkedList<org.eclipse.uml2.uml.Connector> connectors = new LinkedList<org.eclipse.uml2.uml.Connector>();
		for (Connector conn : c.getOwnedConnectors()) {
			if (conn.getEnds().size() >= 2) {// && (conn.getEnds().get(0).getPartWithPort() != null)) {
				if (conn.getEnds().get(0).getRole() instanceof Port && conn.getEnds().get(1).getRole() instanceof Port) {
					Port port_1 = (Port)conn.getEnds().get(0).getRole();
					Port port_2 = (Port)conn.getEnds().get(1).getRole();
					if ((this.isAnOutputPort(port_1) && conn.getEnds().get(0).getPartWithPort() == null) || (this.isAnOutputPort(port_2) && conn.getEnds().get(1).getPartWithPort() == null)) {
						connectors.add(conn);
					}
				}
				//if (conn.getEnds().get(0).getPartWithPort().getName().compareTo(c.getName())!=0 &&
				//conn.getEnds().get(1).getPartWithPort()==null) {
				//connectors.add(conn);
				//}
			}
		}
		return connectors;
	}

	/**
	 * Retrieves the highest level class into which a given model is contained.
	 * (a model can be contained in a model ... which is contained in a class).
	 */
	public org.eclipse.uml2.uml.Class getRootClassForModel(org.eclipse.uml2.uml.Model m) {
		for (Element ne : m.getOwnedElements()) {
			if (ne instanceof org.eclipse.uml2.uml.Class) {
				return ( org.eclipse.uml2.uml.Class)ne;
			} else if (ne instanceof org.eclipse.uml2.uml.Model) {
				return getRootClassForModel((org.eclipse.uml2.uml.Model)ne);
			}
		}
		return null;
	}
	/**
	 * On a given class (a PROTEUS system), retrieve all the contained systems.
	 * Recursive. 
	 */
	public List<org.eclipse.uml2.uml.Property> getAllSubComponentsInClass(org.eclipse.uml2.uml.Class c)
	{
		LinkedList<org.eclipse.uml2.uml.Property> sub_components = new LinkedList<org.eclipse.uml2.uml.Property>();
		List <org.eclipse.uml2.uml.Property> level_1 = getLevel1SubComponentsForComponent(c);
		sub_components.addAll(level_1);
		for (Property prop : level_1) {
			List<Property> next_levels = getAllSubComponentsInClass((org.eclipse.uml2.uml.Class)prop.getType());
			sub_components.addAll(next_levels);
		}
		return sub_components;
	}

	/**
	 * On a given class (a PROTEUS system), retrieve all the contained systems.
	 * Not recursive. Retrieves only one level deep.
	 * @TODO: c'est tr�s tr�s moche tout �a. Et puis on ratisse large avec tous ces stereotypes.
	 */
	public List<org.eclipse.uml2.uml.Property> getLevel1SubComponentsForComponent(org.eclipse.uml2.uml.Class c)
	{
		//System.out.println("Looking for sub components in class " + c.getName());
		LinkedList<org.eclipse.uml2.uml.Property> sub_components = new LinkedList<org.eclipse.uml2.uml.Property>();
		for (org.eclipse.uml2.uml.Property prop : c.getAllAttributes()) {
			//System.out.println("\tFound prop: " + prop.getName());
			Type t = prop.getType();
			if (t instanceof org.eclipse.uml2.uml.Class) {
				//System.out.println("\tProp " + prop.getName() + " has type " + t.getName());
				//* OLD STYLE:
				for (Stereotype st : t.getAppliedStereotypes()) {
					//System.out.println("\tProp " + prop.getName() + " with type " + t.getName() + " has stereotype " + st.getName());
					if (st.getName().compareTo("System")==0 || 
							st.getName().compareTo("Sensor")==0 || 
							st.getName().compareTo("Actuator")==0 ||
							st.getName().compareTo("SensorSystem")==0 ||
							st.getName().compareTo("ActuatorSystem")==0 ||
							st.getName().compareTo("RoboticSystem") == 0 ||
							st.getName().compareTo("Software")==0) {
						//System.out.println("\tYEAH, we've found sub components in " + c.getName());
						sub_components.add(prop);
					}
				}//*/
				/* NEW STYLE : (c'est moche et �a marche pas, il doit y avoir mieux � faire).
				RoboticSystem rs = ElementUtil.getStereotypeApplication(t, RoboticSystem.class);
				if (rs != null) {
					sub_components.add(prop);
					break;
				}
				SensorSystem ss = ElementUtil.getStereotypeApplication(t, SensorSystem.class);
				if (ss != null) {
					sub_components.add(prop);
					break;
				}
				ActuatorSystem as = ElementUtil.getStereotypeApplication(t, ActuatorSystem.class);
				if (as != null) {
					sub_components.add(prop);
					break;
				}
				Software s = ElementUtil.getStereotypeApplication(t, Software.class);
				if (s != null) {
					sub_components.add(prop);
					break;
				}
				org.eclipse.papyrus.RobotML.System sys = ElementUtil.getStereotypeApplication(t, org.eclipse.papyrus.RobotML.System.class);
				if (sys != null) {
					sub_components.add(prop);
					break;
				}//*/
			}
		}
		return sub_components;
	}


	/**
	 * As its name says, retrieves the output ports for a given element.
	 */
	public List<org.eclipse.uml2.uml.Port> getOutputPortsForElement(Element elt) {
		LinkedList<org.eclipse.uml2.uml.Port> found_output_ports = new LinkedList<org.eclipse.uml2.uml.Port>();		
		for (Element child : elt.getOwnedElements()) {
			if (child instanceof NamedElement && child instanceof org.eclipse.uml2.uml.Port) {
				if (isAnOutputPort((org.eclipse.uml2.uml.Port)child)) {
					found_output_ports.add((org.eclipse.uml2.uml.Port)child);
				}
			}
		}
		return found_output_ports;
	}

	/**
	 * As its name says, retrieves the input ports for a given element.
	 */
	public List<Port> getInputPortsForElement(Element elt) {
		LinkedList<Port> found_input_ports = new LinkedList<org.eclipse.uml2.uml.Port>();
		for (Element child : elt.getOwnedElements()) {
			if (child instanceof NamedElement && child instanceof org.eclipse.uml2.uml.Port) {
				if (isAnInputPort((org.eclipse.uml2.uml.Port)child)) {
					Port found_port = (org.eclipse.uml2.uml.Port)child;
					found_input_ports.add(found_port);
				}
			}
		}
		return found_input_ports;
	}

	/**
	 * Retrieves all the component models available inside a PROTEUS model.
	 * This is based on stereotype names. Not robust.
	 * @TODO: use Java API generated from the PROTEUS Profile.
	 */
	/*
	public List<NamedElement> getProteusComponentModels(Model model)
	{
		LinkedList<NamedElement> found_elts = new LinkedList<NamedElement>();
		getElementsWithStereotype(model,org.eclipse.papyrus.RobotML.RoboticSystem.class,found_elts);
		return found_elts;
	}
	 */
	public List<NamedElement> getProteusComponentModels(Model model)
	{
		LinkedList<NamedElement> found_elts = new LinkedList<NamedElement>();
		found_elts.addAll(getElementsWithStereotype(model,"System"));
		found_elts.addAll(getElementsWithStereotype(model,"RoboticSystem"));
		found_elts.addAll(getElementsWithStereotype(model,"Software"));
		found_elts.addAll(getElementsWithStereotype(model,"SensorSystem"));
		found_elts.addAll(getElementsWithStereotype(model,"ActuatorSystem"));
		found_elts.addAll(getElementsWithStereotype(model,"Actuator"));
		//		found_elts.addAll(getElementsWithStereotype(model,"Software"));
		return found_elts;
	}




	/*
	 * PROTO avec nouvelle API. Ne marche sans doute pas.
	 */
	/*	private <T> void getElementsWithStereotype(Element parent_elt, Class clazz, LinkedList<NamedElement> target_list) {
		for (Element ne : parent_elt.getOwnedElements()) {
			if (ne instanceof NamedElement) {
				//System.out.println(((NamedElement)ne).getName());
				if (ne instanceof org.eclipse.uml2.uml.Class) {
					T myclass =  ElementUtil.getStereotypeApplication(ne, clazz);
					if (myclass != null)
						target_list.add((NamedElement) ne);
				}
				getElementsWithStereotype(ne,clazz,target_list);
			}
		}
		return;
	}
	 */
	/**
	 * Recursive retrieve of all elements with a given stereotype in the model.
	 * @param model Model to search in.
	 * @param stereotype The stereotype name (e.g. "Sensor", "Actuator", "SubSystem"...)
	 * @return A list of NamedElements having the specified stereotype.
	 * @deprecated to be replaced with calls to the RobotML API. Replaced by getElementsWithStereotype (Model model, StereotypeClass sc)
	 */
	public List<NamedElement> getElementsWithStereotype(Model model, String stereotype) {		
		LinkedList<NamedElement> found_elts = new LinkedList<NamedElement>();
		for (Element ne : model.getOwnedElements()) {
			if (ne instanceof NamedElement) {
				if (ne instanceof org.eclipse.uml2.uml.Class) {
					if (this.hasStereotype((org.eclipse.uml2.uml.Class)ne, stereotype)) {
						found_elts.add((NamedElement)ne);
					}
				}
			} else if (ne instanceof Model) {
				found_elts.addAll(getElementsWithStereotype((Model)ne,stereotype));
			}
			getElementsWithStereotype(ne,stereotype,found_elts);
		}
		return found_elts;
	}

	/**
	 * Same as getElementsWithStereotype(Model model...) searches in an Element members, not in a Model members.
	 * This function is private and used by getElementsWithStereotype(Model model...)
	 * @param parent_elt
	 * @param stereotype
	 * @param target_list
	 * @deprecated to be replaced with calls to the RobotML API.
	 */
	private void getElementsWithStereotype(Element parent_elt, String stereotype, LinkedList<NamedElement> target_list) {
		for (Element ne : parent_elt.getOwnedElements()) {
			if (ne instanceof NamedElement) {
				//System.out.println(((NamedElement)ne).getName());
				if (ne instanceof org.eclipse.uml2.uml.Class) {
					if(this.hasStereotype((org.eclipse.uml2.uml.Class)ne, stereotype)){
						target_list.add((NamedElement)ne);
					}					
					//					String current_stereotype = this.getStereotype((org.eclipse.uml2.uml.Class)ne);
					//					//if (stereotype != "--")
					//					//	System.out.println("STEREOTYPE: " + stereotype);
					//					if (current_stereotype.compareTo(stereotype)==0) {
					//						//System.out.println("FOUND A SENSOR: " + ((NamedElement)ne).getName());
					//						target_list.add((NamedElement)ne);
					//					}
				}
				getElementsWithStereotype(ne,stereotype,target_list);
			}
		}
		return;
	}

	/**
	 * Get all user-defined datatypes.
	 * @return A list of datatypes
	 * @todo a valider par Nicolas
	 */
	public List<NamedElement> getElementsDataType(Model model)
	{		
		LinkedList<NamedElement> found_elts = new LinkedList<NamedElement>();
		for (NamedElement ne : model.getOwnedMembers())
		{
			if (ne instanceof org.eclipse.uml2.uml.DataType) {
				found_elts.add((NamedElement)ne);
			}
			getElementsDataType(ne,found_elts);

		}
		return found_elts;
	}

	/**
	 * Recursive sub-function to browse model and get all user-defined datatypes.
	 * @todo a valider par Nicolas
	 */
	private void getElementsDataType(Element parent_elt, LinkedList<NamedElement> target_list)
	{
		for (Element ne : parent_elt.getOwnedElements())
		{
			if (ne instanceof org.eclipse.uml2.uml.DataType)
			{
				target_list.add((NamedElement)ne);
			}
			getElementsDataType(ne,target_list);
		}
		return;
	}

	/**
	 * Return true if a given class has specified stereotype.
	 */
	public Boolean hasStereotype(org.eclipse.uml2.uml.Class cl, String s)
	{
		for (Stereotype st : cl.getAppliedStereotypes()) {
			if(st.getName().equals(s)){
				return true;
			}
		}
		return false;
	}

	/**
	 * Is the elt at the root of the model hierarchy ?
	 * @param elt
	 * @return
	 */
	public Boolean isRootModel(Model elt)
	{
		return (elt.getOwner() == null);
	}

	/**
	 * Does this class contain properties that are classes themselves ?
	 * (i.e. is this class a container of sub-classes)
	 * @param c
	 * @return
	 */
	public Boolean isMacroComponent(org.eclipse.uml2.uml.Class c)
	{
		boolean result = false;
		if (this.getLevel1SubComponentsForComponent(c).size() > 0) {
			result = true;
		}
		//System.out.println(c.getName() + " is macro component? " + (result == true ? "Yessssss. :D" : "Nooo. Too bad. :("));
		return result;
	}

	/**
	 * Java helper...
	 */
	public String concatStrings(String b, String c) {
		return b+c;
	}

	/**
	 * 
	 */
	public String getComponentFileName(org.eclipse.uml2.uml.Class c, String end) {
		return c.getName()+end;
	}

	/**
	 * Is this element a UML class
	 * @param element
	 * @return is this a UML class ?
	 */
	public Boolean isClass(Element elt) {
		return elt instanceof org.eclipse.uml2.uml.Class;
	}

	/**
	 * Is this element a UML DataType
	 * @param element
	 * @return is this a UML DataType ?
	 */
	public Boolean isDataType(Element elt) {
		boolean b = (elt instanceof org.eclipse.uml2.uml.DataType);
		//System.out.println(((NamedElement)elt).getName()+" - isDataType: "+b+" "+elt.getAppliedStereotypes());
		return b;
	}

	/**
	 * Is this element a UML interface
	 * @param element
	 * @return is this a UML class ?
	 */
	public Boolean isInterface(Element elt) {
		boolean b = (elt instanceof org.eclipse.uml2.uml.Interface);
		//System.out.println(((NamedElement)elt).getName()+" - isInterface: "+b+" "+elt.getAppliedStereotypes());
		return b;
	}

	/**
	 * Is this element a UML Property
	 * @param element
	 * @return is this a UML Property ?
	 */
	public Boolean isProperty(Element elt) {
		return elt instanceof Property;
	}

	/**
	 * Is this property a Port
	 * @param property
	 * @return is this a port ?
	 */
	public Boolean isPort(Element prop) {
		//System.out.println(((NamedElement)prop).getName()+" - isPort: "+(prop instanceof Port)+" "+prop.getAppliedStereotypes());
		return prop instanceof Port;
	}


	/**
	 *  @TODO: author to add some doc.
	 */
	public Boolean isPortConnected(Port p1)
	{
		if (p1.getEnds().size()>0) {
			Connector conn = (Connector)p1.getEnds().get(0).getOwner();
			return isConnectionValid(conn);
		}
		else return false;		
	}

	/**
	 * @TODO: author to add some doc. Middleware specific?
	 */
	public String getConnectionOtherSide(Port p1)
	{
		if (p1.getEnds().size()>0) {
			Connector conn = (Connector)p1.getEnds().get(0).getOwner();
			ConnectorEnd e1 = conn.getEnds().get(0);
			ConnectorEnd e2 = conn.getEnds().get(1);
			Port p2 = null;
			java.lang.System.out.println("p1="+p1.getName());
			Property c2 = null;
			if (e1.getRole() == p1)
			{
				p2 = (Port)e2.getRole();
				c2 = (Property)e2.getPartWithPort();
				java.lang.System.out.println("1 - p2="+p2.getName()+", c2="+c2.getName());
			}
			else if (e2.getRole() == p1) {
				p2 = (Port)e1.getRole();
				c2 = (Property)e1.getPartWithPort();
				java.lang.System.out.println("2 - p2="+p2.getName()+", c2="+c2.getName());
			}
			if (c2.getName().equals(((NamedElement)conn.getOwner()).getName())) 
			{
				return "@"+p2.getName();
			}
			else {
				return "@"+c2.getName()+"."+p2.getName();
			}
		}
		else {
			return "?????";
		}
	}



	/**
	 * @TODO: this seems to be middleware specific. To be moved to corresponding middleware generator project.
	 */
	public String getInstanceMultiplicity(Property p)
	{
		try {
			if ((p.getLower()==1)&&(p.getUpper()==1)) 
			{
				return "";
			}
			else if ((p.getLower()==p.getUpper())) 
			{
				return "["+p.getLower()+"]";
			}
			else return "[]";
		}
		catch (Exception e) {
			java.lang.System.out.println(e);
			e.printStackTrace();
			return "";
		}
	}

	/**
	 * For DataFlow ports: is it an Input Port ?
	 * @param port
	 * @return false if the port is not a DataFlowPort or not an input port.  
	 */
	public Boolean isAnInputPort(Port port)	{		
		try {
			DataFlowPort dfp = ElementUtil.getStereotypeApplication(port, DataFlowPort.class);
			if (dfp == null)
				return false;
			if (dfp.getDirection() == DataFlowDirectionKind.IN)
				return true;
			return false;
		} catch (Exception e) {
			java.lang.System.out.println("EXCEPTION caught:" + e.toString());
		}
		return false;
	}

	/**
	 * For DataFlow ports: is it an Output Port ?
	 * @param port
	 * @return false if the port is not a DataFlowPort or not an output port.  
	 */
	public Boolean isAnOutputPort(Port port)
	{
		try {
			DataFlowPort dfp = ElementUtil.getStereotypeApplication(port, DataFlowPort.class);
			if (dfp == null)
				return false;
			if (dfp.getDirection() == DataFlowDirectionKind.OUT)
				return true;
			return false;
		} catch (Exception e) {
			java.lang.System.out.println("EXCEPTION caught:" + e.toString());
		}
		return false;		
	}

	/**
	 * For RobotML ServicePorts: is the port a "Provided" port?
	 * @param port
	 * @return false if the port is not a ServicePort or not a "Provided" ServicePort.
	 */
	public Boolean isAProvidedPort(Port port) {		
		try {
			ServicePort sp = ElementUtil.getStereotypeApplication(port, ServicePort.class);
			if (sp == null)
				return false;
			if (sp.getKind() == ServiceFlowKind.PROVIDED)
				return true;
			return false;
		} catch (Exception e) {
			java.lang.System.out.println("EXCEPTION caught:" + e.toString());
		}
		return false;		
	}


	/**
	 * For RobotML ServicePorts: is the port a "Required" port?
	 * @param port
	 * @return false if the port is not a ServicePort or not a "Required" ServicePort.
	 */
	public Boolean isARequiredPort(Port port) {
		try {
			ServicePort sp = ElementUtil.getStereotypeApplication(port, ServicePort.class);
			if (sp == null)
				return false;
			if (sp.getKind() == ServiceFlowKind.REQUIRED)
				return true;
			return false;
		} catch (Exception e) {
			java.lang.System.out.println("EXCEPTION caught:" + e.toString());
		}
		return false;
	}

	/**
	 * Is this property a Service Port
	 * @param port
	 * @return is this a service port ?
	 */
	public Boolean isServicePort(Port port) {
		if (port.getAppliedStereotypes().size() != 1) {
			return false;
		}
		else {
			Stereotype pst = port.getAppliedStereotypes().get(0);
			return (pst.getName().equals("ServicePort"));
		}
	}

	/**
	 * @TOOD: author to add some doc.
	 */
	public Boolean definesConnections(org.eclipse.uml2.uml.Class cl)
	{
		return cl.getOwnedConnectors().size()>0;
	}

	/**
	 * @TODO: author to add some doc
	 */
	public Boolean isConnectionValid(Connector connector)
	{
		if (connector.getEnds().size() != 2) 
		{
			return false;
		}
		for (ConnectorEnd cend : connector.getEnds()) 
		{
			if ((cend.getRole()==null)||(cend.getPartWithPort()==null)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @TODO: this seems to be middleware specific. To be moved to corresponding middleware generator project.
	 */
	public String getConnectionDefinition(Connector connector)
	{
		ConnectorEnd e1 = connector.getEnds().get(0);
		ConnectorEnd e2 = connector.getEnds().get(1);
		return 
				e1.getPartWithPort().getName()+"."+e1.getRole().getName()+".connectTo("+e2.getPartWithPort().getName()+"."+e2.getRole().getName()+")";
	}

	public Port getConnectedPort(Port port)
	{
		if (port.getEnds().size() == 0)
			return null;

		Connector conn = (Connector)port.getEnds().get(0).getOwner();
		ConnectorEnd e1 = conn.getEnds().get(0);
		ConnectorEnd e2 = conn.getEnds().get(1);
		return (e1.getRole() == port) ? (Port)e2.getRole() : (Port)e1.getRole();
	}

	/**
	 * Get the first stereotype applied to a given class.
	 * Warning: other stereotypes are ignored. To use with care.
	 * @deprecated superseded by the RobotML API. 
	 */
	public String getStereotype(org.eclipse.uml2.uml.Class cl)
	{
		if (cl.getAppliedStereotypes().size()==1) {
			return cl.getAppliedStereotypes().get(0).getName();
		}
		else {
			return "--";
		}
	}

	/**
	 * Return the value of a given attribute using the given stereotype  
	 */
	public String getAttributeValue(org.eclipse.uml2.uml.Class cl, String attr, String stname)
	{
		for (Stereotype st : cl.getAppliedStereotypes()) {
			if(st.getName().equals(stname)){
				Object o = cl.getValue(st, attr);
				if (o != null) {
					if (o instanceof NamedElement) {
						String v = ((NamedElement)o).getName();
						return v;
					}else if( o instanceof String){
						return (String) o;
					}else if( o instanceof EList){						
						return ((EList<Object>) o).get(0).toString();
					}
				}
			}
		}
		return null;
	}

	/**
	 * Return the values of a given attribute using the given stereotype  
	 */
	public List<String> getAttributeValues(org.eclipse.uml2.uml.Class cl, String attr, String stname)
	{
		LinkedList<String> result = new LinkedList<String>();
		for (Stereotype st : cl.getAppliedStereotypes()) {
			if(st.getName().equals(stname)){
				Object o = cl.getValue(st, attr);
				if (o != null) {
					if (o instanceof NamedElement){
						result.add(((NamedElement)o).getName());
					}else if( o instanceof String){
						result.add((String) o);
					}else if( o instanceof EList){						
						//						System.out.println("Values type: " + o.getClass().getName() );
						for(int i=0; i<((EList<Object>) o).size(); i++) {
							result.add(((EList<Object>) o).get(i).toString());
							//							System.out.println("element " + i + " : " + ((EList<Object>) o).get(i));
						}
					}else{
						result.add(o.toString());
					}
				}
			}
		}
		return result;
	}

	/**
	 * Find a class with a given name in the model.  
	 */
	public org.eclipse.uml2.uml.Class findClassInModel(org.eclipse.uml2.uml.Model model, String name){
		for (Element ne : model.getOwnedElements()) {
			if (ne instanceof NamedElement) {
				if (ne instanceof org.eclipse.uml2.uml.Class) {
					if(((org.eclipse.uml2.uml.Class) ne).getName().equals(name))
						return (org.eclipse.uml2.uml.Class) ne;
				}else if(ne instanceof org.eclipse.uml2.uml.Package){
					org.eclipse.uml2.uml.Class result = findClassInPackage((org.eclipse.uml2.uml.Package)ne,name);
					if(result != null)
						return result;
				}
			} else if (ne instanceof Model) {
				org.eclipse.uml2.uml.Class result = findClassInModel((Model)ne,name);
				if(result != null)
					return result;
			}
		}
		return null;
	}

	/**
	 * Find a class with a given name in a package.  
	 */
	public org.eclipse.uml2.uml.Class findClassInPackage(org.eclipse.uml2.uml.Package pack, String name){
		for (Element ne : pack.getOwnedElements()) {
			if (ne instanceof NamedElement) {
				//System.out.println(((NamedElement) ne).getName());
				if (ne instanceof org.eclipse.uml2.uml.Class) {
					if(((org.eclipse.uml2.uml.Class) ne).getName().equals(name))
						return (org.eclipse.uml2.uml.Class) ne;
				}else if(ne instanceof org.eclipse.uml2.uml.Package){
					org.eclipse.uml2.uml.Class result = findClassInPackage((org.eclipse.uml2.uml.Package)ne,name);
					if(result != null)
						return result;
				}	
			} else if (ne instanceof Model) {
				org.eclipse.uml2.uml.Class result = findClassInModel((Model)ne,name);
				if(result != null)
					return result;
			}
		}
		return null;
	}

	/**
	 * Debug function: prints info about a givent dataflow port.
	 */
	public void inspectDataFlowPort(Port port)
	{
		//
		Stereotype pst = port.getAppliedStereotypes().get(0);

		// Type du port
		if (port.getType()!= null) {
			java.lang.System.out.println("\t\t* type: "+port.getType().getName());
		}
		else {
			java.lang.System.err.println("\t\t\t* port "+port.getName()+" has no type ! ");
		}
		//
		//
		// A partir des attributs ci-dessous, on peut récupérer:
		// - la taille du buffer
		// - la direction (énuméré IN ou OUT)
		// - le protocole de synchronization (énuméré SYNCH ou ASYNCH ou UNDEFINED)
		//
		for (Property propSt : pst.getAllAttributes()) 
		{
			java.lang.System.out.println("\t\t* port stereotype has attribute: "+propSt.getName()+" - "+port.getValue(pst, propSt.getName()));
		}					

	}

	/**
	 * Debug function. Prints info about a given service port.
	 */
	public void inspectServicePort(Port port)
	{
		//
		Stereotype pst = port.getAppliedStereotypes().get(0);

		//
		if (port.getType()!= null) {
			java.lang.System.out.println("\t\t* type: "+port.getType().getName());
		}
		else {
			java.lang.System.err.println("\t\t\t* port "+port.getName()+" has no type ! ");
		}
		// A partir des attributs ci-dessous, on peut récupérer:
		// - le type d'interface(énuméré Provided ou Required)
		// - le protocole de synchronization (énuméré SYNCH ou ASYNCH ou UNDEFINED)
		//

		for (Property propSt : pst.getAllAttributes()) 
		{
			java.lang.System.out.println("\t\t* port stereotype has attribute: "+propSt.getName()+" - "+port.getValue(pst, propSt.getName()));
		}							
	}

	/**
	 * Debug function. Prints info about a given port.
	 */
	public void inspectPort(Port port)
	{
		if (isDataFlowPort(port))
		{
			inspectDataFlowPort(port);
		}
		else if (isServicePort(port)) 
		{
			inspectServicePort(port);
		}
		else {
			java.lang.System.err.println("UNKONWN PORT !");
		}
	}

	/**
	 * Debug function. Prints info about a given datatype.
	 */
	public void inspectDataType(DataType datatype) 
	{
		java.lang.System.out.println ("\t\t* data type: "+datatype.getName());		
	}

	/**
	 * Debug function.
	 */
	public void inspectClass(org.eclipse.uml2.uml.Class cl)
	{

		// super classes of this classes
		java.lang.System.out.println("\t* super classes: "+cl.getSuperClasses());

		// stereotypes of this class
		for (Stereotype st : cl.getAppliedStereotypes()) {
			java.lang.System.out.println("\t* applied stereotype: "+st.getName());
		}

		// properties of this class
		for (Property prop : cl.getAllAttributes()) {

			java.lang.System.out.println("\t* property: "+prop.getName());

			// This is a Port
			if (isPort(prop)) {
				inspectPort((Port)prop);
			}
			else {
				Type propType = prop.getType();
				if (isDataType(propType)) {
					java.lang.System.out.println("\t\t* property read from stereotype: "+prop.getName());
				}
				else if (isClass(propType)) {
					java.lang.System.out.println ("\t\t* class sub instance : "+propType.getName()+" - "+prop.getUpper()+" - "+prop.getLower());					
				}
				else 
				{
					java.lang.System.err.println("UNKONWN PROPERTY TYPE !");								
				}
			}
		}
		for (Connector connector : cl.getOwnedConnectors())
		{
			java.lang.System.out.println("\t* owned connector: "+connector.getName());
			for (ConnectorEnd cend : connector.getEnds()) 
			{
				if ((cend.getRole()!=null)&&(cend.getPartWithPort()!=null)) {
					java.lang.System.out.println("\t\t* from property: "+cend.getRole().getName()+" in instance "+cend.getPartWithPort().getName());
				}
				else {
					java.lang.System.err.println ("\t\t* Unconnected Port !");
					java.lang.System.out.println();
				}
			}
		}
		for (Operation op : cl.getAllOperations()) {
			java.lang.System.out.println("\t* operation: "+op.getName()+" - datatype: "+op.getDatatype()+" - interface: "+op.getInterface());
		}

	}

	/**
	 * Fonction de test pour inspecter un mod�le UML2
	 * @param model
	 * @return
	 */
	public Boolean inspectModel(Model model) {
		try {
			// model name
			java.lang.System.out.println("* model name: "+model.getName());

			//
			// Bibliothèque de DataTypes sera importée
			//
			for (PackageableElement elt : model.getImportedElements()) {
				java.lang.System.out.println("* model imported packageable element: "+elt);
			}
			//
			// Peut-être ?
			//
			for (org.eclipse.uml2.uml.Package elt : model.getImportedPackages()) {
				java.lang.System.out.println("* model imported package: "+elt);
			}
			//
			// Récupérer Package par Package si possible (cf méthodologie Outil Proteus) 
			//
			for (org.eclipse.uml2.uml.Package elt : model.getNestedPackages()) {
				java.lang.System.out.println("* model nested package: "+elt);
			}
			//
			// Parcours des éléments contenus dans le modèle
			//
			for (NamedElement elt : model.getMembers()) {
				java.lang.System.out.println("* model member: "+elt.getName());
				if (isClass(elt)) {
					inspectClass((org.eclipse.uml2.uml.Class)elt);
				}
				else if (isDataType(elt)) {
					inspectDataType((DataType)elt);
				}
				else if (isInterface(elt)) {
					java.lang.System.out.println("\t* interface definition : "+elt.getName());

				}
				else {
					java.lang.System.err.println("\t* unknown element: "+elt);
				}

			}

		}
		catch (Exception e) {
			java.lang.System.out.println(e);
			e.printStackTrace();
		}
		return true;
	}

	/**
	 * Is this property a DataFlow Port
	 * @param port
	 * @return is this a DataFlow port ?
	 */

	public Boolean isDataFlowPort(Port port) {
		DataFlowPort dfp = ElementUtil.getStereotypeApplication(port, DataFlowPort.class);
		if (dfp == null)
			return false;
		return true;
	}	

	public Boolean isServicePortProvided(Port port) {		
		try {
			ServicePort sp = (ServicePort) port;
			if (sp == null)
				return false;
			if (sp.getKind() == ServiceFlowKind.PROVIDED)
				return true;
			return false;
		} catch (Exception e) {
			java.lang.System.out.println("EXCEPTION caught:" + e.toString());
		}
		return false;		
	}




	/**
	 * Renvoie Vrai si le composant correspondant est un Actuator
	 * et Faux sinon
	 * @param Class
	 * @return Boolean
	 */	
	public Boolean isActuator(Class myClass) {		
		for (Stereotype st : myClass.getAppliedStereotypes())				
			if (st.getName().compareTo("ActuatorSystem")==0)
				return true;				
		return false;
	}	

	
	/**
	 * La liste de toutes les interfaces du Model
	 * @param model
	 * @return
	 */
	public List<Interface> getProteusInterfaceModels (Model model) {
		LinkedList<Interface> found_interface = new LinkedList<org.eclipse.uml2.uml.Interface>();
		for (Element elt : model.getOwnedElements()) {
			if (elt instanceof org.eclipse.uml2.uml.Interface) {
				Interface found_i = (org.eclipse.uml2.uml.Interface)elt;
				found_interface.add(found_i);;
			}
		}
		return found_interface;
	}

	/**
	 * Retourne la liste des ports de l'element 
	 * @param element
	 * @return Listes des Ports
	 */
	public List<Port> getAllPorts(Element elt) {
		LinkedList<Port> found_ports = new LinkedList<org.eclipse.uml2.uml.Port>();
		for (Element child : elt.getOwnedElements()) {
			if (child instanceof NamedElement && child instanceof org.eclipse.uml2.uml.Port) {
				Port found_port = (org.eclipse.uml2.uml.Port)child;
				found_ports.add(found_port);				
			}
		}
		return found_ports;
	}

	/**
	 * La liste des services de ports de l'element
	 * @param elt
	 * @return
	 */
	public List<Port> getServicePort(Element elt) {
		LinkedList<Port> found_input_ports = new LinkedList<org.eclipse.uml2.uml.Port>();
		for (Element child : elt.getOwnedElements()) {
			if (child instanceof NamedElement && child instanceof org.eclipse.uml2.uml.Port) {
				if (isServicePort((org.eclipse.uml2.uml.Port)child)) {
					Port found_port = (org.eclipse.uml2.uml.Port)child;
					found_input_ports.add(found_port);
				}
			}
		}
		return found_input_ports;
	}

	/**
	 * La listes des Input + Outport de l'element
	 * @param elt
	 * @return
	 */
	public List<Port> getInputOutputPorts(Element elt) {
		LinkedList<Port> found_ports = new LinkedList<org.eclipse.uml2.uml.Port>();
		for (Element child : elt.getOwnedElements()) {
			if (child instanceof NamedElement && child instanceof org.eclipse.uml2.uml.Port) {
				if ((isAnInputPort((org.eclipse.uml2.uml.Port)child)) || (isAnOutputPort((org.eclipse.uml2.uml.Port)child)))  {
					Port port = (org.eclipse.uml2.uml.Port)child;
					found_ports.add(port);
				}
			}
		}
		return found_ports;
	}

	/**
	 * La liste de toutes les propietes de la classe
	 * Hormis les sous-composants et les ports 
	 * @param c
	 * @param elt
	 * @return Listes de proprietes
	 */
	public List<Property> getProperties(Class c, Element elt) {
		LinkedList<Property> found_ports = new LinkedList<org.eclipse.uml2.uml.Property>();
		LinkedList<Property> properties = (LinkedList<Property>) getAllSubComponentsInClass(c);
		for (Element child : elt.getOwnedElements()) {
			if (child instanceof NamedElement					
					&& isProperty(child)
					&& (!(child instanceof org.eclipse.uml2.uml.Port))) {
				Property found_port = (org.eclipse.uml2.uml.Property)child;
				if (!(properties.contains(found_port))) 
					found_ports.add(found_port);				
			}
		}
		return found_ports;
	}

	/**
	 * 	La liste des operations de la classe
	 * @param myClass
	 * @return
	 */
	public List<Operation> getOperations(Class myClass) {
		return myClass.getAllOperations();
	}

	/**
	 * La liste des operations de l'interface
	 * @param myInterface
	 * @return
	 */
	public List<Operation> getInterfaceOperations(Interface myInterface) {
		return myInterface.getAllOperations();
	}

	/**
	 * La signature de l'operation op
	 * Type + Parametre
	 * @param op
	 * @return
	 */
	public String getOperationSignature (Operation op) {
		String res = "";
		int size = op.getOwnedParameters().size();
		if (size == 0)
			return res;

		for (int i=0; i<size - 1; i++) {
			Parameter param = op.getOwnedParameters().get(i);
			if (param.getDirection() != ParameterDirectionKind.get(ParameterDirectionKind.RETURN)) {
				res += getNameType(param.getType()) + " " + param.getName() + ", ";
			}
		}
		Parameter param = op.getOwnedParameters().get(size-1);
		if (param.getDirection() != ParameterDirectionKind.get(ParameterDirectionKind.RETURN)) {
			res += getNameType(param.getType()) + " " + param.getName();
		}
		return res;
	}

	/**
	 * La signature de l'operation op
	 * Juste le Type de chaque parametre
	 * @param op
	 * @return
	 */
	public String getOperationSignatureType (Operation op) {
		String res = "";
		int size = op.getOwnedParameters().size();

		int cpt = 0;
		for (Parameter param : op.getOwnedParameters()) {
			if (param.getDirection() != ParameterDirectionKind.get(ParameterDirectionKind.RETURN)) {
				cpt = cpt + 1;
			}
		}
		if (cpt == 0) 
			return "void";

		for (int i=0; i<size - 1; i++) {
			Parameter param = op.getOwnedParameters().get(i);
			if (param.getDirection() != ParameterDirectionKind.get(ParameterDirectionKind.RETURN)) {
				res += getNameType(param.getType()) + ", ";
			}
		}
		Parameter param = op.getOwnedParameters().get(size-1);
		if (param.getDirection() != ParameterDirectionKind.get(ParameterDirectionKind.RETURN)) {
			res += getNameType(param.getType());
		}
		return res;
	}

	/**
	 * La liste des arguments de l'operation
	 * @param op
	 * @return
	 */
	public String getOperationSignatureName (Operation op) {
		String res = "";				
		for (Parameter param : op.getOwnedParameters()) {
			if (param.getDirection() != ParameterDirectionKind.get(ParameterDirectionKind.RETURN)) {
				res += ".arg(\"" + param.getName() + "\", \"Description of parameter : \")";
			}
		}
		return res;
	}
	
	/**
	 * Le type de l'interface du service port : Requit ou Fournit 
	 * @param port
	 * @return
	 */
	public String getTypeServicePort(Port port) {		
		String res = "";
		try {
			ServicePort sp = ElementUtil.getStereotypeApplication(port, ServicePort.class);
			if (sp == null) {
				res += "null";
				return res;
			}
			if (sp.getKind() == ServiceFlowKind.REQUIRED) {
				res += "required";
				return res;
			}
			if (sp.getKind() == ServiceFlowKind.PROVIDED) {
				res += "provided";
				return res;
			}			
			return res;
		} catch (Exception e) {
			java.lang.System.out.println("EXCEPTION caught:" + e.toString());
		}
		return res;		
	}

	/**
	 * Test si l'interface du service port est 'fournit' 
	 * @param port
	 * @return
	 */
	public Boolean isPortProvided(Port port) {
		return (getTypeServicePort(port)).equals("provided");
	}

	/**
	 * Test si l'interface du service port est 'requit' 
	 * @param port
	 * @return
	 */
	public Boolean isPortRequired(Port port) {
		return (getTypeServicePort(port)).equals("required");
	}

	/**
	 * Le nom du type correspondant
	 * Et enleve le E quand il s'agit d'un EDataType 
	 * @param type
	 * @return
	 */
	public String getNameType(Type type) {		
		String owner = ((NamedElement)type.getOwner()).getName();
		String typeName = type.getName();
		if (typeName.equals(" ")) {
			return "void";
		}
		if (owner.equals(" ")) {
			return "void";
		}
		if((owner.equals("UMLPrimitiveTypes")) ||
				(owner.equals("uml"))) {
			if (typeName.equals("Boolean"))
				return "bool";
			else
				return typeName.toLowerCase();
		}		
		if(owner.equals("ecore")) {
			String tn = typeName.substring(1).toLowerCase();

			if (tn.equals("boolean")) 
				return "bool";			
			else
				return typeName.substring(1).toLowerCase();
		}
		if (owner.contains("datatype")){
			return getFullDataType(type)+"::"+typeName;
		}
		return typeName;		
	}

	
	/**
	 * Get root model for the current model
	 * @param model input model
	 * @return root model of this model, if not, return itself
	 */
	public Model getRootModel(Model model)
	{
		if (model.getNamespace() instanceof Model)
			return getRootModel((Model) model.getNamespace());
		else 
			return model;
	}

	/**
	 * Get opposite port of the current port, for ex; if A and B are linked together, and the current port is A,
	 * then the result it B
	 * @param p1 the port to get opposite port (A)
	 * @return opposite port of the current port (B)
	 */
	public Port getOppositePort(Port p1)
	{
		if (p1.getEnds().size()>0) {
			Connector conn = (Connector)p1.getEnds().get(0).getOwner();
			ConnectorEnd e1 = conn.getEnds().get(0);
			ConnectorEnd e2 = conn.getEnds().get(1);
			Port p2 = null;
			java.lang.System.out.println("p1="+p1.getName());
			Property c2 = null;
			if (e1.getRole() == p1)
			{
				p2 = (Port)e2.getRole();
				c2 = (Property)e2.getPartWithPort();
				java.lang.System.out.println("1 - p2="+p2.getName()+", c2="+c2.getName());
			}
			else if (e2.getRole() == p1) {
				p2 = (Port)e1.getRole();
				c2 = (Property)e1.getPartWithPort();
				java.lang.System.out.println("2 - p2="+p2.getName()+", c2="+c2.getName());
			}
			return p2;
		}
		else {
			return null;
		}
	}	

	public String getContainer(Model model)
	{
		List<NamedElement> found_elts = getProteusComponentModels(model);
		for (NamedElement e : found_elts)
		{
			//dont have both input and output port
			if (getInputOutputPorts(e).isEmpty() && getOutputPortsForElement(e).isEmpty())
				return e.getName();
		}
		// null if not found
		return null;
	}

	public String getNameSpace(Model model)
	{
		List<NamedElement> systems = getSystems(model);
		if (systems == null)
		{
			return null;
		}
		NamedElement system = systems.get(0);
		return ((Class)system).getNamespace().getName();		
	}

	public List<NamedElement> getSensors(Model model)
	{
		LinkedList<NamedElement> found_elts = new LinkedList<NamedElement>();
		found_elts.addAll(getElementsWithStereotype(model,"Sensor"));
		found_elts.addAll(getElementsWithStereotype(model,"SensorSystem"));		
		found_elts.addAll(getElementsWithStereotype(model,"CameraSystem"));
		found_elts.addAll(getElementsWithStereotype(model,"LidarSystem"));
		found_elts.addAll(getElementsWithStereotype(model,"GpsSystem"));		

		return found_elts;
	}

	public List<NamedElement> getActuators(Model model)
	{
		LinkedList<NamedElement> found_elts = new LinkedList<NamedElement>();
		found_elts.addAll(getElementsWithStereotype(model,"Actuator"));
		found_elts.addAll(getElementsWithStereotype(model,"ActuatorSystem"));
		found_elts.addAll(getElementsWithStereotype(model,"MotorizationSystem"));
		found_elts.addAll(getElementsWithStereotype(model,"WheelSystem"));
		found_elts.addAll(getElementsWithStereotype(model,"EngineSystem"));

		return found_elts;
	}

	public List<NamedElement> getSystems(Model model)
	{
		LinkedList<NamedElement> found_elts = new LinkedList<NamedElement>();
		found_elts.addAll(getElementsWithStereotype(model,"Environment"));
		found_elts.addAll(getElementsWithStereotype(model,"Robotic"));
		found_elts.addAll(getElementsWithStereotype(model,"RoboticSystem"));
		found_elts.addAll(getElementsWithStereotype(model,"Software"));
		return found_elts;
	}	

	public List<String> getOppositeComponents(Element elt)
	{
		String item = "";
		LinkedList<String> found_elts = new LinkedList<String>();
		if (getAllPorts(elt) == null)
			return null;
		for (Port port : getAllPorts(elt))
		{
			Port oppositePort = getOppositePort(port);
			if (oppositePort != null)
			{

				if (isSensorSystem(oppositePort.getClass_()))
				{
					item = getRootModel(oppositePort.getModel()).getName() + "/" +oppositePort.getClass_().getName();
					if (!found_elts.contains(item))
						found_elts.add(item);	

				}
				else
				{
					item = oppositePort.getClass_().getName();
					if (!found_elts.contains(item))
						found_elts.add(item);
				}

			}
		}
		return found_elts;
	}

	public Boolean isSensorSystem(Class myClass) {		
		for (Stereotype st : myClass.getAppliedStereotypes())				
			if (st.getName().equalsIgnoreCase("Sensor") || 
					st.getName().equalsIgnoreCase("SensorSystem") ||
					st.getName().equalsIgnoreCase("GpsSystem") ||
					st.getName().equalsIgnoreCase("LidarSystem") ||
					st.getName().equalsIgnoreCase("CameraSystem") )
				return true;				
		return false;
	}

	public Class getclass(Property x) {	
		return (Class)x.getType();	
	}	

	public Boolean isEmptyType(Element elt) {
		return (((TypedElement) elt).getType() == null);
	}

	public Boolean isEmptyType(Operation op) {
		return (op.getType() == null);
	}	
	
//Returns true if the type of the port is a Data type (i.e: defined by the user) 
	public Boolean isEDataTypeOfPort(Port port)
	{
		Type t=(Type)port.getType();
		EList<Stereotype> pst_list = t.getAppliedStereotypes();
		for (Stereotype st : pst_list) {
			if(st.getName().equals("EDataType"))
			{
				return true;
			}
		}
		return false;		
	}
//Returns true if the type of the property is a Data type (i.e: defined by the user) 
	public Boolean isEDataTypeOfProperty(Property property)
	{
		Type t=(Type)property.getType();
		EList<Stereotype> pst_list = t.getAppliedStereotypes();
		for (Stereotype st : pst_list) {
			if(st.getName().equals("EDataType"))
			{
				return true;
			}
		}
		return false;
	}

//Returns true if the type of the operation is a Data type (i.e: defined by the user) 
	public Boolean isEDataTypeOfOperation(Operation operation) {
		Type t=(Type)operation.getType();			
		EList<Stereotype> pst_list = t.getAppliedStereotypes();
		for (Stereotype st : pst_list) {
			if(st.getName().equals("EDataType"))
			{
				return true;
			}
		}
		return false;
	}

	public List<StateMachine> getStateMachines (Model model){
		List<StateMachine> lsm = new LinkedList<StateMachine>();
		for(NamedElement ne : model.getMembers()){
			if(ne instanceof StateMachine){
				lsm.add((StateMachine) ne);
			}
		}
		return lsm;
	}
	
	
	/**
	 * Check if a component model has a state machine inside
	 * @param c
	 * @return true, if it contains one or more state machin inside, false if not
	 */
	public Boolean hasStateMachine(Class c)
	{
		for (NamedElement name : c.getMembers())
		{
			if (name instanceof StateMachine)
				return true;
		}
		return false;
	}
	
	

	public LinkedList<java.lang.String> setRttLibraries(Element c){
		
		LinkedList<Element>	allelem =new LinkedList<Element>();
		
		for(Element elt: c.allOwnedElements()){
			if(!isDataType(elt))
			{
				allelem.add(elt);
			}
		}
		
		for(Element elt: allelem){

		if(isPort(elt))
		{
			String res="";
			Port p=(Port)elt;
			//if(!isEDataTypeOfPort(p))
			//{
			String parentType = getParentType(p).toString();
			//ROS topics
			if(parentType.contains("std")||parentType.contains("sensor")||parentType.contains("stereo")||parentType.contains("geometry")||
				parentType.contains("nav")||parentType.contains("actionLib")){	
				res="import ("+'"'+"rtt_"+parentType+'"'+")\n";
				if(!rttData.contains(res))
					rttData.add(res);
			}
		
		}
		}
		return rttData;
	}
	
	
	public LinkedList<java.lang.String> setLibraries(Element c){
		
		LinkedList<Element>	allelem =new LinkedList<Element>();
		boolean includePort= false;
		boolean includeOperation= false;
		boolean includeDataTypes = false;
		for(Element elt: c.allOwnedElements()){
			if(!isDataType(elt))
			{
				allelem.add(elt);
			}
		}
		
		for(Element elt: allelem){

		if(isPort(elt))
		{
			if(!includePort){	
				alldata.add("#include <rtt/Port.hpp>\n");
				includePort= true;
			 }

			String res="";
			Port p=(Port)elt;
			//if(!isEDataTypeOfPort(p))
			//{
			String parentType = getParentType(p).toString();
			//ROS topics
			if(parentType.contains("std")||parentType.contains("sensor")||parentType.contains("stereo")||parentType.contains("geometry")||
				parentType.contains("nav")||parentType.contains("actionLib")){	
				res="#include<"+parentType+"/"+p.getType().getName()+".h>\n";
				res = res + "\n";
				if(!alldata.contains(res))
					alldata.add(res);
			}
			//user data type type
			/*else if(isADataType(p.getType().getName()) && !includeDataTypes){
				res = "#include"+'"'+parentType+".h"+'"';
				res = res + "\n";
				includeDataTypes = true;
			}*/		
			
			//}
		}
		
		if( isProperty(elt))
		{    String res="";
		Property p=(Property)elt;
		//if(!isEDataTypeOfProperty(p))
		//{
			String parentType = getParentType(p).toString();
			if(parentType.contains("std")||parentType.contains("sensor")||parentType.contains("stereo")||parentType.contains("geometry")||
					parentType.contains("nav")||parentType.contains("actionLib"))
			res="#include<"+parentType+"/"+p.getType().getName()+".h>";
			else if(isADataType(p.getType().getName()) && !includeDataTypes){
				res = "#include"+'"'+parentType+".hpp"+'"'+"\n";
				res = res + "\n";
				includeDataTypes = true;
				if(!alldata.contains(res))
					alldata.add(res);
			}
			
		//}
		}
		if(isOperation(elt))
		{
			if(!includeOperation)
			{	Interface I = (Interface) elt.getOwner();
				alldata.add("#include <rtt/Operation.hpp>\n");
				alldata.add("#include "+I.getName()+".h"+'"'+"\n");
				includeOperation = true;
			}
			}
		}
		return alldata;
		
	}
	
	public Boolean isOperation(Element prop) {
		//System.out.println(((NamedElement)prop).getName()+" - isPort: "+(prop instanceof Port)+" "+prop.getAppliedStereotypes());
		return prop instanceof Operation;

	}

	public List<Property> getProperties1(Element elt) {
		LinkedList<Property> found_props = new LinkedList<org.eclipse.uml2.uml.Property>();
		for (Element child : elt.getOwnedElements()) {
		if (child instanceof NamedElement 
		&& child instanceof org.eclipse.uml2.uml.Property
		&& isProperty(child)
		&& (!(child instanceof org.eclipse.uml2.uml.Port))) {
		Property found_prop = (org.eclipse.uml2.uml.Property)child;
		found_props.add(found_prop);
		}
		}
		return found_props;
		}
	
	public String getParentType(Element e){
		String res = "";
		if(isPort(e))
		{
			Port p=(Port)e;
			NamedElement n=(NamedElement)p.getType().getOwner();
			res=n.getName();
			res=res.replaceAll(" ", "_");
			res=res.replaceAll("datatypes", "msgs");
		}
		if(isProperty(e))
		{
			Property p=(Property)e;
			NamedElement n=(NamedElement)p.getType().getOwner();
			res=n.getName();
			res=res.replaceAll(" ", "_");
			res=res.replaceAll("datatypes", "msgs");
		}
		return res;
	}
	public void addDataType(String s){
		dataTypes.add(s);
		return ;
	}
	
	public boolean isADataType(String s)
	{
		boolean found = false;
		for(String elt: dataTypes){
			if (elt.toString().equals(s))
				found = true;
		}
		return found;
	}
	/**
	 * Function to get a component's state machines
	 * @param clazz the class in which the component is described
	 * @return the list of found state machines 
	 */
	public List<StateMachine> getStateMachines (Class clazz){
		List<StateMachine> stateMachinesList = new LinkedList<StateMachine>();
		for(NamedElement element : clazz.getMembers()){
			if(element instanceof StateMachine){
				stateMachinesList.add((StateMachine) element);
			}
		}
		return stateMachinesList;
	}

	/**
	 * Function to get all states in a StateMachine
	 * @param stateMachine the state machine from which we need the states
	 * @return the list of states in this state machine
	 */
	public List<State> getStates(StateMachine stateMachine){
		List<State> stateList = new LinkedList<State>();
		for(Vertex v : stateMachine.getRegions().get(0).getSubvertices()){
			if(v instanceof State)
				stateList.add((State) v);
		}
		return stateList;
	}

	/**
	 * Function to get all transitions in a StateMachine
	 * @param stateMachine the state machine from which we need the transitions
	 * @return the list of transitions in this state machine
	 */
	public List<Transition> getTransitions(StateMachine stateMachine){
		List<Transition> transitionList = new LinkedList<Transition>();
		transitionList.addAll(stateMachine.getRegions().get(0).getTransitions());
		return transitionList;
	}

	/**
	 * Predicate to know if a state possesses entry function
	 * @param state the state in which we look
	 * @return true if there is an entry function, else false 
	 */
	public boolean hasEntry(State state){
		return state.getEntry()!=null;
	}

	/**
	 * Predicate to know if a state possesses exit function
	 * @param state the state in which we look
	 * @return true if there is an exit function, else false 
	 */
	public boolean hasExit(State state){
		return state.getExit()!=null;
	}

	/**
	 * Function to get entry function's body if written in the model
	 * @param state the state from which we get the function's body
	 * @return a string containing the body
	 */
	public String getEntry(State state){
		if(hasEntry(state)){
			return ((FunctionBehavior) state.getEntry()).getBodies().get(0);
		}else return "";
	}


	/**
	 * Function to get exit function's body if written in the model
	 * @param state the state from which we get the function's body
	 * @return a string containing the body
	 */
	public String getExit(State state){
		if(hasExit(state)){
			return  ((FunctionBehavior) state.getExit()).getBodies().get(0);
		}
		else return "";
	}

	/**
	 * Predicate to know if a transition possesses triggers
	 * @param transition the transition in which we look
	 * @return true if there is at least one trigger specified in the model, else false
	 */
	public boolean hasTriggers(Transition transition){
		return ((transition.getTriggers().size())>0);
	}

	/**
	 * Predicate to know if the specified Behavior is a state machine
	 * @param b the behavior in test
	 * @return true if this is a state machine, else false
	 */
	public boolean isFSM(Behavior b ){
		return b instanceof StateMachine;
	}

	/**
	 * Predicate to know if a state possesses a function run (doo)
	 * @param state the state in which we look
	 * @return true if there is a run function
	 */
	public boolean hasRun(State state){
		return state.getDoActivity()!=null;
	}

	/**
	 * Function to get run (doo) function's body if written in the model
	 * @param state the state from which we get the function's body
	 * @return a string containing the body
	 */
	public String getRun(State state){
		return ((FunctionBehavior)state.getDoActivity()).getBodies().get(0);
	}

	/**
	 * Function to get the LUA type corresponding to the given Type
	 * @param type the type to convert
	 * @return a string representing the type for LUA language
	 */
	public String getLUAType(Type type){
		String result="";
		String owner = ((NamedElement)type.getOwner()).getName().replace("datatypes", "msgs");
		String typeName=type.getName();
		if((owner.equals("UMLPrimitiveTypes")) ||
				(owner.equals("uml"))) {
			if(typeName.matches("(?i).*int.*")//Int, UInt, int32, uint16 and so on
					|| typeName.matches("(?i).*float.*")//float, float32 and so on
					|| typeName.matches("(?i).*double.*"))
				return "number";
			if (typeName.equals("Boolean"))
				return "bool";
			else
				return typeName.toLowerCase();
		}		
		else if(owner.equals("ecore")) {//edatatypes
			if (typeName.equals("Boolean"))
				return "bool";
			else
				return typeName.substring(1).toLowerCase();
		}	

		else {result+="/"+owner+"/";}//ros types
		result+=typeName;
		return result;

	}


	/**
	 * Function to generate variable that may be used in lua fsm
	 * for reading/writing to the component's ports
	 * @param elt the component that embeds the fsm
	 * @return the LUA string with all variable having a LUA type
	 * and a different name each
	 */
	public String generateVariables(Element elt){
		int cpt=0;
		String toReturn="";
		for(Port port : getInputOutputPorts(elt)){
			toReturn+="local variable_"+port.getType().getName().toLowerCase()+cpt
					+"= rtt.Variable(\""+getLUAType(port.getType())+"\")\n";
			cpt++;			
		}


		return toReturn;
	}

	public String getFullDataType(Type type){
		String res="";
		NamedElement n=(NamedElement)type.getOwner();
		res=n.getName();
		res=res.replaceAll(" ", "_");
		res=res.replaceAll("datatypes", "msgs");
		return res;
	}


	
	
}