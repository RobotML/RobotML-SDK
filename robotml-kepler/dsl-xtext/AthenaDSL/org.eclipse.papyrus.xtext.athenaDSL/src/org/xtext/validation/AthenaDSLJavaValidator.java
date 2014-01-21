/*****************************************************************************
 * Copyright (c) 2013 Dassault Aviation.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Stephane Millet (Dassault Aviation) stephane.millet@dassault-aviation.com - Initial implementation
 *  Nicolas Brodnan (Dassault Aviation) nicolas.brodnan@gmail.com - completion due to athena update to V5
 *  Bruno Patin (Dassault Aviation) bruno.patin@dassault-aviation.com - insertion of comments
 *****************************************************************************/

package org.xtext.validation;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.xtext.athenaDSL.AthenaDSLPackage;
import org.xtext.athenaDSL.DataType;
import org.xtext.athenaDSL.ProcessingDeclaration;
import org.xtext.athenaDSL.Project;
import org.xtext.athenaDSL.architectureElement;
import org.xtext.athenaDSL.arg;
import org.xtext.athenaDSL.defineType;
import org.xtext.athenaDSL.eventDeclaration;
import org.xtext.athenaDSL.farg;
import org.xtext.athenaDSL.functionCall;
import org.xtext.athenaDSL.functionDeclaration;
import org.xtext.athenaDSL.instanceDeclaration;
import org.xtext.athenaDSL.interactionCall;
import org.xtext.athenaDSL.interactionDeclaration;
import org.xtext.athenaDSL.localParameterDeclaration;
import org.xtext.athenaDSL.parameterDeclaration;
import org.xtext.athenaDSL.prototypeDeclaration;
import org.xtext.athenaDSL.qualifiedName;
import org.xtext.athenaDSL.referenceDeclaration;
import org.xtext.athenaDSL.signalDeclaration;
import org.xtext.athenaDSL.stateDeclaration;
import org.xtext.athenaDSL.statesetDeclaration;
import org.xtext.athenaDSL.transitionDeclaration;
import org.xtext.athenaDSL.wrapperDeclaration;

public class AthenaDSLJavaValidator extends AbstractAthenaDSLJavaValidator {

	/**
	 * get the project root
	 * 
	 * @param eobj
	 * @return
	 */
	private Project getProject(EObject eobj) {
		while (!(eobj instanceof Project)) {
			eobj = eobj.eContainer();
		}
		return (Project) eobj;
	}

	/**
	 * Get function declaration from its name
	 * 
	 * @param project
	 * @param name
	 * @return declaration
	 */
	private functionDeclaration getFunctionDeclarationByName(Project project, String name) {
		for (functionDeclaration fd : project.getFunctions()) {
			if (fd.getName().equals(name)) {
				return fd;
			}
		}
		return null;
	}

	/**
	 * Get a processing declaration from its name
	 * 
	 * @param project
	 * @param name
	 * @return declaration
	 */
	private ProcessingDeclaration getProcessingDeclarationByName(Project project, String name) {
		for (ProcessingDeclaration fd : project.getProcessings()) {
			if (fd.getName().equals(name)) {
				return fd;
			}
		}
		return null;
	}

	/**
	 * Access function declared argument list. It could be either an external
	 * Function or a processing
	 * 
	 * @param p
	 * @param name
	 * @return
	 */
	private EList<arg> getDeclaredArgumentsForFunctionCall(Project p, String name) {
		EList<arg> decl_args = null;
		functionDeclaration fd = getFunctionDeclarationByName(p, name);
		if (fd != null) {
			decl_args = fd.getArgs().getArguments();
		} else {
			ProcessingDeclaration pd = getProcessingDeclarationByName(p, name);
			decl_args = pd.getArgs().getArguments();
		}
		return decl_args;
	}

	/**
	 * check first letter of a name for lower case
	 * 
	 * @param name
	 * @param warningText
	 * @param feature_id
	 */
	private void checkLowerCaseName(String name, String warningText, int feature_id) {
		if (!Character.isLowerCase(name.charAt(0))) {
			//warning(warningText, feature_id);
		}
	}

	/**
	 * check first letter of a name for upper case
	 * 
	 * @param name
	 * @param warningText
	 * @param feature_id
	 */
	private void checkUpperCaseName(String name, String warningText, int feature_id) {
		if (!Character.isUpperCase(name.charAt(0))) {
			//warning(warningText, feature_id);
		}
	}

