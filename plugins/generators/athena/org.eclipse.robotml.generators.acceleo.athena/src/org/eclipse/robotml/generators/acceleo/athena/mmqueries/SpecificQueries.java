package org.eclipse.robotml.generators.acceleo.athena.mmqueries;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.papyrus.RobotML.Algorithm;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.robotml.generators.acceleo.mmqueries.ArchitectureQueries;
import org.eclipse.robotml.generators.acceleo.mmqueries.FSMQueries;
import org.eclipse.robotml.generators.acceleo.mmqueries.GeneralQueries;
import org.eclipse.robotml.generators.acceleo.athena.files.configGenerator;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interval;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Vertex;

import org.eclipse.papyrus.uml.tools.utils.ElementUtil;

public class SpecificQueries {

	
	static private HashSet<String> temp = new HashSet<String>();
	static private HashMap<String, String> _mapDeclaration = new HashMap<String, String>();
	static final private String _pathProperty = "path";
	static final private String _operationProperty = "operation";
	static final private String _argumentsProperty = "arguments";
	static final private String _interactionTag = "interaction";
	
	static final private String _arrayKeyword = "array";
	static final private String _mapKeyword = "map";
	static final private String _vectorKeyword = "vector";
	static final private String _unionKeyword = "union";
	
	static private HashSet<NamedElement> _basicTypeUsed = new HashSet<NamedElement>();
	static private HashSet<NamedElement> _enumTypeUsed = new HashSet<NamedElement>();
	static private HashSet<NamedElement> _containerTypeUsed = new HashSet<NamedElement>();
	static private HashSet<NamedElement> _structTypeUsed = new HashSet<NamedElement>();
	static private HashSet<NamedElement> _defineTypeUsed = new HashSet<NamedElement>();
	static private HashSet<NamedElement> _unionTypeUsed = new HashSet<NamedElement>();
	
	static private void initDeclarationMap()
	{
		if(SpecificQueries._mapDeclaration.isEmpty())
		{
			String decl = "";
			//Int64
			decl = "language CPP : \"long int\" = \"0\"\r\n";
			decl += "language VLE : \"Integer\" = \"0\"";
			SpecificQueries._mapDeclaration.put("Int64", decl);
			//Int32
			decl = "language CPP : \"int\" = \"0\"\r\n";
			decl += "language VLE : \"Integer\" = \"0\"";
			SpecificQueries._mapDeclaration.put("Int32", decl);
			//Int16
			decl = "language CPP : \"short int\" = \"0\"\r\n";
			decl += "language VLE : \"Integer\" = \"0\"";
			SpecificQueries._mapDeclaration.put("Int16", decl);
			//Int8
			decl = "language CPP : \"char\" = \"0\"\r\n";
			decl += "language VLE : \"Integer\" = \"0\"";
			SpecificQueries._mapDeclaration.put("Int8", decl);
			//UInt64
			decl = "language CPP : \"unsigned long int\" = \"0\"\r\n";
			decl += "language VLE : \"Integer\" = \"0\"";
			SpecificQueries._mapDeclaration.put("UInt64", decl);
			//UInt32
			decl = "language CPP : \"unsigned int\" = \"0\"\r\n";
			decl += "language VLE : \"Integer\" = \"0\"";
			SpecificQueries._mapDeclaration.put("UInt32", decl);
			//UInt16
			decl = "language CPP : \"unsigned short int\" = \"0\"\r\n";
			decl += "language VLE : \"Integer\" = \"0\"";
			SpecificQueries._mapDeclaration.put("UInt16", decl);
			//UInt8
			decl = "language CPP : \"unsigned char\" = \"0\"\r\n";
			decl += "language VLE : \"Integer\" = \"0\"";
			SpecificQueries._mapDeclaration.put("UInt8", decl);
			//Float32
			decl = "language CPP : \"float\" = \"0.f\"\r\n";
			decl += "language VLE : \"Double\" = \"0.0\"";
			SpecificQueries._mapDeclaration.put("Float32", decl);
			//Float64
			decl = "language CPP : \"double\" = \"0.\"\r\n";
			decl += "language VLE : \"Double\" = \"0.0\"";
			SpecificQueries._mapDeclaration.put("Float64", decl);
			//String
			decl = "include MATLAB : \"matrix.h\"\r\n";
			decl += "include CPP : \"string\"\r\n";
			decl += "language MATLAB : \"java.lang.String\" = '\"\"'\r\n";
			decl += "language CPP : \"std::string\" = '\"\"'\r\n";
			decl += "language VLE : \"String\" = \"0\"";
			SpecificQueries._mapDeclaration.put("String", decl);
			//Pointer
			decl = "include MATLAB : \"matrix.h\"\r\n";
			decl += "language MATLAB : \"mxINT32_CLASS\" = \"NULL\"\r\n";
			decl += "language CPP : \"void*\" = \"NULL\"";
			SpecificQueries._mapDeclaration.put("Pointer", decl);
			//Logical
			decl = "include MATLAB : \"matrix.h\"\r\n";
			decl += "language MATLAB : \"mxINT8_CLASS\" = \"0\"\r\n";
			decl += "language CPP : \"bool\" = \"false\"\r\n";
			decl += "language VLE : \"Boolean\" = \"false\"";
			SpecificQueries._mapDeclaration.put("Logical", decl);
			//Int
			decl = "include MATLAB : \"matrix.h\"\r\n";
			decl += "language MATLAB : \"mxINT32_CLASS\" = \"0\"\r\n";
			decl += "language CPP : \"int\" = \"0\"\r\n";
			decl += "language VLE : \"Integer\" = \"0\"";
			SpecificQueries._mapDeclaration.put("Int", decl);
			//Long
			decl = "include MATLAB : \"matrix.h\"\r\n";
			decl += "language MATLAB : \"mxINT32_CLASS\" = \"0\"\r\n";
			decl += "language CPP : \"long\" = \"0\"\r\n";
			decl += "language VLE : \"Integer\" = \"0\"";
			SpecificQueries._mapDeclaration.put("Long", decl);
			//Real
			decl = "include MATLAB : \"matrix.h\"\r\n";
			decl += "language MATLAB : \"mxDOUBLE_CLASS\" = \"0\"\r\n";
			decl += "language CPP : \"double\" = \"0.\"\r\n";
			decl += "language VLE : \"Double\" = \"0.0\"";
			SpecificQueries._mapDeclaration.put("Real", decl);
			//Time
			decl = "include CPP : \"time.h\"\r\n";
			decl += "language CPP : \"time_t*\" = \"NULL\"";
			SpecificQueries._mapDeclaration.put("Time", decl);
			//Real64
			decl = "include MATLAB : \"matrix.h\"\r\n";
			decl += "language MATLAB : \"mxDOUBLE_CLASS\" = \"0\"\r\n";
			decl += "language CPP : \"double\" = \"0.\"\r\n";
			decl += "language VLE : \"Double\" = \"0.0\"";
			SpecificQueries._mapDeclaration.put("Real64", decl);
			//Real32
			decl = "language CPP : \"float\" = \"0.f\"\r\n";
			decl += "language VLE : \"Double\" = \"0.0\"";
			SpecificQueries._mapDeclaration.put("Real32", decl);
		}
	}
	
