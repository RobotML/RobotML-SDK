package org.eclipse.papyrus.generators.xtext.athena.vle.main;

import org.xtext.athenaDSL.DataType;
import org.xtext.athenaDSL.LanguageDeclaration;
import org.xtext.athenaDSL.Project;
import org.xtext.athenaDSL.architectureElement;
import org.xtext.athenaDSL.arrayType;
import org.xtext.athenaDSL.basicType;
import org.xtext.athenaDSL.defineType;
import org.xtext.athenaDSL.functionDeclaration;
import org.xtext.athenaDSL.includeDecl;
import org.xtext.athenaDSL.index;
import org.xtext.athenaDSL.languageDecl;
import org.xtext.athenaDSL.lexicalCastDecl;
import org.xtext.athenaDSL.mapType;
import org.xtext.athenaDSL.parameterDeclaration;
import org.xtext.athenaDSL.prototypeDeclaration;
import org.xtext.athenaDSL.qualifiedName;
import org.xtext.athenaDSL.referenceDeclaration;
import org.xtext.athenaDSL.structElement;
import org.xtext.athenaDSL.structType;
import org.xtext.athenaDSL.unionType;
import org.xtext.athenaDSL.vectorType;

public class DSLQueries
{
	
	private static final String _CPPLang = "CPP";
	private static final String _VLELang = "VLE";
	private static final String _pointerDef = "void*";
	private static final String _enumDef = "enum";
	
	/**
	 * Is a basic type?
	 * @param type
	 * @return
	 */
	public static Boolean isBasicType(DataType type)
	{
		return (type instanceof basicType);
	}
	
	/**
	 * is a cpp include ?
	 * @param decl
	 * @return
	 */
	public static Boolean isCPPInclude(includeDecl decl)
	{	
		return DSLQueries.isCPPLanguage(decl.getLang());
	}
	
	/**
	 * is a VLE include ?
	 * @param decl
	 * @return
	 */
	public static Boolean isVLEInclude(includeDecl decl)
	{	
		return DSLQueries.isVLELanguage(decl.getLang());
	}
	
	/**
	 * is it cpp language ?
	 * @param lang
	 * @return
	 */
	public static Boolean isCPPLanguage(LanguageDeclaration lang)
	{
		return lang.getName().equals(DSLQueries._CPPLang);
	}
	
	/**
	 * it's VLE language?
	 * @param lang
	 * @return
	 */
	public static Boolean isVLELanguage(LanguageDeclaration lang)
	{
		return lang.getName().equals(DSLQueries._VLELang);
	}
	
	/**
	 * is it a cpp function 
	 * @param func
	 * @return
	 */
	public static boolean isCPPFunction(functionDeclaration func)
	{
		return func.getLang().getName().equals(DSLQueries._CPPLang);
	}
	
	/**
	 * get cpp language declaration of a particular basic type
	 */
	public static languageDecl getCPPLanguageDecl(basicType bt)
	{
		languageDecl result = null;
		for (languageDecl lang : bt.getLanguages())
		{
			if (DSLQueries.isCPPLanguage(lang.getLang()))
			{
				result = lang;
				break;
			}
		}
		return result;
	}
	
	/**
	 * get the type of an array data
	 */
	public static String getArrayDatatypeName(arrayType type) 
	{
		return type.getTypename().getName();
	}
	