	/**
	 * Get a prototype variable (parameter as well as reference)
	 * 
	 * @param argName
	 * @param proto
	 */
	private DataType findVariableTypeInElementList(String argName, EList<architectureElement> elements) {
		for (architectureElement elt : elements) {
			if (elt instanceof parameterDeclaration) {
				if (((parameterDeclaration) elt).getName().equals(argName)) {
					return ((parameterDeclaration) elt).getTypeName();
				}
			} else if (elt instanceof referenceDeclaration) {
				qualifiedName qn = ((referenceDeclaration) elt).getName();
				String alias = ((referenceDeclaration) elt).getAlias();
				if (((alias != null) && (alias.equals(argName)) || (qn.getName().get(qn.getName().size() - 1).equals(argName)))) {
					return ((referenceDeclaration) elt).getTypeName();
				}
			}
		}
		return null;
	}

	/**
	 * 
	 * @param p
	 * @param argName
	 * @param pd
	 * @return
	 */
	private DataType findVariableTypeInPrototype(Project p, String argName, prototypeDeclaration pd) {

		DataType type = findVariableTypeInElementList(argName, pd.getDefinitions());
		if ((type == null) && (pd.getSuperType() != null)) {
			return findVariableTypeInPrototype(p, argName, pd.getSuperType());
		}
		return type;
	}

	/**
	 * 
	 * @param argName
	 * @param elements
	 * @return
	 */
	private DataType findVariableTypeInLocalParameterList(String argName, EList<localParameterDeclaration> elements) {
		DataType type = null;
		for (localParameterDeclaration elt : elements) {
			// System.out.println("\t\t-- local " + elt.getName() + ", =? " +
			// argName);
			if (elt.getName().equals(argName)) {
				type = elt.getType();
				break;
			}
		}
		return type;
	}

	/**
	 * 
	 * @param argName
	 * @param elements
	 * @return
	 */
	private DataType findVariableTypeInProcessingArguments(String argName, EList<arg> elements) {
		DataType type = null;
		for (arg elt : elements) {
			// System.out.println("\t\t-- arg " + elt.getName() + ", =? " +
			// argName);
			if (elt.getName().equals(argName)) {
				type = elt.getType();
				break;
			}
		}
		return type;
	}

	/**
	 * 
	 * @param p
	 * @param argName
	 * @param pd
	 * @return
	 */
	private DataType findVariableTypeInProcessing(Project p, String argName, ProcessingDeclaration pd) {
		DataType type = findVariableTypeInLocalParameterList(argName, pd.getLocalParameters());
		if ((type == null) && (pd.getArgs() != null)) {
			type = findVariableTypeInProcessingArguments(argName, pd.getArgs().getArguments());
		}
		return type;
	}

	/**
	 * 
	 * @param c
	 * @return
	 */
	private ProcessingDeclaration findProcessing(EObject c) {
		while ((c != null) && (!(c instanceof ProcessingDeclaration)))
			c = c.eContainer();
		return (ProcessingDeclaration) c;
	}

	/**
	 * Get argument type in a function from its name
	 * 
	 * @param p
	 * @param arg
	 * @param container
	 * @return
	 */
	private DataType findVariableType(Project p, String argName, EObject container) {
		DataType dtype = null;
		if (container instanceof interactionDeclaration) {
				dtype = findVariableTypeInPrototype(p, argName, (prototypeDeclaration) container.eContainer());
		} else if (container instanceof ProcessingDeclaration) {
			ProcessingDeclaration pd = (ProcessingDeclaration) container;
			dtype = findVariableTypeInProcessing(p, argName, pd);
		} else {
			ProcessingDeclaration pd = findProcessing(container);
			if (pd != null) {
				dtype = findVariableTypeInProcessing(p, argName, pd);
			} else {
				System.out.println("\n Englobing processing not found !");
			}

		}
		return dtype;
	}

	/**
	 * Validate function call or processing
	 * 
	 * @param p
	 * @param call_args
	 * @param decl_args
	 * @param ec
	 */
	private void checkFunctionCallArguments(Project p, EList<farg> call_args, EList<arg> decl_args, EObject ec) {
		// Check number of arguments
		if (call_args.size() != decl_args.size()) {
			//error("Expecting " + decl_args.size() + " arguments, got " + call_args.size() + " !", AthenaDSLPackage.FUNCTION_CALL__ARGUMENTS);
			return;
		}
		// Check each argument type
		Iterator<farg> it = call_args.iterator();
		for (arg a : decl_args) {
			farg fa = it.next();
			DataType expectedDataType = a.getType();
			DataType foundDataType = findVariableType(p, fa.getVarName(), ec);
			if (foundDataType == null) {
				//error("argument not found, " + fa.getVarName() + ":" + expectedDataType.getName(), AthenaDSLPackage.INTERACTION_CALL);
			} else if (!expectedDataType.getName().equals(foundDataType.getName())) {
				//error("argument type for " + fa.getVarName() + " is incorrect, expecting " + expectedDataType.getName(),
				//		AthenaDSLPackage.INTERACTION_CALL);
			} else {
			}
		}
	}