	/**
	 * Récupérer toutes les classes du modèle
	 * @param model
	 * @return
	 */
	static public java.util.HashSet<org.eclipse.uml2.uml.Class> getAllModelClasses(NamedElement model) {	
		java.util.HashSet<org.eclipse.uml2.uml.Class> found_elts = new HashSet<org.eclipse.uml2.uml.Class>();
		if(model != null)
		{
		if(configGenerator.isAutomaticGeneration()) 		
		{
			for (Element ne : model.getOwnedElements()) 
			{
				if (ne instanceof org.eclipse.uml2.uml.Class) 
				{
					found_elts.add((org.eclipse.uml2.uml.Class)ne);
				}
				else if(ne instanceof org.eclipse.uml2.uml.PackageImport)
				{
					PackageImport imp = (PackageImport)ne;
					found_elts.addAll(getAllModelClasses((NamedElement)imp.getImportedPackage()));
				}
				else if(ne instanceof org.eclipse.uml2.uml.Package)
				{
					found_elts.addAll(getAllModelClasses((NamedElement)ne));
				}
			}
		} 
		else 
		{
			for (Element ne : model.getOwnedElements()) 
			{
				if (ne instanceof NamedElement) 
				{
					if (ne instanceof org.eclipse.uml2.uml.Class) 
					{
						found_elts.add((org.eclipse.uml2.uml.Class)ne);
					}
//					else if(ne instanceof org.eclipse.uml2.uml.PackageImport)
//					{
//						PackageImport imp = (PackageImport)ne;
//						found_elts.addAll(getAllModelClasses((NamedElement)imp.getImportedPackage()));
//					}
					else
					{
						found_elts.addAll(getAllModelClasses((NamedElement)ne));					
					}
				} 
				else if (ne instanceof Model)
				{
					found_elts.addAll(getAllModelClasses((Model)ne));
				}
			}
		}
		}
		return found_elts;
	}


	/**
	 * Rechercher toutes les classes du modèle et les ordonner par l'arbre d'héritage.
	 * @param model
	 * @return
	 */
	static public List<NamedElement> getModelClasses(NamedElement model) {		
		// Get classes
		java.util.HashSet<org.eclipse.uml2.uml.Class> found_elts = getAllModelClasses(model);
		//		System.out.println("# found "+found_elts.size()+" elements");
		// Sort classes 
		LinkedList<org.eclipse.uml2.uml.Class> elts = new LinkedList<org.eclipse.uml2.uml.Class>();
		// sécurite pour ne pas partir ds une boucle infinie
		int loops = found_elts.size()*10;
		// boucle sur les éléments trouvés
		while((found_elts.size()>0)&&(loops>0))
		{
			//			System.out.println("remaining "+found_elts.size()+" elements");
			for (org.eclipse.uml2.uml.Class c1 : found_elts)		
			{
				//				System.out.println("  processing class name:"+c1.getName());
				int index = (c1.getSuperClasses().size()==0)?0:-1;
				int superClassesDefined = 0;
				for (org.eclipse.uml2.uml.Class c2 : c1.getSuperClasses())
				{	
					if ((elts.contains(c2))) 
					{
						index = Math.max(index, elts.indexOf(c2)+1);
						superClassesDefined+=1;
					}
					//					System.out.println("     superclass name: "+c2.getName()+", index: "+index+", "+found_elts.contains(c2)+", "+elts.contains(c2));
				}
				if ((index>=0)&&(superClassesDefined==c1.getSuperClasses().size()))
				{
					//					System.out.println("     added, index: "+index);
					elts.add(index, c1);
					found_elts.remove(c1);
					break;
				}
				loops--;
			}

		}

		// Return list of classes
		LinkedList<NamedElement> res = new LinkedList<NamedElement>();
		res.addAll(elts);
		return res;
	}

	/**
	 * Renseigner la superclasse d'une classe
	 * soit un stéréotype soit la classe dont on hérite
	 * @param c1
	 * @return
	 */
	static public org.eclipse.uml2.uml.Class getSuperClass(org.eclipse.uml2.uml.Class c1)
	{
		if (c1.getSuperClasses().size()>0) {
			return c1.getSuperClasses().get(0);
		}
		else if (c1.getAppliedStereotypes().size()>0) {
			return c1.getAppliedStereotypes().get(0);
		}
		return null;
	}