	/**
	 * does a particular type has an initial value ?
	 */
	public static Boolean hasInitValue(DataType type)
	{
		if (DSLQueries.isBasicType(type)) {
			basicType bt = (basicType) type;
			languageDecl decl = DSLQueries.getCPPLanguageDecl(bt);
			if ((decl.getValue() != null) && (decl.getValue().length() > 0))
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * get the initial value of a basic type
	 */
	public static String getInitValue(basicType bt)
	{
		languageDecl decl = DSLQueries.getCPPLanguageDecl(bt);
		String value = decl.getValue();
		return value;
	}
	
	/**
	 * is it a dynamic array ?
	 */
	public static Boolean isDynamicArray(arrayType type)
	{
		Boolean result = false;
		for (index i : type.getIndices())
		{
			// System.out.println(type.getName()+" ---> "+i.getDim()+" - "+i.getValue()+" - "+i.isHasValue());
			if (!i.isHasValue())
			{
				result = true;
				break;
			}
		}
		return result;
	}
	
	/**
	 * Get the number of dimensions of an array
	 */
	public static int getArrayNumberOfDimension(arrayType type)
	{
		return type.getIndices().size();
	}

	/**
	 * get dynamic allocation arguments
	 */
	public static String getDynamicAllocationFunctionArguments(arrayType type)
	{
		String args = "";
		int i = 0;
		for (index ind : type.getIndices()) 
		{
			if (i > 0)
				args += ", ";
			
			args += "unsigned int " + ind.getDim();
			i += 1;
		}
		return args;
	}
	
	/**
	 * has dynamic array elements ?
	 */
	public static Boolean hasDynamicArrayElements(structType type)
	{
		Boolean result = false;
		for (structElement elt : type.getParameters())
		{
			DataType param = elt.getTypename();
			if (DSLQueries.isArrayType(param) && (DSLQueries.isDynamicArray((arrayType) param)))
			{
				result = true;
				break;
			}
		}
		return result;
	}
	
	/**
	 * get dynamic allocation declaration for struct
	 */
	public static String getDynamicAllocationForStruct(String name, structType type)
	{
		String function = "";
		boolean first = true;
		for (structElement elt : type.getParameters()) 
		{
			DataType param = elt.getTypename();
			if (DSLQueries.isArrayType(param) && (DSLQueries.isDynamicArray((arrayType) param)))
			{
				for (index ind : ((arrayType) param).getIndices())
				{
					if (!ind.isHasValue())
					{
						if (!first)
							function += ", ";
						
						function += "lexical_cast<unsigned int>(get_config()->get(\""
								+ name + "." + ind.getDim() + "\")->get())";
						first = false;
					}
				}
			}
		}
		return function;
	}
	
	/**
	 * get dynamic allocation function for a struct
	 */
	public static String getDynamicAllocationFunctionForStruct(structType type)
	{
		String function = "void allocate(";
		String calls = "";
		int nbTotArgs = 0;
		for (structElement elt : type.getParameters())
		{
			DataType param = elt.getTypename();
			if (DSLQueries.isArrayType(param) && (DSLQueries.isDynamicArray((arrayType) param)))
			{
				calls += "\t\t" + param.getName() + "_allocate(";
				int nbArgs = 0;
				for (index ind : ((arrayType) param).getIndices())
				{
					if (!ind.isHasValue())
					{
						if (nbTotArgs > 0)
							function += ", ";
						
						function += "unsigned int " + ind.getDim();
						nbTotArgs += 1;
					}
					if (nbArgs > 0)
						calls += ", ";
					
					if (ind.isHasValue())
						calls += ind.getValue();
					else
						calls += ind.getDim();
					
					nbArgs += 1;
				}
				calls += ");\n";
			}
		}
		function += ") {\n" + calls + "\t}";
		return function;
	}
	
	/**
	 *  get the size operator of an array (static/dynamic)
	 */
	public static String getArraySizeOperator(arrayType type)
	{
		String result = "";
		if (isDynamicArray(type))
		{
			result = "_val->num_elements()";
		}
		else
		{
			result += type.getIndices().get(0).getValue();
		}
		return result;
	}
	
	/**
	 * is a boolean type ?
	 */
	public static Boolean isArrayType(DataType type)
	{
		return (type instanceof arrayType);
	}
	
	/**
	 * get the dimensions of an array
	 */
	public static String getArrayDimensions(arrayType type)
	{
		String args = "[";
		int i = 0;
		for (index ind : type.getIndices())
		{
			if (i > 0)
				args += ", ";
			
			args += ind.getValue();
			i += 1;
		}
		args += "]";
		return args;
	}

	/**
	 * vector data type name
	 */
	public static String getVectorDatatypeName(vectorType type) 
	{
		return type.getTypename().getName();
	}
	
	/**
	 * map key type name
	 */
	public static String getMapKeyTypeName(mapType type)
	{
		return type.getKeytype().getName();
	}

	/**
	 * map value type name
	 */
	public static String getMapValueTypeName(mapType type)
	{
		return type.getValtype().getName();
	}
	
	/**
	 *  get struct param declaration
	 */
	public static String getStructParamDecl(structElement elt)
	{
		String decl = "";
		decl += elt.getTypename().getName();
		decl += " " + elt.getName();
		return decl;
	}
	
	/**
	 * type behind a define
	 */
	public static String getDefineTypeName(defineType type)
	{
		return type.getTypename().getName();
	}
	
	/**
	 * is a map type ?
	 */
	public static Boolean isMapType(DataType type)
	{
		return (type instanceof mapType);
	}

	/**
	 * is a struct type ?
	 */
	public static Boolean isStructType(DataType type)
	{
		return (type instanceof structType);
	}

	/**
	 * is a Union type ?
	 */
	public static Boolean isUnionType(DataType type)
	{
		// System.out.println("--> type "+type.getName()+" is union ? "+(type
		// instanceof unionType));
		return (type instanceof unionType);
	}

	/**
	 * is a Define type ?
	 */
	public static Boolean isDefineType(DataType type)
	{
		// System.out.println("--> type "+type.getName()+" is define ? "+(type
		// instanceof defineType));
		return (type instanceof defineType);
	}

	/**
	 * is a vector type ?
	 */
	public static Boolean isVectorType(DataType type)
	{
		return (type instanceof vectorType);
	}
	
	/**
	 * get dynamic allocation arguments 
	 */
	public static String getDynamicAllocationFunctionArgumentsCall(arrayType type)
	{
		String args = "";
		for (index ind : type.getIndices()) 
		{
			args += "[" + ind.getDim() + "]";
		}
		return args;
	}
	
	/**
	 * get base type (remove defines)
	 * @param type
	 * @return
	 */
	public static DataType getBaseType(DataType type)
	{
		DataType result = type;
		if (type instanceof defineType) 
		{
			result = ((defineType) type).getTypename();
		}
		return result;
	}
	
	/**
	 * union processing 
	 */
	public static String getTypeIndexInUnion(unionType union, DataType type)
	{
		int i = 1;
		for (DataType _type : union.getElements()) 
		{
			if (_type.getName().equals(type.getName())) 
			{
				return "" + i;
			}
			i += 1;
		}
		return "-1";
	}
	
	/**
	 * is it a one dimension array ?
	 */
	public static Boolean isAOneDimensionArray(arrayType type) 
	{
		return type.getIndices().size() == 1;
	}
	
	/**
	 * build a filename from a post-fixe and name
	 * @param proto
	 * @param end
	 * @return
	 */
	public static String getPrototypeFileName(prototypeDeclaration proto, String end)
	{
		return proto.getName() + end;
	}
	
	/**
	 * is it a reference ?
	 * @param elt
	 * @return
	 */
	public static Boolean isReference(architectureElement elt) 
	{
		return elt instanceof referenceDeclaration;
	}
	
	/**
	 * prototype is an ancestor of another prototype 
	 * @param proto
	 * @param p
	 * @return
	 */
	public static Boolean isAnAncestorOf(prototypeDeclaration proto, prototypeDeclaration p) 
	{
		Boolean result = false;
		if ((proto == null) || (p == null)) 
		{
			System.out.println("----- Something went wrong: isAnAncestorOf");
			System.out.println("\tproto:" + proto);
			System.out.println("\tp:" + p);
		}
		else if(p == proto)
		{
			result = true;
		}
		else
		{
			do 
			{
				proto = proto.getSuperType();
			}
			while ((proto != null) && (p != proto));
			
			if ((proto != null) && (p == proto))
			{
				result = true;
			}
		}
		
		return result;
	}
	
	/**
	 * is it a parameter ?
	 * @param elt
	 * @return
	 */
	public static Boolean isParameter(architectureElement elt)
	{
		return elt instanceof parameterDeclaration;
	}
	
	/**
	 * get a reference name
	 * @param ref
	 * @return
	 */
	public static String getReferenceName(referenceDeclaration ref)
	{
		String result = "";
		if (ref.getAlias() != null)
			result = ref.getAlias();
		else
			result = getNameFromQualifiedName(ref.getName());
		
		return result;
	}
	
	/**
	 * get last qualified name component
	 * @param qn
	 * @return
	 */
	public static String getNameFromQualifiedName(qualifiedName qn)
	{
		return qn.getName().get(qn.getName().size() - 1);
	}


	public static String createInstances(Project project)
	{
		String result = "ERROR on instance creation!!!!";
		InstanceBuilder build = new InstanceBuilder();
//		org.eclipse.robotml.generators.xtext.athena.vle.main.BuildInstance build = new org.eclipse.robotml.generators.xtext.athena.vle.main.BuildInstance();
		try
		{
			result = build.createInstances(project);
		}
		catch(Exception e)
		{
			
		}
		
		return result;
	}
	
	/**
	 * Need pointer cast?
	 * for CPP language only!!!
	 * @param bt
	 * @returnString
	 */
	public static Boolean needPointerCast(basicType bt)
	{
		Boolean result = false;
		

		languageDecl cpp = getCPPLanguageDecl(bt);
		if(cpp != null)
		{
			result = cpp.getTrans().equals(DSLQueries._pointerDef);
		}
		
		return result;
	}
	
	/**
	 * has CPP lexicalcast?
	 * @param type
	 * @return
	 */
	public static Boolean hasCPPLexicalCast(basicType type)
	{
		Boolean result = false;
		for (lexicalCastDecl cast : type.getCasts()) 
		{
			if (DSLQueries.isCPPLanguage(cast.getLang())) 
			{
				result = true;
				break;
			}
		}
		return result;
	}
	
	/**
	 * get cpp lexical cast
	 * @param type
	 * @return
	 */
	public String getCPPLexicalCast(basicType type) 
	{
		String result = type.getName();
		for (lexicalCastDecl cast : type.getCasts()) 
		{
			if (DSLQueries.isCPPLanguage(cast.getLang())) 
			{
				result = cast.getCast();
			}
		}
		return result;
	}
	
	public static Boolean hasVLELexicalCast(basicType type)
	{
		Boolean result = false;
		for(lexicalCastDecl cast : type.getCasts())
		{
			if(DSLQueries.isVLELanguage(cast.getLang()))
			{
				result = true;
				break;
			}
		}
		return result;
	}
	
	public static String getVLELexicalCast(basicType type)
	{
		String result = type.getName();
		for(lexicalCastDecl cast : type.getCasts())
		{
			if(DSLQueries.isVLELanguage(cast.getLang()))
			{
				result = cast.getCast();
				break;
			}
		}
		
		return result;
	}
	
	/**
	 * has CPP language declaration
	 * @param type
	 * @return
	 */
	public static Boolean hasCPPLanguage(basicType type)
	{
		Boolean result = false;
		
		for(languageDecl lang : type.getLanguages())
		{
			if(DSLQueries.isCPPLanguage(lang.getLang()))
			{
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	
	/**
	 * has VLe language declaration
	 * @param type
	 * @return
	 */
	public static Boolean hasVLELanguage(basicType type)
	{
		Boolean result = false;
		
		for(languageDecl lang : type.getLanguages())
		{
			if(DSLQueries.isVLELanguage(lang.getLang()))
			{
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	/**
	 * get the VLE langugage declaration
	 * @param type
	 * @return
	 */
	public static languageDecl getVLELanguageDecl(basicType type)
	{
		languageDecl result = null;
		for (languageDecl lang : type.getLanguages())
		{
			if (DSLQueries.isVLELanguage(lang.getLang()))
			{
				result = lang;
				break;
			}
		}
		return result;
	}

	public static Boolean isEnumeration(basicType type)
	{
		Boolean result = false;
		
		for(languageDecl lang : type.getLanguages())
		{
			if(lang.getTrans().startsWith(DSLQueries._enumDef))
			{
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	/**
	 * Return enumeration
	 * @param type
	 * @return
	 */
	public static String getEnumerationBody(basicType type)
	{
		String value = "";
		for(languageDecl decl : type.getLanguages())
		{
			if(DSLQueries.isCPPLanguage(decl.getLang()))
				value = decl.getTrans();
		}
		return value;
	}
	
	/**
	 * is container ?
	 * @param type
	 * @return
	 */
	public static Boolean isContainer(DataType type)
	{
		return(type instanceof vectorType) || (type instanceof mapType) || (type instanceof arrayType);
	}
	
	public static Boolean hasReference(Project project, prototypeDeclaration prototype)
	{
		Boolean result = false;
		
		for(prototypeDeclaration proto : project.getPrototypes())
		{
			if(DSLQueries.isAnAncestorOf(prototype, proto))
			{
				for(architectureElement elt : proto.getDefinitions())
				{
					result |= DSLQueries.isReference(elt);
				}
			}
		}
		
		return result;
	}
	
	public static Boolean hasParameter(Project project, prototypeDeclaration prototype)
	{
		Boolean result = false;
		
		for(prototypeDeclaration proto : project.getPrototypes())
		{
			if(DSLQueries.isAnAncestorOf(prototype, proto))
			{
				for(architectureElement elt : proto.getDefinitions())
				{
					result |= DSLQueries.isParameter(elt);
				}
			}
		}
		
		return result;
	}
}