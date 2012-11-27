/*
Copyright INTEMPORA S.A. 2011-2012 

nicolas.dulac@intempora.com

This software is a computer program whose purpose is to transform RobotML models
into RTMaps diagrams and RTMaps components via source code generation techniques.

This software is governed by the CeCILL-C  license under French law and
abiding by the rules of distribution of free software.  You can  use, 
modify and/ or redistribute the software under the terms of the CeCILL
license as circulated by CEA, CNRS and INRIA at the following URL
"http://www.cecill.info". 

As a counterpart to the access to the source code and  rights to copy,
modify and redistribute granted by the license, users are provided only
with a limited warranty  and the software's author,  the holder of the
economic rights,  and the successive licensors  have only  limited
liability. 

In this respect, the user's attention is drawn to the risks associated
with loading,  using,  modifying and/or developing or reproducing the
software by the user in light of its specific status of free software,
that may mean  that it is complicated to manipulate,  and  that  also
therefore means  that it is reserved for developers  and  experienced
professionals having in-depth computer knowledge. Users are therefore
encouraged to load and test the software's suitability as regards their
requirements in conditions enabling the security of their systems and/or 
data to be ensured and,  more generally, to use and operate it in the 
same conditions as regards security. 

The fact that you are presently reading this means that you have had
knowledge of the CeCILL-C license and that you accept its terms.
*/
package org.eclipse.robotml.generators.acceleo.rtmaps;

public class RTMapsDataTypeQueries {

	public String getNbElementsInVector(String type_name, String ioelt_name, String return_value_name) {
		if (type_name.compareTo("Bool") == 0 ||
				type_name.compareTo("Int8") == 0 ||
				type_name.compareTo("UInt8") == 0 ||
				type_name.compareTo("Int16") == 0 ||
				type_name.compareTo("UInt16") == 0 ||
				type_name.compareTo("Int32") == 0 ||
				type_name.compareTo("Byte") == 0 ||
				type_name.compareTo("Char") == 0 ||
				type_name.compareTo("UInt32") == 0 ||
				type_name.compareTo("Int64") == 0 ||
				type_name.compareTo("UInt64") == 0 ||
				type_name.compareTo("Time") == 0 ||
				type_name.compareTo("Duration")==0 ||
				type_name.compareTo("Float32")==0 ||
				type_name.compareTo("Float64")==0)
				
		{
			return "int " + return_value_name + " = " + ioelt_name  + "->VectorSize();";
		} else if (type_name.compareTo("String") == 0) {
			return "[Strings are not supported yet.]";
		} else {
			return  "int " + return_value_name + " = " + ioelt_name + "->VectorSize() / sizeof(" + type_name + ");";
		}
	}
	
	public String setVectorSizeForVector(String type_name, int nb_elements, String ioelt_name) {
		if (type_name.compareTo("Bool") == 0 ||
				type_name.compareTo("Int8") == 0 ||
				type_name.compareTo("UInt8") == 0 ||
				type_name.compareTo("Int16") == 0 ||
				type_name.compareTo("UInt16") == 0 ||
				type_name.compareTo("Int32") == 0 ||
				type_name.compareTo("Byte") == 0 ||
				type_name.compareTo("Char") == 0 ||
				type_name.compareTo("UInt32") == 0 ||
				type_name.compareTo("Int64") == 0 ||
				type_name.compareTo("UInt64") == 0 ||
				type_name.compareTo("Time") == 0 ||
				type_name.compareTo("Duration")==0 ||
				type_name.compareTo("Float32")==0 ||
				type_name.compareTo("Float64")==0)
				
		{
			return ioelt_name  + "->VectorSize() = " + nb_elements + ";";
		} else if (type_name.compareTo("String") == 0) {
			return "[Strings are not supported yet.]";
		} else {
			return ioelt_name  + "->VectorSize() = " + nb_elements + " * sizeof(" + type_name + ");";
		}
	}
	
	public String getMAPSIOEltAccessFunction(String type_name, String ioelt_name, String return_var_name)
	{
		if (type_name.compareTo("Bool") == 0 ||
				type_name.compareTo("Int8") == 0 ||
				type_name.compareTo("UInt8") == 0 ||
				type_name.compareTo("Int16") == 0 ||
				type_name.compareTo("UInt16") == 0 ||
				type_name.compareTo("Int32") == 0) 
		{
			return "MAPSInt32* "+ return_var_name +" = &" + ioelt_name + "->Integer32();";
		} else if (type_name.compareTo("Byte") == 0 ||
				type_name.compareTo("Char") == 0) {
			return "char* " +return_var_name + " = " + ioelt_name + "->Stream8();";
		} else if (type_name.compareTo("UInt32") == 0 ||
			type_name.compareTo("Int64") == 0 ||
			type_name.compareTo("UInt64") == 0 ||
			type_name.compareTo("Time") == 0 ||
			type_name.compareTo("Duration")==0)
		{
			return "MAPSInt64* "+ return_var_name +" = &" + ioelt_name + "->Integer64();";
		} else if (type_name.compareTo("Float32")==0) {
			return "MAPSFloat32* "+ return_var_name +" = &" + ioelt_name + "->Float32();";
		} else if (type_name.compareTo("Float64")==0) {
			return "MAPSFloat64* "+ return_var_name +" = &" + ioelt_name + "->Float64();";
		} else if (type_name.compareTo("String") == 0) {
			return "[Strings are not supported yet.]";
		} else {
			return type_name + "* " + return_var_name + " = (" + type_name + "*)" + ioelt_name + "->Data();";
		}
	}
	