	/**
	 * Rechercher tous les datatypes utilisés par le modèle
	 * @param model
	 * @return
	 */
	static public java.util.HashSet<org.eclipse.uml2.uml.DataType> getAllModelDataTypes(NamedElement model) {	
		java.util.HashSet<org.eclipse.uml2.uml.DataType> found_elts = new HashSet<org.eclipse.uml2.uml.DataType>();
		for (Element elt : model.getOwnedElements()) {
			if (elt instanceof NamedElement) {
				NamedElement ne = (NamedElement)elt;
				if (ne instanceof org.eclipse.uml2.uml.DataType) {
					//					System.out.println("datatype "+ne.getName());
					DataType dt = (org.eclipse.uml2.uml.DataType)ne;
					found_elts.add(dt);
//					found_elts.addAll(getAllModelDataTypes(dt));					
				}
				else if (ne instanceof org.eclipse.uml2.uml.Enumeration) {
					//					System.out.println("datatype "+ne.getName());
					Enumeration dt = (org.eclipse.uml2.uml.Enumeration)ne;
					found_elts.add(dt);					
				}
				else {
					//					System.out.println("other "+ne.getName());
					found_elts.addAll(getAllModelDataTypes(ne));					
				}
			} 
			else if(elt instanceof PackageImport)
			{
				PackageImport imp = (PackageImport)elt;
				found_elts.addAll(getAllModelDataTypes(imp.getImportedPackage()));
			}
		}		
		return found_elts;
	}

