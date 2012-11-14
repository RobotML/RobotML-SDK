package org.eclipse.robotml.generators.acceleo.mmqueries;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.papyrus.uml.tools.utils.ElementUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.StateMachine;

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
				org.eclipse.papyrus.RobotML.Transition robotml_transition = ElementUtil.getStereotypeApplication(transition, org.eclipse.papyrus.RobotML.Transition.class); 
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
	

}
