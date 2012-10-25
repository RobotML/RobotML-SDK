<%
metamodel http://www.eclipse.org/uml2/2.0.0/UML
import com.cea.ec3m.gentools.core.acceleo.StateService
%>

<%script type="uml.State" name="ignoredEvents"%>
<%if (cast("State").getAppliedStereotypes().nFirst().cast("Stereotype")) 
{%>
<%for (cast("State").getvalue(cast("State").getAppliedStereotypes().nFirst().cast("Stereotype"),"ignoredEvents"))
{%> 
<%if (current(1).cast("State").metamodel::redefinitionContext.owner.ownedElement.cast("SignalEvent").signal.name.nContains(current())) {%>
else if (sr->getServiceNumber() ==  SIG_<% current()%>)
			ok = EvQUIT ;	// Ignored event 
<%}else{%>
else if (sr->getServiceNumber() == <%current(2).cast("State").metamodel::redefinitionContext.name%>::SVC_NR_<% current()%>)
			ok = EvQUIT ;	// Ignored event
<%}%>
<%}%> <%-- fin de for --%>
<%}%>

