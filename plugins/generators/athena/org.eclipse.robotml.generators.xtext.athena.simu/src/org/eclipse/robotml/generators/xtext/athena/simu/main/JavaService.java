package org.eclipse.robotml.generators.xtext.athena.simu.main;

import org.eclipse.emf.common.util.EList;
import org.xtext.athenaDSL.DataType;
import org.xtext.athenaDSL.FuncProc;
import org.xtext.athenaDSL.LanguageDeclaration;
import org.xtext.athenaDSL.ProcessingDeclaration;
import org.xtext.athenaDSL.Project;
import org.xtext.athenaDSL.architectureElement;
import org.xtext.athenaDSL.arg;
import org.xtext.athenaDSL.argumentsDeclaration;
import org.xtext.athenaDSL.arrayType;
import org.xtext.athenaDSL.basicType;
import org.xtext.athenaDSL.defineType;
import org.xtext.athenaDSL.eventCondition;
import org.xtext.athenaDSL.eventDeclaration;
import org.xtext.athenaDSL.farg;
import org.xtext.athenaDSL.functionCall;
import org.xtext.athenaDSL.functionDeclaration;
import org.xtext.athenaDSL.ifblock;
import org.xtext.athenaDSL.includeDecl;
import org.xtext.athenaDSL.index;
import org.xtext.athenaDSL.instanceDeclaration;
import org.xtext.athenaDSL.interactionCall;
import org.xtext.athenaDSL.interactionDeclaration;
import org.xtext.athenaDSL.languageDecl;
import org.xtext.athenaDSL.lexicalCastDecl;
import org.xtext.athenaDSL.mapType;
import org.xtext.athenaDSL.parameterDeclaration;
import org.xtext.athenaDSL.prototypeDeclaration;
import org.xtext.athenaDSL.qualifiedName;
import org.xtext.athenaDSL.referenceDeclaration;
import org.xtext.athenaDSL.signalDeclaration;
import org.xtext.athenaDSL.stateDeclaration;
import org.xtext.athenaDSL.statement;
import org.xtext.athenaDSL.statesetDeclaration;
import org.xtext.athenaDSL.structElement;
import org.xtext.athenaDSL.structType;
import org.xtext.athenaDSL.unionType;
import org.xtext.athenaDSL.vectorType;
import org.xtext.athenaDSL.whileblock;
import org.xtext.athenaDSL.impl.AthenaDSLFactoryImpl;

public class JavaService {

	//
	AthenaDSLFactoryImpl factory = new AthenaDSLFactoryImpl();

	/**
	 * 
	 * @param proto
	 * @param p
	 * @return
	 */
	public boolean isAnAncestorOf(prototypeDeclaration proto,
			prototypeDeclaration p) {
		if ((proto==null)||(p==null)) {
			System.out.println("----- Something went wrong: isAnAncestorOf");
			System.out.println("\tproto:"+proto);
			System.out.println("\tp:"+p);
			return false;
		}
		if (p == proto)
			return true;
		else {
			do {
				proto = proto.getSuperType();
			} while ((proto != null) && (p != proto));
			if ((proto != null) && (p == proto))
				return true;
		}
		return false;
	}

	/**
	 * 
	 * @param ref
	 * @return
	 */
	public String getReferenceName(referenceDeclaration ref) {
		if (ref.getAlias() != null)
			return ref.getAlias();
		else
			return getNameFromQualifiedName(ref.getName());
	}

	/**
	 * 
	 * @param qn
	 * @return
	 */
	public String getNameFromQualifiedName(qualifiedName qn) {
		return qn.getName().get(qn.getName().size() - 1);
	}

	/**
	 * 
	 */
	public JavaService() {
		AthenaDSLFactoryImpl.init();
	}

	/**
	 * 
	 * @param elt
	 * @return
	 */
	public boolean isReference(architectureElement elt) {
		return elt instanceof referenceDeclaration;
	}

	/**
	 * 
	 * @param elt
	 * @return
	 */
	public boolean isParameter(architectureElement elt) {
		return elt instanceof parameterDeclaration;
	}

