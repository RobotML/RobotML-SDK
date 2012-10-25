<%
metamodel http://www.eclipse.org/uml2/2.0.0/UML
import com.cea.ec3m.gentools.core.acceleo.setTriggers
import com.cea.ec3m.gentools.core.acceleo.TransitionService
import com.cea.ec3m.gentools.core.acceleo.UMLTool
import com.cea.ec3m.vsl.ParseVSL
%>

<%script type="uml.Operation" name="cetrigger" post="trim()"%>
	<%implementsInterface.boundPackageRef.qualifiedName%>::ID_<%name%>
	<%-- declare dependency to OperationIDs enumeration --%>
	<%implementsInterface.boundPackageRef.packagedElement("OperationIDs").declareDependency%>
	
	
<%script type="uml.Behavior" name="callExecutor" post="trim()"%>
	executor-><%effect.name%>();
	
	
<%script type="uml.State" name="acceptableEvents"%>

		// loop on state
		// execute action ...
		timeout = -1;	// no timeout by default
<%for (outgoing) {%>
	<%if (trigger.event.eClass().name=="TimeEvent") {%>
		// transition <%name%> - trigger: TimeEvent, expression <%trigger.event.cast("TimeEvent").when.expr.body%>.
		timeout = <%trigger.event.cast("TimeEvent").when.expr.body.getDurationFromVSL%>/1000;
	<%}%>
<%}%>
		// get an event from the pool.
		event = ep->readEvent(timeout);
	
<%for (outgoing) {%>
	<%if (trigger.event.eClass().name=="TimeEvent") {%>
		// transition <%name%> - trigger: TimeEvent (there should be at most one outgoing timed transition per state).
		if (event.operationID == BasicCalls::ContainerServices::EventPool::ID_TIMEOUT) {
			newState = STATE_<%target.name%>;
<%if (effect!=null) {%>			executor-><%get("StateMachine").name%>_<%current(1).name%>_<%effect.name%>();
<%}%>
		}		
	<%}%>
	<%if (trigger.event.eClass().name=="CallEvent") {%> 
		// transition <%name%> - trigger: CallEvent, operation <%trigger.event.cast("CallEvent").operation.name%>
		if (event.operationID == <%trigger.event.cast("CallEvent").operation.cetrigger%>) {
			newState = STATE_<%target.name%>;
<%if (effect!=null) {%>			executor-><%get("StateMachine").name%>_<%current(1).name%>_<%effect.name%>();
<%}%>
		} 
	<%}%>
	<%if (trigger.event.eClass().name=="SignalEvent") {%> 
		// transition <%name%> - trigger: SignalEvent, signal <%trigger.event.cast("SignalEvent").signal.name%>
		if (event.operationID == SIG_<%trigger.event.cast("SignalEvent").signal.name%>) {
			newState = STATE_<%target.name%>) ;
<%if (effect!=null) {%>			executor-><%get("StateMachine").name%>_<%current(1).name%>_<%effect.name%>();
<%}%>
			// ok = EvQUEUE ;
		}
	<%}%>
<%}%>
		if (newState != m_currentState) {
			m_currentState = newState;
		}
