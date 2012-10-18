<%
metamodel http://www.eclipse.org/uml2/2.1.0/UML

import com.cea.ec3m.gentools.core.acceleo.UMLTool
import com.cea.ec3m.gentools.core.PortUtils
import com.cea.ec3m.gentools.core.StUtils
import com.cea.ec3m.gentools.core.deployment.DepUtils
%>

<%--
  -- This script returns the file name if the package has the stereotype DeploymentPlan
  --
  -- args(0): a prefix of the filename
  -- args(1): a postfix of the filename (usually an extension such as .cpp)
  --%>
<%script type="uml.Package" name="depPlanFileName" post="trim()"%>
<%if (current.isApplied("FCM::DeploymentPlan") == true){%>
	<%args(0)%><%getMainInstance.name%><%args(1)%>
<%}%>

<%--
  -- This script returns the file name if the package has the good stereotype
  -- (todo: generic script that takes stereotype name as parameter?)
  --%>
<%script type="uml.Class" name="componentAssemblyFile" post="trim()"%>
<%if (current.isAssembly) {%>
	<%dirName%><%args(0)%>
<%}%>


<%script type="uml.NamedElement" name="fullName" post="trim()"%>
<%for (usedNamespaces.reverse.sep("::")) {%><%name%><%}%>

<%script type="uml.NamedElement" name="packageName" post="trim()"%>
<%owner.filter("Package").fullName%>
	
<%script type="uml.NamedElement" name="dirName" post="trim()"%>
<%for (usedNamespaces.reverse.sep("/")) {%><%name%><%}%>/<%name%>

<%-- args(0): opposite connector end --%>
<%script type="uml.ConnectorEnd" name="connectEnd"%>
<%if (role.getRequired) {%>
<%partWithPort.name%>->connect_<%role.name%> (<%args(0).partWithPort.name%>->get_<%args(0).role.name%> ());
<%}%>

<%-- for CPP => move to suitable space (separate plug-in?) --%>
<%-- args(0): connector type --%>
<%script type="uml.Connector" name="createConnection" post="trim()"%>
<%-- loop over connector ends, this is a simple connection with exactly
     one provided and one required port, we start therefore with the
     required part and then the provided part --%>
<%for (end) {%>
	<%connectEnd (current(1).oppositeConnEnd(current))%>
<%}%>

<%-- args(0) = name of the instance --%>
<%script type="uml.InstanceSpecification" name="createInstances"%>
<%createInstancesx("test")%>

<%-- args(0) = name of the instance --%>
<%script type="uml.InstanceSpecification" name="createInstancesx"%>
<%-- // instance <%name%> --%>
<%args(0)%> = new <%getClassifier.name%> ();
<%for (slot) {%>
<%getInstance.createInstancesx(args(0)+"->"+definingFeature.name)%>
<%}%>