	/**
	 * 
	 * @param elt
	 * @return
	 */
	public boolean isInstance(architectureElement elt) {
		if (elt instanceof instanceDeclaration) {
			instanceDeclaration inst = (instanceDeclaration) elt;
			System.out.println("instance " + inst.getName() + " of "
					+ inst.getTypeName().getName());
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param elt
	 * @return
	 */
	public instanceDeclaration getInstance(architectureElement elt) {
		return (instanceDeclaration) elt;
	}

	/**
	 * 
	 * @param elt
	 * @return
	 */
	public boolean isSignal(architectureElement elt) {
		return elt instanceof signalDeclaration;
	}

	/**
	 * 
	 * @param elt
	 * @return
	 */
	public boolean isEvent(architectureElement elt) {
		return elt instanceof eventDeclaration;
	}

	/**
	 * 
	 * @param elt
	 * @return
	 */
	public boolean isAnInteraction(architectureElement elt) {
		return elt instanceof interactionDeclaration;
	}

	/**
	 * 
	 * @param decl
	 * @return
	 */
	public String getSignatureFromArgs(argumentsDeclaration decl) {
		String sig = "";
		try {
			boolean first = true;
			for (arg a : decl.getArguments()) {
				if (!first)
					sig += ", ";
				if (a.getModifier().toLowerCase().equals("in"))
					sig += "const ";
				sig += a.getType().getName() + "& " + a.getName();
				first = false;
			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(decl);
			e.printStackTrace();
		}
		return sig;
	}

	/**
	 * 
	 * @param func
	 * @return
	 */
	public String getFunctionSignature(functionDeclaration func) {
		if (func.getArgs() != null) {
			return getSignatureFromArgs(func.getArgs());
		} else
			return "";
	}

	/**
	 * 
	 * @param func
	 * @return
	 */
	public String getProcessingSignature(ProcessingDeclaration proc) {
		if (proc.getArgs() != null) {
			return getSignatureFromArgs(proc.getArgs());
		} else
			return "";
	}

	/**
	 * 
	 * @param proc
	 * @return
	 */
	public String getFunctorDeclaration(FuncProc proc) {
		if (proc instanceof functionDeclaration) {
			return getFunctionSignature((functionDeclaration) proc);
		} else
			return getProcessingSignature((ProcessingDeclaration) proc);
	}

	/**
	 * 
	 * @param elt
	 * @return
	 */
	public boolean isStateSet(architectureElement elt) {
		return elt instanceof statesetDeclaration;
	}

	/**
	 * 
	 * @param stateset
	 * @return
	 */
	public String getStateSetStates(statesetDeclaration stateset) {
		boolean first = true;
		String str = "";
		for (stateDeclaration state : stateset.getStates()) {
			if (!first)
				str += ", ";
			str += state.getName();
			first = false;
		}
		return str;
	}

	/**
	 * 
	 */
	public boolean isBuffer(DataType type) {
		return type.getName().equals("Buffer");
	}

	/**
	 * 
	 * @param proto
	 * @param end
	 * @return
	 */
	public String getPrototypeFileName(prototypeDeclaration proto, String end) {
		return proto.getName() + end;
	}

	/**
	 * 
	 */
	private static final String CPPLang = "CPP";

	/**
	 * 
	 * @param lang
	 * @return
	 */
	public static boolean isCPPLanguage(LanguageDeclaration lang) {
		return lang.getName().equals(CPPLang);
	}

	/**
	 * 
	 * @param func
	 * @return
	 */
	public boolean isCPPFunction(functionDeclaration func) {
		return func.getLang().getName().equals(CPPLang);
	}

	/**
	 * 
	 * @param lang
	 * @return
	 */
	public String getCPPFunctionSignature(functionDeclaration func) {
		return getSignatureFromArgs(func.getArgs());
	}

	/**
	 * 
	 * @param type
	 * @return
	 */
	public String getCPPLexicalCast(basicType type) {
		for (lexicalCastDecl cast : type.getCasts()) {
			if (isCPPLanguage(cast.getLang())) {
				return cast.getCast();
			}
		}
		return type.getName();
	}

	/**
	 * 
	 * @param type
	 * @return
	 */
	public DataType getBaseType(DataType type) {
		if (type instanceof defineType) {
			return ((defineType) type).getTypename();
		}
		return type;
	}

	/**
	 * 
	 * @param decl
	 * @return
	 */
	public boolean isCPPInclude(includeDecl decl) {
		if (isCPPLanguage(decl.getLang())) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 */
	public languageDecl getCPPLanguageDecl(basicType bt) {
		for (languageDecl lang : bt.getLanguages()) {
			if (isCPPLanguage(lang.getLang())) {
				return lang;
			}
		}
		return null;
	}

	/**
	 * 
	 */
	public boolean isBasicType(DataType type) {
		return (type instanceof basicType);
	}

	/**
	 * 
	 */
	public boolean isArrayType(DataType type) {
		return (type instanceof arrayType);
	}

	/**
	 * 
	 */
	public boolean isMapType(DataType type) {
		return (type instanceof mapType);
	}

	/**
	 * 
	 */
	public boolean isStructType(DataType type) {
		return (type instanceof structType);
	}

	/**
	 * 
	 */
	public boolean isUnionType(DataType type) {
		// System.out.println("--> type "+type.getName()+" is union ? "+(type
		// instanceof unionType));
		return (type instanceof unionType);
	}

	/**
	 * 
	 */
	public boolean isDefineType(DataType type) {
		// System.out.println("--> type "+type.getName()+" is define ? "+(type
		// instanceof defineType));
		return (type instanceof defineType);
	}

	/**
	 * 
	 */
	public boolean isVectorType(DataType type) {
		return (type instanceof vectorType);
	}

	/**
	 * 
	 */
	public boolean hasDynamicArrayElements(structType type) {
		for (structElement elt : type.getParameters()) {
			DataType param = elt.getTypename();
			if (isArrayType(param) && (isDynamicArray((arrayType) param))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param type
	 * @return
	 */
	public String getXmlArrayDims(arrayType param) {
		String function = "";
		if (isDynamicArray((arrayType) param)) {
			for (index ind : ((arrayType) param).getIndices()) {
				if (!ind.isHasValue()) {
					function += " " + ind.getDim() + "=\"1\"";
				} else {
					function += " " + ind.getDim() + "=\"" + (ind.getValue())
							+ "\"";
				}
			}
		}
		return function;

	}

	/**
	 * 
	 * @param type
	 * @return
	 */
	public String getXmlStructDims(structType type) {
		String function = "";
		for (structElement elt : type.getParameters()) {
			DataType param = elt.getTypename();
			if (isArrayType(param)) {
				function += getXmlArrayDims((arrayType) param);
			}
		}
		return function;

	}

	/**
	 * 
	 */
	public String getDynamicAllocationForStruct(String name, structType type) {
		String function = "";
		boolean first = true;
		for (structElement elt : type.getParameters()) {
			DataType param = elt.getTypename();
			if (isArrayType(param) && (isDynamicArray((arrayType) param))) {
				for (index ind : ((arrayType) param).getIndices()) {
					if (!ind.isHasValue()) {
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
	 * 
	 */
	public String getDynamicAllocationFunctionForStruct(structType type) {
		String function = "void allocate(";
		String calls = "";
		int nbTotArgs = 0;
		for (structElement elt : type.getParameters()) {
			DataType param = elt.getTypename();
			if (isArrayType(param) && (isDynamicArray((arrayType) param))) {
				calls += "\t\t" + param.getName() + "_allocate(";
				int nbArgs = 0;
				for (index ind : ((arrayType) param).getIndices()) {
					if (!ind.isHasValue()) {
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
	 * 
	 */
	public String getStructParamDecl(structElement elt) {
		String decl = "";
		decl += elt.getTypename().getName();
		decl += " " + elt.getName();
		return decl;
	}

	/**
	 * 
	 */
	public String getVectorDatatypeName(vectorType type) {
		return type.getTypename().getName();
	}

	/**
	 * 
	 */
	public String getMapKeyTypeName(mapType type) {
		return type.getKeytype().getName();
	}

	/**
	 * 
	 */
	public String getMapValueTypeName(mapType type) {
		return type.getValtype().getName();
	}

	/**
	 * 
	 */
	public String getDefineTypeName(defineType type) {
		return type.getTypename().getName();
	}

	/**
	 * 
	 */
	public boolean isDynamicArray(arrayType type) {
		for (index i : type.getIndices()) {
			// System.out.println(type.getName()+" ---> "+i.getDim()+" - "+i.getValue()+" - "+i.isHasValue());
			if (!i.isHasValue()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 */
	public String getDynamicAllocationFunctionArguments(arrayType type) {
		String args = "";
		int i = 0;
		for (index ind : type.getIndices()) {
			if (i > 0)
				args += ", ";
			args += "unsigned int " + ind.getDim();
			i += 1;
		}
		return args;
	}

	/**
	 * 
	 */
	public String getDynamicAllocationFunctionArgumentsCall(arrayType type) {
		String args = "";
		for (index ind : type.getIndices()) {
			args += "[" + ind.getDim() + "]";
		}
		return args;
	}

	/**
	 * 
	 */
	public boolean isAOneDimensionArray(arrayType type) {
		return type.getIndices().size() == 1;
	}

	/**
	 * 
	 */
	public String getArraySizeOperator(arrayType type) {
		if (isDynamicArray(type)) {
			return "_val->num_elements()";
		}
		return "" + type.getIndices().get(0).getValue();
	}

	/**
	 * 
	 */
	public String getArrayDimensions(arrayType type) {
		String args = "[";
		int i = 0;
		for (index ind : type.getIndices()) {
			if (i > 0)
				args += ", ";
			args += ind.getValue();
			i += 1;
		}
		args += "]";
		return args;
	}

	/**
	 * 
	 */
	public String getArrayDatatypeName(arrayType type) {
		return type.getTypename().getName();
	}

	/**
	 * 
	 */
	public int getArrayNumberOfDimension(arrayType type) {
		return type.getIndices().size();
	}

	/**
		 * 
		 */
	public String getTypeIndexInUnion(unionType union, DataType type) {
		int i = 1;
		for (DataType _type : union.getElements()) {
			if (_type.getName().equals(type.getName())) {
				return "" + i;
			}
			i += 1;
		}
		return "-1";
	}

	/**
	 * 
	 */
	public boolean hasInitValue(DataType type) {
		if (isBasicType(type)) {
			basicType bt = (basicType) type;
			languageDecl decl = getCPPLanguageDecl(bt);
			if ((decl.getValue() != null) && (decl.getValue().length() > 0)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 */
	public String getInitValue(basicType bt) {
		languageDecl decl = getCPPLanguageDecl(bt);
		String value = decl.getValue();
		return value;
	}

	/**
	 * 
	 */
	public int getParameterNbWriters(parameterDeclaration param) {
		if (param.isHasNbW()) {
			return param.getNbw();
		}
		return 1;
	}

	/**
	 * 
	 * @param name
	 * @param array
	 * @return
	 */
	public String getArrayAllocationCall(String name, arrayType array) {
		String str = "";
		boolean first = true;
		for (index ind : array.getIndices()) {
			if (!ind.isHasValue()) {
				if (!first)
					str += ", ";
				str += "lexical_cast<unsigned int>(get_config()->get(\"" + name
						+ "." + ind.getDim() + "\")->get())";
				first = false;
			}
		}
		return str;
	}

	/**
	 * 
	 * @param qn
	 * @return
	 */
	public String getStringFromQualifiedName(qualifiedName qn) {
		String str = "";
		boolean first = true;
		for (String s : qn.getName()) {
			if (!first)
				str += ".";
			str += s;
			first = false;
		}
		return str;
	}

	/**
	 * Trouver une variable dans un prototype soit un parametre soit une
	 * reference
	 * 
	 * @param argName
	 * @param proto
	 */
	private DataType findVariableTypeInElementList(String argName,
			EList<architectureElement> elements) {
		for (architectureElement elt : elements) {
			if (elt instanceof parameterDeclaration) {
				if (((parameterDeclaration) elt).getName().equals(argName)) {
					return ((parameterDeclaration) elt).getTypeName();
				}
			} else if (elt instanceof referenceDeclaration) {
				qualifiedName qn = ((referenceDeclaration) elt).getName();
				String alias = ((referenceDeclaration) elt).getAlias();
				if (((alias != null) && (alias.equals(argName)) || (qn
						.getName().get(qn.getName().size() - 1).equals(argName)))) {
					return ((referenceDeclaration) elt).getTypeName();
				}
			}
		}
		return null;
	}

	/**
	 * 
	 * @param p
	 * @param argName
	 * @param pd
	 * @return
	 */
	public DataType findVariableTypeInPrototype(Project p, String argName,
			prototypeDeclaration pd) {
		DataType type = findVariableTypeInElementList(argName,
				pd.getDefinitions());
		if ((type == null) && (pd.getSuperType() != null)) {
			return findVariableTypeInPrototype(p, argName, pd.getSuperType());
		}
		return type;
	}

	/**
	 * Recuperer une declaration de fonction e partir de son nom
	 * 
	 * @param project
	 * @param name
	 * @return declaration
	 */
	private functionDeclaration getFunctionDeclarationByName(Project project,
			String name) {
		for (functionDeclaration fd : project.getFunctions()) {
			if (fd.getName().equals(name)) {
				return fd;
			}
		}
		return null;
	}

	/**
	 * Recuperer une declaration de traitement e partir de son nom
	 * 
	 * @param project
	 * @param name
	 * @return declaration
	 */
	private ProcessingDeclaration getProcessingDeclarationByName(
			Project project, String name) {
		for (ProcessingDeclaration fd : project.getProcessings()) {
			if (fd.getName().equals(name)) {
				return fd;
			}
		}
		return null;
	}

	/**
	 * Acceder e la liste des arguments declares pour un appel de fonction. Ce
	 * peut etre une fonction externe ou un traitement.
	 * 
	 * @param p
	 * @param name
	 * @return
	 */
	private EList<arg> getDeclaredArgumentsForFunctionCall(Project p,
			String name) {
		EList<arg> decl_args = null;
		functionDeclaration fd = getFunctionDeclarationByName(p, name);
		if (fd != null) {
			decl_args = fd.getArgs().getArguments();
		} else {
			ProcessingDeclaration pd = getProcessingDeclarationByName(p, name);
			if (pd!=null) {
				decl_args = pd.getArgs().getArguments();
			}
		}
		return decl_args;
	}

	/**
	 * 
	 * @param p
	 * @param proto
	 * @param call
	 * @return
	 */
	public String getArgumentDeclaration(Project p, prototypeDeclaration proto,
			interactionCall call) {
		try {
			String str = "";
			EList<arg> args = getDeclaredArgumentsForFunctionCall(p, call
					.getFctName().getName());
			if (args==null) return "";
			int i = 0;
			for (arg anArg : args) {
				farg var = call.getArguments().get(i);
				if (anArg.getModifier().equals("in")) {
					str += "\t\tconst " + anArg.getType().getName() + "& "
							+ var.getVarName() + "_" + i + " = get_"
							+ var.getVarName() + "(icycle);\n";
				} else {
					str += "\t\t" + anArg.getType().getName() + "& "
							+ var.getVarName() + "_" + i + " = get_"
							+ var.getVarName() + "_write(icycle);\n";
				}
				i++;
			}
			return str;
		} catch (Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
			return "***";
		}
	}

	/**
	 * 
	 * @param call
	 * @return
	 */
	public String getFunctionCallSignature(interactionCall call) {
		String str = "";
		boolean first = true;
		int i = 0;
		for (farg a : call.getArguments()) {
			if (!first)
				str += ", ";
			str += a.getVarName() + "_" + i;
			first = false;
			i++;
		}
		return str;
	}

	/**
	 * 
	 * @param call
	 * @return
	 */
	public String getProcessingFunctionCallSignature(functionCall call) {
		String str = "";
		try {
			boolean first = true;
//			int i = 0;
			for (farg a : call.getArguments()) {
				if (!first)
					str += ", ";
				str += a.getVarName();
				first = false;
//				i++;
			}
		} catch (Exception e) {
			System.out.println(call);
			System.out.println(e);
			e.printStackTrace();
		}
		return str;
	}

	/**
	 * 
	 * @param cond
	 * @return
	 */
	public String getCondition(eventCondition cond) {
		String left = "get_" + cond.getLeftPart() + "(icycle)";
		String right = "";
		if (cond.getRightPartI() != null)
			right = "get_" + cond.getRightPartI() + "(icycle)";
		else if (cond.getRightPartS() != null)
			right = cond.getRightPartS();
		else
			right = "" + cond.getRightPartN();
		String condition = cond.getCond();
		String post = "";
		if (condition.equals("%%")) {
			condition = "%";
			post = " == 0";
		}
		return "(" + left + condition + right + post + ")";
	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	public boolean isFunctionCall(statement s) {
		return s.getCall() instanceof functionCall;
	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	public boolean isWhileBlock(statement s) {
		return s.getCall() instanceof whileblock;
	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	public boolean isIfBlock(statement s) {
		return s.getCall() instanceof ifblock;
	}

	public prototypeDeclaration getRootPrototype(Project p) throws Exception{
		for (prototypeDeclaration proto : p.getPrototypes()) {
			//System.out.println("\t"+proto.getName());
			if (proto.getName().equals("Root")) {
				return proto;
			}
		}
		System.out.println("------------------ getRootPrototype: no Root Prototype found !!!!");
		throw(new Exception());
		
	}

}
