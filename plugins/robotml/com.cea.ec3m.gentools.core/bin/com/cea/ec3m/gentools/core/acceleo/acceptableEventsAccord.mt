<%
metamodel http://www.eclipse.org/uml2/2.0.0/UML
import  com.cea.ec3m.gentools.core.acceleo.setTriggers

%>

<%script type="uml.State" name="acceptableEvents" file="<%name%>.cpp" %>

<%for (outgoing) {%>
<%if (i() > 0) {%>
else <%}%>
<%if (trigger.event.eClass().name=="CallEvent") {%> 
if (sr->getServiceNumber() == <%metamodel::redefinitionContext.name%>::SVC_NR_<%trigger.event.cast("CallEvent").operation.name%> ) {
		if (isAcceptable(sr)) {
			// beginning of precondition
			// end of precondition
		<%setTriggers%>
			ok = EvACCEPT ;
		} 
		else {
			ok = EvQUEUE ;
		}	
	}

<%}else{%><%if (trigger.event.eClass().name=="SignalEvent") {%> 
if (sr->getServiceNumber () ==  SIG_<%trigger.event.cast("SignalEvent").signal.name%>) 
{

	sr->setServiceNumber(<%metamodel::redefinitionContext.name%>::SVC_NR_<%effect.specification.name%>) ;
		
	if (isAcceptable(sr)) 
	{
		//beginning of precondition
		//end of precondition
	<%setTriggers%>
		ok = EvACCEPT ;
	} 
	else 
	{
		sr->setServiceNumber(SIG_<%cast("Transition").trigger.event.cast("SignalEvent").signal.name%>) ;
		ok = EvQUEUE ;
	}
	
}
<%}%><%}%> 
<%}%>

