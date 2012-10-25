<%
metamodel http://www.eclipse.org/uml2/2.0.0/UML
import com.cea.ec3m.gentools.core.acceleo.TransitionService
%>

<%script type="uml.Transition" name="setTriggers" %>

<%if (target == source) {%>
sr.setTrigger(<%getNumber%>);
<%}else{%>
sr.setTrigger(<%getNumber%>); 
	quitPeriodicSRs();
<%}%>

