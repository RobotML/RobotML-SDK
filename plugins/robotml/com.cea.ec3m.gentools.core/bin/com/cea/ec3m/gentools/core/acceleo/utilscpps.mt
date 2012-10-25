<%
metamodel http://www.eclipse.org/uml2/2.1.0/UML

import com.cea.ec3m.gentools.core.acceleo.UMLTool
import com.cea.ec3m.gentools.core.deployment.DepUtils
%>

<%-- TODO: old and obsolete code (still used by .cdp/.idl generators?) --%>
<%-- wrong name, easy confusion with utils_cpp --%>

<%--
  -- This script returns the file name if the package has the stereotype DeploymentPlan
  --
  -- args(0): a prefix of the filename
  -- args(1): a postfix of the filename (usually an extension such as .cpp)
  --%>
<%script type="uml.Package" name="depPlanFileName" post="trim()"%>
<%if (current.isStereotypeApplied("DeploymentPlan") == true){%>
	<%args(0)%><%getMainInstance.name%><%args(1)%>
<%}%>

<%--
  -- This script returns the file name if the package has the good stereotype
  -- (todo: generic script that takes stereotype name as parameter?)
  --%>
<%script type="uml.Class" name="componentAssemblyFile" post="trim()"%>
<%if (current.isStereotypeApplied("ComponentAssembly") == true){%>
	<%dirName%><%args(0)%>
<%}%>


<%script type="uml.NamedElement" name="fullName" post="trim()"%>
<%for (usedNamespaces.reverse.sep("::")) {%><%name%><%}%>

<%script type="uml.NamedElement" name="packageName" post="trim()"%>
<%owner.filter("Package").fullName%>
	
<%script type="uml.NamedElement" name="dirName" post="trim()"%>
<%for (usedNamespaces.reverse.sep("/")) {%><%name%><%}%>/<%name%>