	/**
	 * 
	 * @param fc
	 */
	public void checkFunctionDeclStartsWithLowerCase(functionDeclaration fc) {
		checkLowerCaseName(fc.getName(), "Name first character should be in lower case", AthenaDSLPackage.FUNCTION_CALL__NAME);
	}

	/**
	 * 
	 * @param fc
	 */
	public void checkProcessingDeclStartsWithLowerCase(ProcessingDeclaration fc) {
		checkLowerCaseName(fc.getName(), "Name first char should be in lower case", AthenaDSLPackage.FUNCTION_CALL__NAME);
	}

	/**
	 * 
	 * @param fc
	 */
	
	public void checkFunctionCall(functionCall fc) {
		Project p = getProject(fc.eContainer());
		checkFunctionCallArguments(p, fc.getArguments(), getDeclaredArgumentsForFunctionCall(p, fc.getName().getName()), fc.eContainer());
	}

	/**
	 * 
	 * @param name
	 * @param proto
	 * @return
	 */
	private architectureElement findArchitectureElementByNameInPrototype(String name, prototypeDeclaration proto) {
		architectureElement elt = findArchitectureElementByNameInList(name, proto.getDefinitions());
		if ((elt == null) && (proto.getSuperType() != null)) {
			elt = findArchitectureElementByNameInPrototype(name, proto.getSuperType());
		}
		return elt;
	}

	/**
	 * 
	 * @param name
	 * @param list
	 * @return
	 */
	private architectureElement findArchitectureElementByNameInList(String name, EList<architectureElement> list) {
		for (architectureElement elt : list) {
			String ename = findArchitectureElementName(elt);
			if ((ename != null) && (name.equals(ename))) {
				return elt;
			}
		}
		return null;
	}

	/**
	 * 
	 * @param in
	 */
	private void checkWhenStatementInInteraction(interactionDeclaration in) {
		if (in.getStateset() != null) {
			statesetDeclaration s = null;
			s = (statesetDeclaration) findArchitectureElementByNameInPrototype(in.getStateset(), (prototypeDeclaration) in.eContainer());
			if (s != null) {
				String statename = in.getWstate();
				if (!checkStateExistsInStateset(statename, s.getStates())) {
					//error("incorrect state " + statename + " for stateset " + in.getStateset() + " in when statement",
					//		AthenaDSLPackage.INTERACTION_CALL);
				}
			} else {
				//error("incorrect stateset " + in.getStateset() + " in when statement", AthenaDSLPackage.INTERACTION_CALL);
			}

		}
	}

	private void checkIfStatementInInteraction(interactionDeclaration in) {
		if (in.getEvent() != null) {
			architectureElement s = null;
			s = findArchitectureElementByNameInPrototype(in.getEvent(), (prototypeDeclaration) in.eContainer());
			if (s == null) {
				//error("incorrect event or signal " + in.getEvent() + " in If statement", AthenaDSLPackage.INTERACTION_CALL);
			}

		}
	}

	/**
	 * 
	 * @param in
	 */
	
	public void checkInteractionCall(interactionDeclaration in) {
		Project p = getProject(in.eContainer());
		for (interactionCall ic : in.getIcalls()) {
			checkFunctionCallArguments(p, ic.getArguments(), getDeclaredArgumentsForFunctionCall(p, ic.getFctName().getName()), in);
		}
		// when statement ?
		checkWhenStatementInInteraction(in);
		// if statement ?
		checkIfStatementInInteraction(in);
	}

	/**
	 * 
	 * @param proto
	 */
	
	public void checkPrototypeDeclaration(prototypeDeclaration proto) {
		checkUpperCaseName(proto.getName(), "Prototype name should start with an upper case letter !",
				AthenaDSLPackage.PROTOTYPE_DECLARATION);
	}

	private boolean checkStateExistsInStateset(String statename, EList<stateDeclaration> states) {
		for (stateDeclaration state : states) {
			if (statename.equals(state.getName())) {
				return true;
			}
		}
		return false;
	}

