<%
metamodel http://www.eclipse.org/uml2/2.1.0/UML
import com.cea.ec3m.gentools.core.acceleo.UMLTool
import com.cea.ec3m.gentools.core.acceleo.utils
import com.cea.ec3m.gentools.core.StUtils
import com.cea.ec3m.gentools.core.PortUtils
%>

<%-- create the C++ signature for an operation (including parenthesis)
	 --%>
<%script type="uml.Operation" name="cppSignature" post="trim()"%>
<%name%> (<%for (ownedParameter.sep(", "))
    {%><%cppParameter (current(1))%><%}%>)
    
<%script type="uml.Operation" name="cppCall" post="trim()"%>
<%name%> (<%for (parametersInInout.sep(", "))
    {%><%name%><%}%>)

<%-- create the C++ code for a parameter within the signature
	 --%>
<%script type="uml.Parameter" name ="cppParameter" post="trim()"%>
	<%type.cppType%><%if (direction == "out") {%>_out<%}%> <%name%>
 


<%-- This script converts UML data types to C++ datatype --%>
<%-- can directly return the qualified name, since delimiters in C++ and UML --%>
<%-- are the same --%>
<%script type="uml.Type" name="cppType" post="trim()"%>
<%if (qualifiedName == "UMLPrimitiveTypes::Boolean") {%>
	bool
<%}else if (qualifiedName == "UMLPrimitiveTypes::Integer") {%>
	int
<%}else{%>
	<%qualifiedName%>
<%}%>

<%-- return void, if type is empty --%>
<%script  type="uml.Operation" name="cppRetType" post="trim ()"%>
<%if (type == null) {%>
	void
<%}else{%>
	<%type.cppType%>
<%}%>

<%-- TODO: use indentTab? => requires making this script recursive --%>
<%script  type="uml.NamedElement" name="openNamespace" post="trim()"%>
<%-- need to include referenced types (assuming a naming convention) --%>
<%for (current.usedNamespaces.reverse) {%>
namespace <%name%> {
<%}%>

<%script type="uml.NamedElement" name="closeNamespace" post="trim()"%>
<%for (current.usedNamespaces) {%>
}; // of namespace <%name%>
<%}%>

<%script type="uml.Class" name="partSignature" post="trim()"%>
<%for (part.sep(", ")) {%><%if (!type.isCompImpl) {%><%type.name%> * <%name%><%}%><%}%>
