package org.eclipse.robotml.generators.acceleo.athena.mmqueries;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.papyrus.RobotML.Algorithm;
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
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interval;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.util.UMLUtil;

public class SpecificQueries {

	
	static private HashSet<String> temp = new HashSet<String>();
	static private HashMap<String, String> _mapDeclaration = new HashMap<String, String>();
	static final private String _pathProperty = "path";
	static final private String _interactionTag = "interaction";
	
	static final private String _arrayKeyword = "array";
	static final private String _mapKeyword = "map";
	static final private String _vectorKeyword = "vector";
	static final private String _unionKeyword = "union";
	
	static final private String ALF_LANGUAGE = "Alf";
	static final private String ATHENA_LANGUAGE = "Athena";
	
	static private HashSet<NamedElement> _basicTypeUsed = new HashSet<NamedElement>();
	static private HashSet<NamedElement> _enumTypeUsed = new HashSet<NamedElement>();
	static private HashSet<NamedElement> _containerTypeUsed = new HashSet<NamedElement>();
	static private HashSet<NamedElement> _structTypeUsed = new HashSet<NamedElement>();
	static private HashSet<NamedElement> _defineTypeUsed = new HashSet<NamedElement>();
	static private HashSet<NamedElement> _unionTypeUsed = new HashSet<NamedElement>();
	static private NamedElement _model = null;
	
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
			//Bool
			decl = "include MATLAB : \"matrix.h\"\r\n";
			decl += "language MATLAB : \"mxINT8_CLASS\" = \"0\"\r\n";
			decl += "language CPP : \"bool\" = \"false\"\r\n";
			decl += "language VLE : \"Boolean\" = \"false\"";
			SpecificQueries._mapDeclaration.put("Bool", decl);
			//Byte
			decl = "language CPP : \"char\" = \"0\"\r\n";
			decl += "language VLE : \"Integer\" = \"0\"";
			SpecificQueries._mapDeclaration.put("Byte", decl);
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
					DataType dt = (org.eclipse.uml2.uml.DataType)ne;
					found_elts.add(dt);				
				}
				else if (ne instanceof org.eclipse.uml2.uml.Enumeration) {
					Enumeration dt = (org.eclipse.uml2.uml.Enumeration)ne;
					found_elts.add(dt);					
				}
				else {
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
	static private Boolean isProcessing(Operation op)
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
			result = "// Unknown datatype declaration!!! => " + elt.getName();
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
	static public String generateInteractionStateString(org.eclipse.uml2.uml.Vertex vertex)
	{
		String result = "";
//		if(vertex instanceof State)
//		{
			org.eclipse.papyrus.RobotML.State state = UMLUtil.getStereotypeApplication(vertex, org.eclipse.papyrus.RobotML.State.class);
			if(state != null)
			{
				Algorithm operation = state.getOperation();
				if(operation != null)
				{
					String opName = operation.getBase_Operation().getName();
					result = SpecificQueries._interactionTag + " " + opName + "(";
					for(Property prop : state.getArguments())
					{
						result += prop.getName() + ","; 
					}
					int index = result.lastIndexOf(",");
					if(index > -1)
					{
						result = result.substring(0, index);
					}
					result += ")";
				}
			}
//		}
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
		SpecificQueries._model = model;
		
		HashSet<DataType> datatypes = SpecificQueries.getAllModelDataTypes(model);
		Set<String> neededTypes = searchUsedDataTypeFromModel(model);
		System.out.println("Needed dt:");
		for(String dt : neededTypes) System.out.println(dt);
		
		HashSet<DataType> tmp = new HashSet<DataType>();
		HashSet<DataType> savedTypes = new HashSet<DataType>();
		for(DataType dt : datatypes)
		{
			String dt_name = dt.getName();
			if(neededTypes.contains(dt_name))
			{
				//On verifie si le type est présent dans la liste si 'est un container ou un struct
				if(SpecificQueries.isContainerType(dt))
				{
					//recherche le type dans les datatypes
					for(DataType dt_bis : datatypes)
					{
						for(String type : SpecificQueries.getContainerType(dt))
						{
							if(type.equals(dt_bis.getName()))
							{
								savedTypes.add(dt_bis);
							}
						}
					}
				}
				else if(SpecificQueries.isStructuredType(dt))
				{
					for(Property prop : dt.getAllAttributes())
					{
						savedTypes.add((DataType)prop.getType());
					}
				}
			}
			else if(savedTypes.contains(dt) == false)
			{
				tmp.add(dt);
			}
		}
		
		datatypes.removeAll(tmp);
		datatypes.addAll(savedTypes);
		
		
		HashSet<NamedElement> toSort = new HashSet<NamedElement>(datatypes);
		SpecificQueries.sortDataType(toSort);
		
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
	
	/**
	 * Return the FSM Operation list
	 * @param model
	 * @return
	 */
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
	
	/**
	 * Return the FSM OpaqueBehavior list
	 * @param model
	 * @param sm
	 * @return
	 */
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
	
	/**
	 * Return the FSM states list
	 * @param sm
	 * @return
	 */
	static public List<Vertex> getFSMStates(StateMachine sm)
	{
		LinkedList<Vertex> res = new LinkedList<Vertex>();
		
		FSMQueries query = new FSMQueries();
		int index = 0;
		for(Vertex elt : query.getStates(sm))
		{
			if((elt.getIncomings().size() > 0) && (elt.getOutgoings().size() > 0))
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
	
	/**
	 * Check if the class have a conection with a parent's object
	 * @param model
	 * @param src
	 * @param port
	 * @return
	 */
	static public Boolean hasObjectInstanceConnection(Model model, Class src, Port port)
	{
		return (getObjectInstanceConnectionName(model, src, port) != null);
	}
	
	/**
	 * Check if the class have a connection with this parent
	 * @param model
	 * @param src
	 * @param port
	 * @return
	 */
	static public Boolean hasParentInstanceConnection(Model model, Class src, Port port)
	{
		return (SpecificQueries.getParentInstanceConnection(model, src, port) != null);
	}
	
	/**
	 * Return the name of the object connection
	 * @param model
	 * @param src
	 * @param port
	 * @return
	 */
	static public String getObjectInstanceConnectionName(Model model, Class src, Port port)
	{
		System.out.println("*** " + src.getName() + "::" + port.getName());
		Class parent = getParentInstanceConnection(model, src, port);
		if(parent != null)
		{
			/*
			 * List the parent instances and test the connection
			 */
			for(Property prop : parent.getAllAttributes())
			{
				if(prop.getType() instanceof Class)
				{
					if(prop.getType() != src)
					{
						if(SpecificQueries.isLinked(port, (Class)prop.getType()))
						{
							return prop.getName();
						}
					}
				}
			}
		}
		return null;
	}
	
	
	/**
	 * Return the parent connection
	 * @param model
	 * @param src
	 * @param port
	 * @return
	 */
	static public Class getParentInstanceConnection(Model model, Class src, Port port)
	{
		
		HashSet<Class> classes = SpecificQueries.getAllModelClasses(model);
		for(Class classe : classes)
		{
			if(SpecificQueries.haveInstanceOf(classe, src) == true)
			{
				return classe;
			}
		}
		return null;
		

	}
	
	/**
	 * Check if the parent contain instance of object.
	 * @param object_to_test
	 * @param object_instance
	 * @return
	 */
	static private boolean haveInstanceOf(Class object_to_test, Class object_instance)
	{
		boolean res = false;
		for(Property prop : object_to_test.getAllAttributes())
		{
			if(prop.getType() instanceof Class)
			{
				res |= (prop.getType() == object_instance);
			}
		}
		return res;
	}
	
	/**
	 * Check if a link exist beetwin the port and the class
	 * @param port
	 * @param dest
	 * @return
	 */
	static private boolean isLinked(Port port, Class dest)
	{
		boolean res = false;
		List<Port> port_list = ArchitectureQueries.getInputPortsForElement(dest);
		port_list.addAll(ArchitectureQueries.getOutputPortsForElement(dest));
		
		for(ConnectorEnd  cend : port.getEnds())
		{
			Connector connector = (Connector)cend.getOwner();
			for(ConnectorEnd end : connector.getEnds())
			{
				Port tmp1 = (Port)end.getRole();
				if(port_list.contains(tmp1))
				{
					//System.out.println("Port " + port.getName() + " is linked to " + dest.getName());
					res = true;
				}
			}
		}
		
		return res;
	}
	
	/**
	 * Search the used datatype in the model
	 * @param elt
	 * @return
	 */
	static public Set<String> searchUsedDataTypeFromModel(NamedElement elt)
	{
		HashSet<String> types = new HashSet<String>();
		
		TreeIterator<EObject> iter = elt.eAllContents();
		while(iter.hasNext())
		{
			EObject elt_iter = (EObject)iter.next();
			try
			{
			
			if(elt_iter instanceof Parameter)
			{
				if(((Parameter)elt_iter).getType() != null)
				{
					Type tmpType = ((Parameter)elt_iter).getType();
					types.add(tmpType.getName());
					types.addAll(SpecificQueries.checkTypeAsContainer(tmpType));
				}
				else
					System.err.println("ERROR : null pointer type for " + ((Parameter)elt_iter).getName());
			}
			else if(elt_iter instanceof Property)
			{
				if(((Property)elt_iter).getType() != null)
				{
					Type tmpType = ((Property)elt_iter).getType();
					types.add(tmpType.getName());
					types.addAll(SpecificQueries.checkTypeAsContainer(tmpType));
				}
					
				else
					System.err.println("ERROR : null pointer type for " + ((Property)elt_iter).getName());
			}
			else if(elt_iter instanceof Port)
			{
				if(((Port)elt_iter).getType() != null)
				{
					Type tmpType = ((Port)elt_iter).getType();
					types.add(tmpType.getName());
					types.addAll(SpecificQueries.checkTypeAsContainer(tmpType));
				}
					
				else
					System.err.println("ERROR : null pointer type for " + ((Port)elt_iter).getName());
			}
			else if(elt_iter instanceof org.eclipse.uml2.uml.PackageImport)
			{
				PackageImport imp = (PackageImport)elt_iter;
				types.addAll(searchUsedDataTypeFromModel((NamedElement)imp.getImportedPackage()));
			}
//			else if(elt_iter instanceof org.eclipse.uml2.uml.Comment)
//			{
//				Element owner = ((Comment)elt_iter).getOwner();
//				if(owner instanceof Type)
//					types.addAll(SpecificQueries.checkTypeAsContainer((Type)owner));
//			}
			else if(elt_iter instanceof NamedElement)
			{
//				if(SpecificQueries.isContainerType((NamedElement)elt_iter))
//				{
//					types.addAll(SpecificQueries.checkTypeAsContainer((Type)elt_iter));
//				}
				types.addAll(searchUsedDataTypeFromModel((NamedElement)elt_iter));
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		}
		
		return types;
	}
	
	static private List<String> checkTypeAsContainer(Type ne)
	{
		LinkedList<String> result = new LinkedList<String>();
		for(Comment comment : ne.getOwnedComments())
		{
			if(comment.getBody() != null)
			{
				if(SpecificQueries.isContainerDeclaration(comment.getBody()))
				{
					result.addAll(SpecificQueries.getContainerType(ne));
					break;
				}
			}
		}
		return result;
	}
	
	/**
	 * Check if the model is valid. Need To contain a stereotyped clas as "Environment"
	 * @param model
	 * @return
	 */
	static public Boolean isModelValid(NamedElement model)
	{
		Boolean result = false;
		TreeIterator<EObject> iter = model.eAllContents();
		while(iter.hasNext())
		{
			EObject obj = iter.next();
			if(obj instanceof Class)
			{
				result |= GeneralQueries.hasStereotype((Class)obj, org.eclipse.papyrus.RobotML.Environment.class);
			}
		}
		return result;
	}
	
	/**
	 * Show Error message
	 * @param msg
	 */
	static public void showErrorMessageDlg(String msg)
	{
		JOptionPane.showMessageDialog(null, msg, "ERROR", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * Extract type template from container
	 * @param type
	 * @return
	 */
	static private List<String> getContainerType(NamedElement type)
	{
		LinkedList<String> res = new LinkedList<String>();
		//containers datatype
		String type_str = SpecificQueries.getContainerTypeDeclaration(type);
		
		//type map
		if(type_str.startsWith("map"))
		{
			//type array and vector
			int index_begin = type_str.indexOf("<") + 1;
			int index_sep = type_str.indexOf(",");
			int index_end = type_str.indexOf(">");	
			
			String key = type_str.substring(index_begin, index_sep);
			String value = type_str.substring(index_sep + 1, index_end);
			key = key.trim();
			value = value.trim();
			
			if(res.contains(key) == false) res.add(key);
			if(res.contains(value) == false) res.add(value);
			
			/*
			 * TODO : On recherche key value pour les traiter et les ajouter si besoin
			 */
			if(SpecificQueries._model != null)
			{
				HashSet<DataType> types = SpecificQueries.getAllModelDataTypes(SpecificQueries._model);
				for(DataType data : types)
				{
					if(data.getName().equals(key) == true ||
							data.getName().equals(value) == true)
					{
						if(SpecificQueries.isContainerType(data))
						{
							res.addAll(SpecificQueries.getContainerType(data));
						}
					}
				}
			}
			
		}
		else
		{
			//type array and vector
			int index_begin = type_str.indexOf("<") + 1;
			int index_end = type_str.indexOf(">");
			
			type_str = type_str.substring(index_begin, index_end).trim();
			if(res.contains(type_str) == false) res.add(type_str);
			
			/*
			 * TODO : On recherche value pour le traiter et l'ajouter si besoin
			 */
			if(SpecificQueries._model != null)
			{
				HashSet<DataType> types = SpecificQueries.getAllModelDataTypes(SpecificQueries._model);
				for(DataType data : types)
				{
					if(data.getName().equals(type_str) == true)
					{
						if(SpecificQueries.isContainerType(data))
						{
							res.addAll(SpecificQueries.getContainerType(data));
						}
					}
				}
			}
		}
		
		return res;
	}
	
	/**
	 * Ask to did you save your model
	 * @return
	 */
	static public Boolean isModelSaved()
	{
		return (JOptionPane.showConfirmDialog(null, "Did you save your model ?", "INFORMATION", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
	}
	
	/**
	 * Ask to operation as a transition guard
	 * @param model
	 * @param opName
	 * @return
	 */
	static public Boolean isGuard(NamedElement model, String opName)
	{
		Boolean result = false;
		HashSet<Class> listClass = SpecificQueries.getAllModelClasses(model);
		for(Class classe : listClass)
		{
			TreeIterator<EObject> iter = classe.eAllContents();
			while(iter.hasNext())
			{
				EObject obj = iter.next();
				if(obj instanceof StateMachine)
				{
					result |= testGuard((StateMachine)obj, opName);
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Ask to operation as a transition effect
	 * @param model
	 * @param opName
	 * @return
	 */
	static public Boolean isEffect(NamedElement model, String opName)
	{
		Boolean result = false;
		HashSet<Class> listClass = SpecificQueries.getAllModelClasses(model);
		for(Class classe : listClass)
		{
			TreeIterator<EObject> iter = classe.eAllContents();
			while(iter.hasNext())
			{
				EObject obj = iter.next();
				if(obj instanceof StateMachine)
				{
					result |= testEffect((StateMachine)obj, opName);
				}
			}
		}
		
		return result;
	}
	
	static private Boolean testGuard(StateMachine sm, String opName)
	{
		Boolean result = false;
		FSMQueries queries = new FSMQueries();
		List<org.eclipse.papyrus.RobotML.Transition> listTrans = queries.getTransitions(sm);
		for(org.eclipse.papyrus.RobotML.Transition trans : listTrans)
		{
			if(trans.getGuard() != null)
			{
				result = trans.getGuard().getBase_Operation().getName().equals(opName);
			}
		}
 		return result;
	}
	
	static private Boolean testEffect(StateMachine sm, String opName)
	{
		Boolean result = false;
		FSMQueries queries = new FSMQueries();
		List<org.eclipse.papyrus.RobotML.Transition> listTrans = queries.getTransitions(sm);
		for(org.eclipse.papyrus.RobotML.Transition trans : listTrans)
		{
			if(trans.getEffect() != null)
			{
				result = trans.getEffect().getBase_Operation().getName().equals(opName);
			}
		}
 		return result;
	}
	
	static public Boolean isAlfProcessingBody(NamedElement ne)
	{
		Boolean result = false;
		if(ne instanceof OpaqueBehavior)
		{
			List<String> languages = ((OpaqueBehavior)ne).getLanguages();
			result = languages.contains(ALF_LANGUAGE);
		}
		return result;
	}
	
	static public Boolean isAthenaProcessingBody(NamedElement ne)
	{
		Boolean result = false;
		if(ne instanceof OpaqueBehavior)
		{
			List<String> languages = ((OpaqueBehavior)ne).getLanguages();
			result = languages.contains(ATHENA_LANGUAGE);
		}
		return result;
	}
	
}