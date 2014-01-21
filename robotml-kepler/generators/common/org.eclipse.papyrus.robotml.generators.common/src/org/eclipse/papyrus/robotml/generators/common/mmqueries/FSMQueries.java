/*****************************************************************************
 * Copyright (c) 2013 PROTEUS Project consortium.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Sebastien BONNET (EFFIDENCE) - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.robotml.generators.common.mmqueries;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.FunctionBehavior;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Transition;
public class FSMQueries {
	/**
	 * Find all states in a state machine.
	 * @param sm a state machine
	 * @return a list of states
     * @todo a valider par Nicolas 
	 */
	public List<org.eclipse.uml2.uml.Vertex> getStates(StateMachine sm)
	{
		LinkedList<org.eclipse.uml2.uml.Vertex> res = new LinkedList<org.eclipse.uml2.uml.Vertex>();
		for (org.eclipse.uml2.uml.Region region : sm.getRegions())	
			for(org.eclipse.uml2.uml.Vertex vertex : region.getSubvertices())
				res.add((org.eclipse.uml2.uml.Vertex)vertex);
		
		return res;
	}
	
	/**
	 * Find all transitions in a state machine.
	 * @param sm a state machine
	 * @return a list of transitions
     * @todo a valider par Nicolas 
	 */
	public List<org.eclipse.papyrus.RobotML.Transition> getTransitions(StateMachine sm)
	{
		LinkedList<org.eclipse.papyrus.RobotML.Transition> res = new LinkedList<org.eclipse.papyrus.RobotML.Transition>();
		for (org.eclipse.uml2.uml.Region region : sm.getRegions())
		{
			for(org.eclipse.uml2.uml.Transition transition : region.getTransitions())
			{
				org.eclipse.papyrus.RobotML.Transition robotml_transition = UMLUtil.getStereotypeApplication(transition, org.eclipse.papyrus.RobotML.Transition.class); 
				if(robotml_transition != null)
				{
					res.add(robotml_transition);
				}
			}
		}
		return res;
	}
	
	/**
	 * Find all state machines in a component.
	 * @param elt
	 * @return a list of state machines
	 * @todo a valider par Nicolas
	 */
	public List<StateMachine> getStateMachines(Element elt)
	{
		LinkedList<StateMachine> res = new LinkedList<StateMachine>();
 
		for (Element child : elt.getOwnedElements())
			if (child instanceof StateMachine)
				res.add((StateMachine)child);
		
		return res;
	}
	
	/**
	 * Generate the state operation
	 * @param vertex
	 * @return
	 */
//	public String generateOperationStateString(org.eclipse.uml2.uml.Vertex vertex)
//	{
//		String result = "";
//		if(vertex instanceof State)
//		{
//			org.eclipse.papyrus.RobotML.State state = UMLUtil.getStereotypeApplication(vertex, org.eclipse.papyrus.RobotML.State.class);
//			if(state != null)
//			{
//				if(state.getOperation() != null)
//				{
//					String operation = state.getOperation().getBase_Operation().getName();
//					result = operation;
//				}
//			}
//		}
//		return result;
//	}
	
	
	static private List<NamedElement> getAllBehaviorFromModel(NamedElement ne)
	{
		LinkedList<NamedElement> res = new LinkedList<NamedElement>();
		
		if(ne != null)
		{
			for(Element elt : ne.getOwnedElements())
			{
				if(elt instanceof Behavior)
				{
					res.add((NamedElement)elt);
				}
				else if(elt instanceof PackageImport)
				{
					PackageImport imp = (PackageImport)elt;
					res.addAll(getAllBehaviorFromModel((NamedElement)imp.getImportedPackage()));
				}
				else if((elt instanceof org.eclipse.uml2.uml.Class) || 
						(elt instanceof org.eclipse.uml2.uml.Package))
				{
					res.addAll(getAllBehaviorFromModel((NamedElement)elt));
				}
			}
		}
		
		return res;
	}
	static public List<NamedElement> getBehaviorFromModel(NamedElement ne)
	{
		List<NamedElement> res = getAllBehaviorFromModel(ne);
		FSMQueries query = new FSMQueries();
		List<StateMachine> sms = query.getStateMachines(ne);
		
		for(StateMachine sm : sms)
		{
			res.removeAll(getTransitionBehavior((Model)ne, sm));
		}
		
		return res;
	}
	
	static public List<NamedElement> getOpaqueBehaviorFromModel(NamedElement ne)
	{
		List<NamedElement> res = getAllBehaviorFromModel(ne);
		FSMQueries query = new FSMQueries();
		List<StateMachine> sms = query.getStateMachines(ne);
		
		res.removeAll(sms);
		for(StateMachine sm : sms)
		{
			res.removeAll(getTransitionBehavior((Model)ne, sm));
		}
		
		ArrayList<NamedElement> tmp = new ArrayList<NamedElement>();
		for(NamedElement elem : res)
		{
			if(elem instanceof FunctionBehavior)
				tmp.add(elem);
		}
		res.removeAll(tmp);
		
		return res;
	}
	
	static public List<NamedElement> getUniqueBehaviorFromModel(NamedElement ne)
	{
		List<NamedElement> res = getAllBehaviorFromModel(ne);
		FSMQueries query = new FSMQueries();
		List<StateMachine> sms = query.getStateMachines(ne);
		
		res.removeAll(sms);
		for(StateMachine sm : sms)
		{
			res.removeAll(getTransitionBehavior((Model)ne, sm));
		}
		
		ArrayList<NamedElement> tmp = new ArrayList<NamedElement>();
		for(NamedElement elem : res)
		{
			if(elem instanceof OpaqueBehavior)
				tmp.add(elem);
		}
		res.removeAll(tmp);
		return res;
	}
	/**
	 * Return the FSM OpaqueBehavior list
	 * @param model
	 * @param sm
	 * @return
	 */
	static public List<Behavior> getTransitionBehavior(Model model, StateMachine sm)
	{
		LinkedList<Behavior> res = new LinkedList<Behavior>();
		
		FSMQueries query = new FSMQueries();

		List<org.eclipse.papyrus.RobotML.Transition> transitions = query.getTransitions(sm);
		for(org.eclipse.papyrus.RobotML.Transition transition : transitions)
		{
			if(transition.getGuard() != null)
				res.add(transition.getGuard());
			if(transition.getEffect() != null)
				res.add(transition.getEffect());
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
		if((list.size() > 0) && (hasFSMInParent(getSuperClass(classe)) == false))
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
			result = hasFSMInParent(getSuperClass(classe));
			FSMQueries queries = new FSMQueries();
			LinkedList<StateMachine> list = (LinkedList<StateMachine>) queries.getStateMachines(classe);
			result |= (list.size() > 0);
		}
		
		return result;
	}

}