	/**
	 * Rechercher tous les types de données utilisés par le modèle et les ordonner (héritage)
	 * @param model
	 * @return
	 */
	static public List<NamedElement> getAllDataTypes(NamedElement model) 
	{
		//
		LinkedList<NamedElement> res = new LinkedList<NamedElement>();
		try {
			//
			java.util.HashSet<org.eclipse.uml2.uml.DataType> found_elts = getAllModelDataTypes(model);
			res.addAll(found_elts);
		} catch (Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		// Return list of classes
		return res;
	}

	/**
	 * Rechercher tous les types de données simples utilisés par le modèle 
	 * @param model
	 * @return
	 */
	static public List<NamedElement> getAllBasicDataTypes(NamedElement ne) 
	{
		return new LinkedList<NamedElement>(SpecificQueries._basicTypeUsed);
	}
	
	/**
	 * Recherche tous les types "container"
	 * @param model
	 * @return
	 */
	static public List<NamedElement> getContainerDataTypes(NamedElement ne)
	{
		return new LinkedList<NamedElement>(SpecificQueries._containerTypeUsed);
	}
	
	/**
	 * Rechercher tous les énumérations utilisés par le modèle et les ordonner (héritage)
	 * @param model
	 * @return
	 */
	static public List<NamedElement> getAllEnumeration(NamedElement ne) 
	{
		return new LinkedList<NamedElement>(SpecificQueries._enumTypeUsed);
	}

	/**
	 * Rechercher tous les types de données simples utilisés par le modèle 
	 * @param model
	 * @return
	 */
	static public List<NamedElement> getAllStructuredDataTypes(NamedElement ne) 
	{
		return new LinkedList<NamedElement>(SpecificQueries._structTypeUsed);
	}
	
	/**
	 * Return unknwon datatype
	 * @param model
	 * @return
	 */
	static public List<NamedElement> getUnknownDataTypes(NamedElement model)
	{
		LinkedList<NamedElement> res = new LinkedList<NamedElement>();
		try
		{
			java.util.HashSet<org.eclipse.uml2.uml.DataType> found_elts = SpecificQueries.getAllModelDataTypes(model);
//			System.out.println("Nb datatype : " + found_elts.size());
			found_elts.removeAll(SpecificQueries.getAllBasicDataTypes(model));
			found_elts.removeAll(SpecificQueries.getAllStructuredDataTypes(model));
			found_elts.removeAll(SpecificQueries.getAllEnumeration(model));
			found_elts.removeAll(SpecificQueries.getContainerDataTypes(model));
			found_elts.removeAll(SpecificQueries.getDefineType(model));
			found_elts.removeAll(SpecificQueries.getUnionType(model));
			
			res.addAll(found_elts);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return res;
	}
	
	/**
	 * Recherche les sous modèles
	 * @param modelne
	 * @return
	 */
	static public List<NamedElement> getSubModels(NamedElement model)
	{
		LinkedList<NamedElement> res = new LinkedList<NamedElement>();

		for(Element elt : model.getOwnedElements())
		{
			if(elt instanceof org.eclipse.uml2.uml.Model)
			{
				res.add((NamedElement) elt);
			}
		}

		return res;
	}
	
	/**
	 * Get the model's operation list
	 * @param model
	 * @return Operation list
	 */
	static public List<NamedElement> getOperationsFromModel(NamedElement model)
	{
		/*
		 * Entry point, need this to clear the hashset. It be used to delete the duplicate method in the model
		 */
		SpecificQueries.temp.clear();
		
		List<NamedElement> list = SpecificQueries.findAllOperationModel(model);
		
		/*
		 * Remove the processing
		 */
		LinkedList<NamedElement> buffer = new LinkedList<NamedElement>(); 
		for(NamedElement elt : list)
		{
			if(SpecificQueries.isProcessing((Operation)elt) == true)
			{
				buffer.add(elt);
			}
		}
		list.removeAll(buffer);
		
		return list;
	}
	
	/**
	 * Find the model's operation. If a duplicate method is detected, it will be ignored!
	 * @param model
	 * @return Operation list
	 */
	static private List<NamedElement> findAllOperationModel(NamedElement model)
	{
		LinkedList<NamedElement> res = new LinkedList<NamedElement>();
		
		for(Element elt : model.getOwnedElements())
		{
			if(elt instanceof org.eclipse.uml2.uml.Package ||
					elt instanceof org.eclipse.uml2.uml.Model ||
					elt instanceof org.eclipse.uml2.uml.Class)
			{
				res.addAll(SpecificQueries.findAllOperationModel((NamedElement)elt));
			}
			else if(elt instanceof org.eclipse.uml2.uml.PackageImport)
			{
				PackageImport imp = (PackageImport)elt;
				res.addAll(SpecificQueries.findAllOperationModel((NamedElement)imp.getImportedPackage()));
			}
			else if(elt instanceof org.eclipse.uml2.uml.Operation)
			{
				String opName = ((org.eclipse.uml2.uml.Operation) elt).getName();
				if(SpecificQueries.temp.contains(opName) == false)
				{
					SpecificQueries.temp.add(opName);
					res.add((NamedElement)elt);
				}
			}
		}
		
		return res;
	}
	
	/**
	 * Check if the property have a default value
	 * @param prop
	 * @return result of check
	 */
	static public Boolean hasDefaultValue(Property prop)
	{
		return (prop.getDefaultValue() != null);
	}
	
	/**
	 * Return the processing list of the model
	 * @param model
	 * @return processing list
	 */
	static public List<NamedElement> getProcessingFromModel(NamedElement model)
	{
		/*
		 * Entry point, need this to clear the hashset. It be used to delete the duplicate method in the model
		 */
		SpecificQueries.temp.clear();
		
		List<NamedElement> list = findAllOperationModel(model);
		
		/*
		 * Remove operations
		 */
		LinkedList<NamedElement> buffer = new LinkedList<NamedElement>();
		for(NamedElement elt : list)
		{
			if(SpecificQueries.isProcessing((Operation)elt) == false)
			{
				if(SpecificQueries.getFSMOperation((Model)model).contains((Operation)elt) == false)
					buffer.add(elt);
			}
		}
		list.removeAll(buffer);
		return list;
	}
	
	/**
	 * Check if funtion is an Athena processing
	 * @param op
	 * @return check result
	 */
	static public Boolean isProcessing(Operation op)
	{
		Boolean result = false;
		//System.out.println(op.getOwner().toString());
		if(op.getOwner() instanceof org.eclipse.uml2.uml.Class)
		{	
			/*
			 * Check if the operation is in the behavior specification then it's a processing
			 */
			org.eclipse.uml2.uml.Class class_elt = (org.eclipse.uml2.uml.Class)op.getOwner();
			if(class_elt != null)
			{
				List<Behavior> list = class_elt.getOwnedBehaviors();
				for(Behavior expr : list)
				{
					if(expr instanceof org.eclipse.uml2.uml.OpaqueBehavior && expr.getSpecification() != null)
					{
						BehavioralFeature feat = expr.getSpecification();
						
						if(feat instanceof org.eclipse.uml2.uml.Operation &&
								feat.getName().equals(op.getName()))
						{
							result = true;
							break;
						}
					}
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Return comment from element
	 * @param elt
	 * @return
	 */
	static public String getCommentFromElement(NamedElement elt)
	{
		String result = "";
		for(org.eclipse.uml2.uml.Comment str : elt.getOwnedComments())
		{
			if(str.getBody() != null)
			{
				if(str.getBody().isEmpty() == false && 
						(SpecificQueries.isContainerDeclaration(str.getBody()) == false))
				{	
					if(result.isEmpty() == false)
					{
						result += "\r\n";
					}
					result += str.getBody();
				}
			}
		}
		if(result.isEmpty() == false)
		{
			result = "/* " + result + " */";
		}
		return result;
	}
	
	/**
	 * Check has comment
	 * @param elt
	 * @return
	 */
	static public Boolean hasComment(NamedElement elt)
	{
		Boolean result = false;
		for(Comment comment : elt.getOwnedComments())
		{
			if(comment.getBody() != null)
				result |= !SpecificQueries.isContainerDeclaration(comment.getBody());
		}
		return result;
	}
	
	/**
	 * Return the athena's datatype declaration
	 * @param elt
	 * @return
	 */
	static public String getAthenaDataTypeDeclaration(NamedElement elt)
	{
		String result = "";
		SpecificQueries.initDeclarationMap();
		
		if(SpecificQueries._mapDeclaration.containsKey(elt.getName()))
		{
			result = SpecificQueries._mapDeclaration.get(elt.getName());
		}
		else
		{
			result = "// Unknown datatype declaration!!!";
		}
		
		return result;
	}
	
	/**
	 * Check is an external librairy
	 * @param classe
	 * @return
	 */
	static public Boolean isExternalLibrairy(org.eclipse.uml2.uml.Class classe)
	{
		return GeneralQueries.hasStereotype(classe, org.eclipse.papyrus.RobotML.AlgorithmLibrary.class);
	}
	
	/**
	 * Check has valid states
	 * @param fsm
	 * @return
	 */
	static public Boolean hasValidStates(org.eclipse.uml2.uml.StateMachine fsm)
	{
		Boolean result = false;
		
		FSMQueries queries = new FSMQueries();
		List<Vertex> states = queries.getStates(fsm);
		for(Vertex obj : states)
		{
			if(obj instanceof State)
			{
				State state = (State)obj;
				
				org.eclipse.papyrus.RobotML.State robotml_state = ElementUtil.getStereotypeApplication(state, org.eclipse.papyrus.RobotML.State.class);
				if(robotml_state != null)
				{
					result |= (robotml_state.getOperation() != null);
				}
			}
		}

		return result;
	}
	
	/**
	 * Check has valid transiiton
	 * @param fsm
	 * @return
	 */
	static public Boolean hasValidTransition(org.eclipse.uml2.uml.StateMachine fsm)
	{
		Boolean result = false;
		
		FSMQueries queries = new FSMQueries();
		List<org.eclipse.papyrus.RobotML.Transition> transitions = queries.getTransitions(fsm);
		for(org.eclipse.papyrus.RobotML.Transition transition : transitions)
		{
			result |= (transition.getGuard() != null);
			result |= (transition.getEffect() != null);
		}
		
		return result;
	}
	
	/**
	 * Check has valid FSM declaration
	 * @param classe
	 * @return
	 */
	static public Boolean hasValidFSMDeclaration(org.eclipse.uml2.uml.Class classe)
	{
		Boolean result = false;
		
		FSMQueries fsmQueries = new FSMQueries();
		LinkedList<StateMachine> list = (LinkedList<StateMachine>) fsmQueries.getStateMachines(classe);
		
		//check parents
		if((list.size() > 0) && (SpecificQueries.hasFSMInParent(SpecificQueries.getSuperClass(classe)) == false))
		{
			result = true;
		}
		
		return result;
	}
	
	/**
	 * Check has FSM parent
	 * @param classe
	 * @return
	 */
	static private Boolean hasFSMInParent(org.eclipse.uml2.uml.Class classe)
	{
		Boolean result = false;
		
		if(classe != null)
		{
			//My parent has a FSM?
			result = SpecificQueries.hasFSMInParent(SpecificQueries.getSuperClass(classe));
			FSMQueries queries = new FSMQueries();
			LinkedList<StateMachine> list = (LinkedList<StateMachine>) queries.getStateMachines(classe);
			result |= (list.size() > 0);
		}
		
		return result;
	}
	
	/**
	 * return all OpaqueBehavior from the model
	 * @param ne
	 * @return
	 */
	static private List<NamedElement> getAllOpaqueBehaviorFromModel(NamedElement ne)
	{
		LinkedList<NamedElement> res = new LinkedList<NamedElement>();
		
		if(ne != null)
		{
			for(Element elt : ne.getOwnedElements())
			{
				if(elt instanceof OpaqueBehavior)
				{
					res.add((NamedElement)elt);
				}
				else if(elt instanceof PackageImport)
				{
					PackageImport imp = (PackageImport)elt;
					res.addAll(SpecificQueries.getAllOpaqueBehaviorFromModel((NamedElement)imp.getImportedPackage()));
				}
				else if((elt instanceof org.eclipse.uml2.uml.Class) || 
						(elt instanceof org.eclipse.uml2.uml.Package))
				{
					res.addAll(SpecificQueries.getAllOpaqueBehaviorFromModel((NamedElement)elt));
				}
			}
		}
		
		return res;
	}
	
	static public List<NamedElement> getOpaqueBehaviorFromModel(NamedElement ne)
	{
		List<NamedElement> res = getAllOpaqueBehaviorFromModel(ne);
		FSMQueries query = new FSMQueries();
		List<StateMachine> sms = query.getStateMachines(ne);
		
		for(StateMachine sm : sms)
		{
			res.removeAll(SpecificQueries.getFSMOpaqueBehavior((Model)ne, sm));
		}
		
		return res;
	}
	
	/**
	 * Generate wrapper
	 * @param classe
	 * @return
	 */
	static public String generateWrapperString(org.eclipse.uml2.uml.Class classe)
	{
		String result = "";
		if(SpecificQueries.isExternalLibrairy(classe))
		{
			Stereotype stereo = classe.getAppliedStereotypes().get(0);
			if(stereo != null)
			{
				Object obj = classe.getValue(stereo, SpecificQueries._pathProperty);
				if(obj != null)
				{
					result = obj.toString();
				}
			}
		}
		return result;
	}
	
	/**
	 * Generate the state operation
	 * @param vertex
	 * @return
	 */
	static public String generateOperationStateString(org.eclipse.uml2.uml.Vertex vertex)
	{
		String result = "";
		if(vertex instanceof State)
		{
			if(vertex.getAppliedStereotypes().size() > 0)
			{
				Stereotype stereo = vertex.getAppliedStereotypes().get(0);
				Object obj = vertex.getValue(stereo, SpecificQueries._operationProperty);
				if(obj != null)
				{
					if(obj instanceof Algorithm)
					{
						String operation = ((Algorithm)obj).getBase_Operation().getName();
						List<?> list= (List<?>)vertex.getValue(stereo, SpecificQueries._argumentsProperty);
						
						result = SpecificQueries._interactionTag + " " + operation + "(";
						int count = list.size();
						for(int cpt = 0; cpt < count; cpt ++)
						{
							if((cpt + 1) == count)
							{
								result += list.get(cpt);
							}
							else
							{
								result += list.get(cpt) + ", ";
							}
						}
						result += ")";
					}
				}	
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @param ne
	 * @return
	 */
	static public Boolean isContainerType(NamedElement ne)
	{
		Boolean result = false;
		for(Comment comment : ne.getOwnedComments())
		{
			if(comment.getBody() != null)
				result |= SpecificQueries.isContainerDeclaration(comment.getBody());
		}
		return result;
	}
	
	/**
	 * Check if string is a container declaration
	 * @param str
	 * @return
	 */
	static private Boolean isContainerDeclaration(String str)
	{
		Boolean result = false;
		result |= str.startsWith(_arrayKeyword);
		result |= str.startsWith(_mapKeyword);
		result |= str.startsWith(_vectorKeyword);
		result &= str.contains("<");
		result &= str.contains(">");
		
		result &= (str.split(" ").length >= 3);
		
		return result;
	}
	
	/**
	 * 
	 * @param ne
	 * @return
	 */
	static public String getContainerTypeDeclaration(NamedElement ne)
	{
		String result = "";
		
		/*
		 * For type "container", declaration is tsocked in the comment
		 * Format : <type> <<template>> <name> <dimension>;
		 */
		
		for(Comment comment : ne.getOwnedComments())
		{
			if(comment.getBody() != null)
			{
				if(comment.getBody().startsWith(_arrayKeyword) == true ||
						comment.getBody().startsWith(_mapKeyword) == true ||
						comment.getBody().startsWith(_vectorKeyword) == true)
				{
					result = comment.getBody();
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Check if the datatype is a define type
	 * @param dt
	 * @return
	 */
	static public Boolean isDefineType(NamedElement ne)
	{
		/*
		 * Datatype have 1 attribute with the same name.
		 */
		Boolean result = false;
		DataType dt = (DataType) ne;
		if(dt.getAttributes().size() == 1 &&
				dt.getAllAttributes().get(0).getType() != null)
		{
			result = dt.getName().equals(dt.getAttributes().get(0).getName());
		}
		
		return result;
	}
	
	static public Boolean isUnionType(NamedElement ne)
	{
		Boolean result = false;
		
		/*
		 * For type "container", declaration is tsocked in the comment
		 * Format : <type> <<template>> <name> <dimension>;
		 */
		
		for(Comment comment : ne.getOwnedComments())
		{
			if(comment.getBody() != null)
			{
				if(comment.getBody().startsWith(_unionKeyword) == true)
				{
					result = true;
				}
			}
		}
//		DataType dt = (DataType) ne;
//		if(dt.getAllAttributes().size() > 0)
//		{
//			for(Property prop : dt.getAllAttributes())
//			{
//				if(prop.getName().equals(dt.getName()))
//				{
//					if(prop.getType() == null)
//						result = true;
//				}
//				
//				if(result == true)
//					break;
//			}
//		}
		
		return result;
	}
	
	/**
	 * Check if datatype has validity
	 * @param ne
	 * @return
	 */
	static public Boolean hasDataTypeValidity(NamedElement ne)
	{
		Boolean result = false;
		
		for(Element elt : ne.getOwnedElements())
		{
			result |= (elt instanceof Interval);
//			result |= (elt instanceof Expression);
		}
		
		return result;
	}
	
	/**
	 * Return the list of define type
	 * @return
	 */
	static public List<NamedElement> getDefineType(NamedElement ne)
	{
		return new LinkedList<NamedElement>(SpecificQueries._defineTypeUsed);
	}
	
	/**
	 * Return the datatype validity
	 * @param ne
	 * @return
	 */
	static public String getDataTypeValidity(NamedElement ne)
	{
		String result = "";
		for(Element elt : ne.getOwnedElements())
		{
			if(elt instanceof Interval)
			{
				result = ((Interval)elt).getType().getName();
			}
		}
		return result;
	}
	
	/**
	 * Check if datatype is used in the model
	 * @param ne
	 * @param dataToTest
	 * @return
	 */
	static public Boolean isDataTypeUsed(NamedElement ne, NamedElement dataToTest)
	{
		Boolean result = false;
		
		if(ne instanceof Model)
		{
			TreeIterator<EObject> iter = ((Model)ne).eAllContents();
			while(iter.hasNext())
			{
				EObject obj = iter.next();
				if(obj instanceof NamedElement)
				{
					result = SpecificQueries.isDataTypeUsed((NamedElement)obj, dataToTest);
				}
				else if(obj instanceof org.eclipse.uml2.uml.PackageImport)
				{
					PackageImport imp = (PackageImport)obj;
					result = SpecificQueries.isDataTypeUsed(((NamedElement)imp.getImportedPackage()), dataToTest);
				}
				
				if(result == true)
				{
					break;
				}
			}
		}
		else if(ne instanceof Property)
		{
			Property prop = (Property)ne;
			if(prop.getType() != null)
				result = dataToTest.getName().equals(prop.getType().getName());
//			else
//				System.out.println("Type null for the property : " + prop.getName());
		}
		else if(ne instanceof Port)
		{
			Port port = (Port)ne;
			if(port.getType() != null)
				result = dataToTest.getName().equals(port.getType().getName());
//			else
//				System.out.println("Type null for the port : " + port.getName());
		}
		else if(ne instanceof DataType)
		{	
			if(SpecificQueries.isContainerType(ne) == true)
			{
				String decl = SpecificQueries.getContainerTypeDeclaration(ne);
				result = decl.contains(dataToTest.getName());
			}
		}
		return result; 
	}
	
	/**
	 * Search used datatype in the model
	 * @param model
	 * @return
	 */
	//static public Boolean sortUsedDataType(NamedElement model)
	static public Boolean searchUsedDataType(Model model)
	{
		SpecificQueries._basicTypeUsed.clear();
		SpecificQueries._containerTypeUsed.clear();
		SpecificQueries._enumTypeUsed.clear();
		SpecificQueries._structTypeUsed.clear();
		SpecificQueries._defineTypeUsed.clear();
		SpecificQueries._unionTypeUsed.clear();
		
		HashSet<NamedElement> unusedType = new HashSet<NamedElement>();
		HashSet<NamedElement> usedType = new HashSet<NamedElement>();
		
		HashSet<DataType> datatypes = SpecificQueries.getAllModelDataTypes(model);
		
		for(DataType dt :datatypes)
		{	
			System.out.println("DataType : " + dt.getName());
			if(usedType.contains(dt) || 
					SpecificQueries.isDataTypeUsed(model, dt))
			{
				usedType.add(dt);
				if(dt.getAllAttributes().size() > 0)
				{
					for(Property prop : dt.getAllAttributes())
					{
						if(prop.getType() != null)
						{
							if(unusedType.contains(prop.getType()))
							{
								unusedType.remove(prop.getType());
								usedType.add(prop.getType());
							}
							else
							{
								usedType.add(prop.getType());
								System.out.println("Add : " + prop.getType().getName());
							}
						}
					}
				}
			}
			else
			{
				unusedType.add(dt);
			}
		}
		
		SpecificQueries.sortDataType(usedType);
		
		
		
		return Boolean.TRUE;
	}
	
	static private void sortDataType(HashSet<NamedElement> types)
	{
		for(NamedElement ne : types)
		{
			DataType dt =(DataType)ne;
			
			if((dt.getAllAttributes().size() == 0) &&
					((ne instanceof Enumeration) == false))
			{
				if(SpecificQueries.isContainerType(ne))
				{
					//Sort Container DataType
					SpecificQueries._containerTypeUsed.add(ne);
				}
				else
				{
					//Sort basic Datatype
					SpecificQueries._basicTypeUsed.add(ne);
				}
			}
			else if(ne instanceof Enumeration)
			{
				//Sort Enumeration DataType
				SpecificQueries._enumTypeUsed.add(ne);
			}
			else if(dt.getAllAttributes().size() > 0)
			{
				if(SpecificQueries.isDefineType(dt))
				{
					SpecificQueries._defineTypeUsed.add(ne);
				}
				else if(SpecificQueries.isUnionType(dt))
				{
					SpecificQueries._unionTypeUsed.add(dt);
				}
				else
				{
					//Sort Structured DataType
					SpecificQueries._structTypeUsed.add(ne);
				}
			}
		}
	}
	
	/**
	 * Retrun union type list
	 * @param ne
	 * @return
	 */
	static public List<NamedElement> getUnionType(NamedElement ne)
	{
		return new LinkedList<NamedElement>(SpecificQueries._unionTypeUsed);
	}
	
	/**
	 * Return all class's stereotypes used in the model
	 * @param ne
	 * @return
	 */
	static public List<String> getStereotypeComponentUsedInModel(NamedElement ne)
	{
		LinkedList<String> result = new LinkedList<String>();
		
		HashSet<Class> classes = getAllModelClasses(ne);
		for(Class classe : classes)
		{
			for(Stereotype stereo : classe.getAppliedStereotypes())
			{
				if(!result.contains(stereo.getName()))
					result.add(stereo.getName());
			}
		}
		
		return result;
	}

	/**
	 * Retrun the transition guard
	 * @param transition
	 * @return
	 */
	static public Algorithm getTransitionGuard(Transition transition)
	{
		Algorithm result = null;
		
		org.eclipse.papyrus.RobotML.Transition robotml_transition = ElementUtil.getStereotypeApplication(transition, org.eclipse.papyrus.RobotML.Transition.class);
		
		if(robotml_transition != null)
		{
			result = robotml_transition.getGuard();
		}		
		return result;
	}
	
	/**
	 * Return the transition effect
	 * @param transition
	 * @return
	 */
	static public Algorithm getTransitionEffect(Transition transition)
	{
		Algorithm result = null;
		
		org.eclipse.papyrus.RobotML.Transition robotml_transition = ElementUtil.getStereotypeApplication(transition, org.eclipse.papyrus.RobotML.Transition.class);
		
		if(robotml_transition != null)
		{
			result = robotml_transition.getEffect();
		}		
		return result;
	}
	
	
	static public LinkedList<NamedElement> getSortedDataType(NamedElement ne)
	{
		DataTypeCollection collection = new DataTypeCollection();
		collection.addAll(_basicTypeUsed);
		collection.addAll(_enumTypeUsed);
		collection.addAll(_structTypeUsed);
		collection.addAll(_containerTypeUsed);
		collection.addAll(_defineTypeUsed);
		collection.addAll(_unionTypeUsed);
		
		collection.sort();
		
		
		return new LinkedList<NamedElement>(collection);
	}
	
	static public Boolean isBasicType(NamedElement ne)
	{
		return SpecificQueries._basicTypeUsed.contains(ne);
	}
	
	static public Boolean isEnumerationType(NamedElement ne)
	{
		return SpecificQueries._enumTypeUsed.contains(ne);
	}
	
	static public Boolean isStructuredType(NamedElement ne)
	{
		return SpecificQueries._structTypeUsed.contains(ne);
	}
	
	static private List<Operation> getFSMOperation(Model model)
	{
		LinkedList<Operation> res = new LinkedList<Operation>();
		FSMQueries queries = new FSMQueries();
		List<StateMachine> sms = queries.getStateMachines(model);
		for(StateMachine sm : sms)
		{
			List<org.eclipse.papyrus.RobotML.Transition> transitions = queries.getTransitions(sm);
			for(org.eclipse.papyrus.RobotML.Transition transition : transitions)
			{
				if(transition.getGuard() != null)
					res.add(transition.getGuard().getBase_Operation());
				
				if(transition.getEffect()  != null)
					res.add(transition.getEffect().getBase_Operation());
			}
		}
		return res;
	}
	
	static public List<OpaqueBehavior> getFSMOpaqueBehavior(Model model, StateMachine sm)
	{
		LinkedList<OpaqueBehavior> res = new LinkedList<OpaqueBehavior>();
		
		FSMQueries query = new FSMQueries();
		HashSet<String> funcName = new HashSet<String>();
		List<org.eclipse.papyrus.RobotML.Transition> transitions = query.getTransitions(sm);
		for(org.eclipse.papyrus.RobotML.Transition transition : transitions)
		{
			if(transition.getGuard() != null)
				funcName.add(transition.getGuard().getBase_Operation().getName());
			
			if(transition.getEffect()  != null)
				funcName.add(transition.getEffect().getBase_Operation().getName());
		}
		
		List<NamedElement> behaviors = getAllOpaqueBehaviorFromModel(model);
		for(NamedElement behavior : behaviors)
		{
			String op_name = ((OpaqueBehavior)behavior).getSpecification().getName();
			if(funcName.contains(op_name))
			{
				res.add((OpaqueBehavior)behavior);
			}
		}
		return res;
	}
	
	
	static public List<Vertex> getFSMStates(StateMachine sm)
	{
		LinkedList<Vertex> res = new LinkedList<Vertex>();
		
		FSMQueries query = new FSMQueries();
		int index = 0;
		for(Vertex elt : query.getStates(sm))
		{
			if(elt.getIncomings().size() > 0)
			{
				res.add(index, elt);
				index ++;
			}
		}
		
		return res;
	}
	
	/**
	 * Check if state of statemachine is the initial state
	 * WARNING !!! The intial state is the first state after the state with INITIAL kind
	 * @param state
	 * @return
	 */
	static public Boolean isStartingState(Vertex state)
	{
		Boolean isInitial = false;
		for(Transition transition : state.getIncomings())
		{
			Vertex src = transition.getSource();
			if(src != state)
			{
				List<Transition> tmp = src.getIncomings();
				if(tmp.size() == 0)
					isInitial = true;
			}
		}
		
		return isInitial;
	}
	
	static public List<Port> getReferences(Model model, Class classe)
	{
		LinkedList<Port> res = new LinkedList<Port>();
		HashSet<Class> classes = getAllModelClasses(model);
		for(Class elt : classes)
		{
			List<Port> in_ports = ArchitectureQueries.getInputPortsForElement(classe) ;
			if(ArchitectureQueries.isAnAncestorOf(classe, elt))
			{
				List<Port> in_ports_child = ArchitectureQueries.getInputPortsForElement(elt);
				for(Port port : in_ports)
				{
					if(in_ports_child.contains(port) == true &&
							res.contains(port) == false)
					{
						if(ArchitectureQueries.isPortConnected(port))
						{
							res.add(port);
						}
					}
				}
			}
		}
		
		
		return res;
	}
	
	static private Boolean hasChildren(Model model, Class classe)
	{
		return !SpecificQueries.getChildren(model, classe).isEmpty();
	}
	
	static private List<NamedElement> getChildren(Model model, Class classe)
	{
		LinkedList<NamedElement> res = new LinkedList<NamedElement>();
		HashSet<Class> classes = SpecificQueries.getAllModelClasses(model);
		for(Class class_tmp : classes)
		{
			if(class_tmp != classe)
			{
				List<Class> super_classes = class_tmp.getSuperClasses();
				if(super_classes.contains(classe))
				{
					res.add(class_tmp);
					res.addAll(getChildren(model, class_tmp));
				}
			}
		}
		return res;
	}
	
	static private List<NamedElement> getParentsInstanciation(Model model, Class classe)
	{
		LinkedList<NamedElement> parents = new LinkedList<NamedElement>();
		LinkedList<NamedElement> classes = new LinkedList<NamedElement>();
		classes.add(classe);
		if(SpecificQueries.hasChildren(model, classe));
		{
			classes.addAll(SpecificQueries.getChildren(model, classe));
		}
		
		HashSet<Class> components = SpecificQueries.getAllModelClasses(model);
		for(Class comp : components)
		{
			
			List<Property> subComponents = comp.getAllAttributes();
			for(Property prop : subComponents)
			{
				if(classes.contains(prop.getType()))
				{
					parents.add(comp);
					break;
				}
			}
		}
		return parents;
	}
	
	static public List<NamedElement> getOriginsPort(Model model, Class classe_dest, Port port)
	{
		LinkedList<NamedElement> result = new LinkedList<NamedElement>();
		List<NamedElement> tmp = SpecificQueries.getPortOtherSide(port);
		/*
		 * Check in object instance the origin port
		 */
		for(Property prop : classe_dest.getAllAttributes()){
			if(prop.getType() != classe_dest)
			{
				if(tmp.contains(prop.getType()))
				{
					result.add(prop);
					System.out.println("Class " + classe_dest.getName() + " for port => " + port.getName() + " from " + prop.getName());
				}
			}
		}
		
		if(result.isEmpty())
		{
			/*
			 * Get the parent instance, and check if the port is link with an other instance than the classe destination
			 */
			List<NamedElement> parents = SpecificQueries.getParentsInstanciation(model, classe_dest);
			
			if(parents.isEmpty() == false)
			{
				
				for(NamedElement parent : parents)
				{
					for(Property prop : ((Class)parent).getAllAttributes())
					{
						if(tmp.contains(prop.getType()))
						{
							result.add(prop.getType());
							System.out.println("Parent class "+ parent.getName() + " *** Class " + classe_dest.getName() + " for port => " + port.getName() + " from " + prop.getName());
						}
					}
				}
				
			}
		}
		return result;
	}
	
	static private List<NamedElement> getPortOtherSide(Port port)
	{
		/*
		 * Get all element are in other side the port
		 */
		LinkedList<NamedElement> res = new LinkedList<NamedElement>();
		for(ConnectorEnd end : port.getEnds())
		{
			if(end.getOwner() != null && end.getOwner()!= port)
			{
				Connector connector = (Connector)end.getOwner();
				if((connector != null))
				{
					if(connector.getOwner() != null)
					{
						if(res.contains(connector.getOwner()) == false)
						{
							res.add((NamedElement) connector.getOwner());
						}
					}
				}
			}
		}
		return res;
	}
	
	static public Boolean isConnectedToOwner(Port port, Class classe, Model model)
	{
		Boolean result = false;
		
		List<NamedElement> parents = SpecificQueries.getParentsInstanciation(model, classe);
		if(parents.isEmpty() == false)
		{
			List<NamedElement> tmp = SpecificQueries.getPortOtherSide(port);
			for(NamedElement elt : tmp)
			{
				result |= parents.contains(elt);
				if(parents.contains(elt))
				{
					System.out.println("Port " + port.getName() + " from class " + classe.getName() + " is connected to " + elt.getName());
				}
			}
		}	
		return result;
	}

	static public Boolean hasValidConnection(Port port)
	{
		Boolean result = false;
		result = (port.getOwner() != null);
		for(ConnectorEnd end : port.getEnds())
		{
			if(end.getOwner() != null && end.getOwner()!= port)
			{
				Connector connector = (Connector)end.getOwner();
				if((port.getOwner() != null) && (connector != null))
				{
					result = true;
					break;
				}
			}
			
		}
		
		return result;
	}
	
	static public Boolean isConnected(Port port)
	{
		Boolean result = false;
		
		System.out.println("*** Port : " + port.getName());
		for(ConnectorEnd connector : port.getEnds())
		{
			System.out.println("PORT OWNER : " + port.getOwner().toString());
			System.out.println("ROLE : " + connector.getRole());
			if(connector.getPartWithPort() != null)
			{
				System.out.println("PART WITH PORT : " + connector.getPartWithPort());
			}
				
			//System.out.println("OWNER : " + connector.getOwner());
			Connector con = (Connector)connector.getOwner();
			System.out.println("OTHER SIDE : " + con.getOwner().toString());
		}
		return result;
	}
}