	private boolean checkEventOrSignal(String name, EObject econtainer) {
		EList<architectureElement> elements = null;
		elements = ((prototypeDeclaration) econtainer).getDefinitions();
		if (elements != null) {
			for (architectureElement elt : elements) {
				if (elt instanceof signalDeclaration) {
					if (((signalDeclaration) elt).getName().equals(name))
						return true;
				} else if (elt instanceof eventDeclaration) {
					if (((eventDeclaration) elt).getName().equals(name))
						return true;
				}
			}
			prototypeDeclaration superType = ((prototypeDeclaration) econtainer).getSuperType();
			if (superType != null)
				return checkEventOrSignal(name, superType);
		}
		return false;
	}

	
	public void checkStateSetDeclaration(statesetDeclaration stateset) {
		EObject econtainer = stateset.eContainer();
		// Check Init State does exist !
		for (transitionDeclaration trans : stateset.getTransitions()) {
			if (!checkStateExistsInStateset(trans.getFrom(), stateset.getStates())) {
				//error("Incorrect FROM state in stateset", AthenaDSLPackage.STATESET_DECLARATION__INIT);
			}
			if (!checkStateExistsInStateset(trans.getTo(), stateset.getStates())) {
				//error("Incorrect TO state in stateset", AthenaDSLPackage.TRANSITION_DECLARATION);
			}
			if (!checkEventOrSignal(trans.getEvt(), econtainer)) {
				//error("Incorrect ON event or signal name: " + trans.getEvt(), AthenaDSLPackage.TRANSITION_DECLARATION);
			}
			if ((trans.getSig() != null) && (!checkEventOrSignal(trans.getSig(), econtainer))) {
				//error("Incorrect RAISED signal name: " + trans.getSig(), AthenaDSLPackage.TRANSITION_DECLARATION);
			}
		}
	}

	/**
	 * 
	 * @param p
	 * @param pname
	 * @return
	 */
	private prototypeDeclaration findPrototype(Project p, String pname) {
		EList<prototypeDeclaration> protoList = p.getPrototypes();
		for (prototypeDeclaration pd : protoList) {
			if (pd.getName().equals(pname)) {
				return pd;
			}
		}
		return null;
	}

	private String findArchitectureElementName(architectureElement elt) {
		if (elt instanceof parameterDeclaration) {
			return ((parameterDeclaration) elt).getName();
		} else if (elt instanceof referenceDeclaration) {
			if (((referenceDeclaration) elt).getAlias() != null) {
				return ((referenceDeclaration) elt).getAlias();
			} else {
				EList<String> qn = ((referenceDeclaration) elt).getName().getName();
				return qn.get(qn.size() - 1);
			}
		} else if (elt instanceof eventDeclaration) {
			return ((eventDeclaration) elt).getName();

		} else if (elt instanceof statesetDeclaration) {
			return ((statesetDeclaration) elt).getName();

		} else if (elt instanceof instanceDeclaration) {
			return ((instanceDeclaration) elt).getName();

		} else if (elt instanceof signalDeclaration) {
			return ((signalDeclaration) elt).getName();

		} else {
			// System.out.println("architecture element name not found, "+elt);
			return "";
		}

	}

	private void checkPrototypeForElement(prototypeDeclaration proto, String name) {
		prototypeDeclaration psuper = proto.getSuperType();
		if (psuper != null) {
			for (architectureElement nelt : psuper.getDefinitions()) {
				if (name.equals(findArchitectureElementName(nelt))) {
					//error("identifier " + name + " allready in use in prototype " + psuper.getName(), AthenaDSLPackage.ARCHITECTURE_ELEMENT);
				}
			}
			checkPrototypeForElement(psuper, name);
		}
	}

	public void checkArchitectureElementOfPrototypes(architectureElement elt) {
		if (elt.eContainer() instanceof prototypeDeclaration) {
			checkPrototypeForElement((prototypeDeclaration) elt.eContainer(), findArchitectureElementName(elt));
		}
	}

	public void checkDefineType(defineType def) {
		if (def.getTypename() instanceof defineType) {
			//error("define " + def.getName() + " aliased another define " + def.getTypename().getName(), AthenaDSLPackage.DEFINE_TYPE);			
		}
	}

	public void checkProject(Project p) {
		//
		boolean found = false;
		for (prototypeDeclaration proto : p.getPrototypes()) {
			if (proto.getName().equals("Root")) {
				found = true;
				break;
			}
		}
		if (!found) {
			//error("Missing root prototype in project !", AthenaDSLPackage.PROJECT__PROTOTYPES);			
		}
		
		//
		for (wrapperDeclaration wrapper : p.getWrappers()) {
			for (String funcName : wrapper.getFunctions()) {
				found = false;
				for (functionDeclaration func : p.getFunctions()) {
					if (func.getName().equals(funcName)) {
						found = true;
						break;
					}
				}
				//if (!found) error("Unknown function name: "+funcName, AthenaDSLPackage.WRAPPER_DECLARATION);			
			}
		}
	}


}
