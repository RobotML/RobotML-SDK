<%
metamodel http://www.eclipse.org/uml2/2.1.0/UML

import com.cea.ec3m.gentools.core.PortUtils
%>


<%--
	Args(0) : The component which has the Port
--%>
<%script type="uml.Port" name="generatePort" post="trim()"%>
<%for (getProvided){%><%generateInterface(current(1),true, args(0))%>
<%}%>
<%for (getRequired){%><%generateInterface(current(1),false, args(0))%>
<%}%>

<%script type="uml.Port" name="generateImplPort" post="trim()"%>
<%for (getProvided){%><%generateProvidedImpl%>
<%}%>
<%for (getRequired){%><%generateRequiredImpl%>
<%}%>

<%script type="uml.Interface" name="generateProvidedImpl" post="trim()"%>
-- provided interface <%name%>
<%for (ownedOperation){%>
signal s_<%name%>_select_ : CORBA_Boolean := '1';
<%for (ownedParameter){%>
signal s_<%current(1).name%>_<%direction%>_<%name%> : signed( <%type.generateDatatype%>'range ) := ( others => '0' )
<%}%>

<%}%>

<%script type="uml.Interface" name="generateRequiredImpl" post="trim()"%>
-- required interface <%name%>
<%for (ownedOperation){%>
  signal s_<%name%>_select_ : CORBA_Boolean := '1';
<%for (ownedParameter){%>
  signal s_<%current(1).name%>_<%direction%>_<%name%> : signed( <%type.generateDatatype%>'range ) := ( others => '0' )
<%}%>

<%}%>
<%-- This script generates an Interface
	 Args(0) : Port
	 Args(1) : isProvided ?
	 Args(2) : Component
	 --%>
<%script type="uml.Interface" name="generateInterface" post="trim()"%>
<%for (ownedOperation.sep(";")){%>
-- signals for operation <%name%>
<%generateOperationPushIn(args(0), args(1))%>
<%generateOperationPushOut(args(0), args(1))%>
<%generateOperationParameter(args(0), args(1))%>
<%}%>


<%-- Args(0) : Port
	 Args(1) : isProvided ?
	 --%>
<%script type="uml.Operation" name="generateOperationPushIn" post="trim()"%>
<%args(0).name%>_<%name%>_select : <%if (args(1)){%>in<%}else{%>out<%}%> CORBA_bit;

<%-- Args(0) : Port
	 Args(1) : isProvided ?
	 --%>
<%script type="uml.Operation" name="generateOperationPushOut" post="trim()"%>
<%args(0).name%>_<%name%>_out_enable : <%if (args(1)){%>out<%}else{%>in<%}%> CORBA_bit<%if ( ownedParameter != 0){%>;<%}%>


<%-- Args(0) : Port
	 Args(1) : isProvided ?
	 --%>
<%script type="uml.Operation" name="generateOperationParameter"%>
<%for (ownedParameter){%>
<%generateParameter(args(0),args(1),current(1))%>
<%}%>


<%-- Args(0) : Port
	 Args(1) : isProvided ?
	 Args(2) : Operation
	 --%>
<%script type="uml.Parameter" name ="generateParameter" post="trim()"%>
<%if (direction == "inout"){%>
	<%args(0).name%>_<%args(2).name%>_<%name%>_in : in;
	<%args(0).name%>_<%args(2).name%>_<%name%>_out : out;
<%}else{%>
	<%args(0).name%>_<%args(2).name%>_<%name%> : <%generateDirection(args(1))%> <%type.generateDatatype%>;
<%}%>


<%-- This script computes the direction kind in function of the interface kind (receptacle or facet)
	 Args(0) : isProvided ?
	 --%>
<%script type="uml.Parameter" name="generateDirection" post="trim()"%>
<%if (direction == "in"){%><%if (args(0)==true){%>in<%}else{%>out<%}%><%}%>
<%if (direction == "out"){%><%if (args(0)==true){%>out<%}else{%>in<%}%><%}%>


<%-- This script converts IDL datatype into VHDL datatype --%>
<%script type="uml.Type" name="generateDatatype" post="trim()"%>
<%if (name == "char")               {%>CORBA_char <%}%>
<%if (name == "boolean")            {%>CORBA_boolean <%}%>
<%if (name == "short")              {%>CORBA_short <%}%>
<%if (name == "long")               {%>CORBA_long <%}%>
<%if (name == "long long")          {%>CORBA_long_long <%}%>
<%if (name == "unsigned short")     {%>CORBA_unsigned_short <%}%>
<%if (name == "unsigned long")      {%>CORBA_unsigned_long <%}%>
<%if (name == "unsigned long long") {%>CORBA_unsigned_long_long <%}%>
<%if (name == "octet")              {%>CORBA_octet <%}%>