	public String getMAPSIOEltReturnType(String type_name)
	{
		if (type_name.compareTo("Bool") == 0 ||
				type_name.compareTo("Int8") == 0 ||
				type_name.compareTo("UInt8") == 0 ||
				type_name.compareTo("Int16") == 0 ||
				type_name.compareTo("UInt16") == 0 ||
				type_name.compareTo("Int32") == 0) 
		{
					return "MAPSInt32*";
		} else if (type_name.compareTo("Byte") == 0 ||
				type_name.compareTo("Char") == 0) {
			return "MAPSUInt8*";
		} else if (type_name.compareTo("UInt32") == 0 ||
			type_name.compareTo("Int64") == 0 ||
			type_name.compareTo("UInt64") == 0 ||
			type_name.compareTo("Time") == 0 ||
			type_name.compareTo("Duration")==0)
		{
			return "MAPSInt64*";
		} else if (type_name.compareTo("Float32")==0) {
			return "MAPSFloat32* ";
		} else if (type_name.compareTo("Float64")==0) {
			return "MAPSFloat64*";
		} else if (type_name.compareTo("String") == 0) {
			return "MAPSRobotMLString*";
		} else {
			return type_name + "*";
		}
		
	}
	
	public String getRTMapsOutputDefForPrimitiveType(String output_name, String type_name, int multiplicity) {
		String s = "MAPS_OUTPUT(\"" + output_name + "\",";
		if (type_name.compareTo("Bool") == 0 ||
			type_name.compareTo("Int8") == 0 ||
			type_name.compareTo("UInt8") == 0 ||
			type_name.compareTo("Int16") == 0 ||
			type_name.compareTo("UInt16") == 0 ||
			type_name.compareTo("Int32") == 0) 
		{
			s+= "MAPS::Integer32";
		} else if (type_name.compareTo("Byte") == 0 ||
				type_name.compareTo("Char") == 0) {
			s+= "MAPS::Stream8";
		} else if (type_name.compareTo("UInt32") == 0 ||
			type_name.compareTo("Int64") == 0 ||
			type_name.compareTo("UInt64") == 0 ||
			type_name.compareTo("Time") == 0 ||
			type_name.compareTo("Duration")==0)
		{
			s+= "MAPS::Integer64";
		} else if (type_name.compareTo("Float32")==0) {
			s+= "MAPS::Float32";
		} else if (type_name.compareTo("Float64")==0) {
			s+= "MAPS::Float64";
		} else if (type_name.compareTo("String") == 0) {
			return "MAPS_OUTPUT_USER_STRUCTURE(" + output_name + ",MAPSRobotMLString)";
		}
		s+= ",NULL,NULL,";
		if (multiplicity <= 0)
			s+= "DEFAULT_MAX_OUTPUT_VECTOR_SIZE";
		else
			s+= multiplicity;
		s+= ")";
		return s;
	}
	
	public String getRTMapsInputDefForPrimitiveType(String input_name, String type_name) {
		String s = "MAPS_INPUT(\"" + input_name + "\",";
		if (type_name.compareTo("Bool") == 0 ||
			type_name.compareTo("Int8") == 0 ||
			type_name.compareTo("UInt8") == 0 ||
			type_name.compareTo("Int16") == 0 ||
			type_name.compareTo("UInt16") == 0 ||
			type_name.compareTo("Int32") == 0) 
		{
			s+= "MAPS::FilterInteger32";
		} else if (type_name.compareTo("Byte") == 0 ||
				type_name.compareTo("Char") == 0) {
			s+= "MAPS::FilterStream8";
		} else if (type_name.compareTo("UInt32") == 0 ||
			type_name.compareTo("Int64") == 0 ||
			type_name.compareTo("UInt64") == 0 ||
			type_name.compareTo("Time") == 0 ||
			type_name.compareTo("Duration")==0)
		{
			s+= "MAPS::FilterInteger64";
		} else if (type_name.compareTo("Float32")==0) {
			s+= "MAPS::FilterFloat32";
		} else if (type_name.compareTo("Float64")==0) {
			s+= "MAPS::FilterFloat64";
		} else if (type_name.compareTo("String") == 0) {
			s+= "MAPSFilterRobotMLString";
		}
		s+= ",MAPS::FifoReader)";
		return s;
	}
	
	public String getPckOutputDir(String dummy) {
		String os = System.getProperty("os.name");
		if (os.toLowerCase().startsWith("linux"))
			return "packages/linux_x86/";
		else
			return "packages/";
	}
}
