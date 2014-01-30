package org.eclipse.papyrus.generators.xtext.athena.vle.main;

import org.eclipse.emf.common.util.EList;
import org.xtext.athenaDSL.DataType;
import org.xtext.athenaDSL.FuncProc;
import org.xtext.athenaDSL.ProcessingDeclaration;
import org.xtext.athenaDSL.Project;
import org.xtext.athenaDSL.architectureElement;
import org.xtext.athenaDSL.arg;
import org.xtext.athenaDSL.argumentsDeclaration;
import org.xtext.athenaDSL.arrayType;
import org.xtext.athenaDSL.basicType;
import org.xtext.athenaDSL.eventCondition;
import org.xtext.athenaDSL.eventDeclaration;
import org.xtext.athenaDSL.farg;
import org.xtext.athenaDSL.functionCall;
import org.xtext.athenaDSL.functionDeclaration;
import org.xtext.athenaDSL.ifblock;
import org.xtext.athenaDSL.index;
import org.xtext.athenaDSL.instanceDeclaration;
import org.xtext.athenaDSL.interactionCall;
import org.xtext.athenaDSL.interactionDeclaration;
import org.xtext.athenaDSL.lexicalCastDecl;
import org.xtext.athenaDSL.parameterDeclaration;
import org.xtext.athenaDSL.prototypeDeclaration;
import org.xtext.athenaDSL.qualifiedName;
import org.xtext.athenaDSL.signalDeclaration;
import org.xtext.athenaDSL.stateDeclaration;
import org.xtext.athenaDSL.statement;
import org.xtext.athenaDSL.statesetDeclaration;
import org.xtext.athenaDSL.structElement;
import org.xtext.athenaDSL.structType;
import org.xtext.athenaDSL.whileblock;



/**
 * Services Java pour la génération vers VLE et GVLE 
 * @author smillet
 */
public class JavaService {


	/**
	 * Constructor
	 */
	public JavaService() {
//		AthenaDSLFactoryImpl.init();
	}

	/**
	 * is it an instance ?
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
	 * get an instance declaration
	 * @param elt
	 * @return
	 */
	public instanceDeclaration getInstance(architectureElement elt) {
		return (instanceDeclaration) elt;
	}

	/**
	 * is it a signal ?
	 * @param elt
	 * @return
	 */
	public boolean isSignal(architectureElement elt) {
		return elt instanceof signalDeclaration;
	}

	/**
	 * is it an event ?
	 * @param elt
	 * @return
	 */
	public boolean isEvent(architectureElement elt) {
		return elt instanceof eventDeclaration;
	}

	/**
	 * is it an interaction ?
	 * @param elt
	 * @return
	 */
	public boolean isAnInteraction(architectureElement elt) {
		return elt instanceof interactionDeclaration;
	}

	/**
	 * get signature from args 
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
				sig += a.getType().getName() + "& " + a.getName().toLowerCase();
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
	 * get functionn signature
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
	 * get processing signature
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
	 * get cpp functor declaration
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
	 * is it a stateset ?
	 * @param elt
	 * @return
	 */
	public boolean isStateSet(architectureElement elt) {
		return elt instanceof statesetDeclaration;
	}

	/**
	 * get stateset declaration
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
	 * is it a buffer type ?
	 */
	public boolean isBuffer(DataType type) {
		return type.getName().equals("Buffer");
	}

	/**
	 * build a filename from a post-fixe and name
	 * @param proto
	 * @param end
	 * @return
	 */
	public String getPrototypeFileName(prototypeDeclaration proto, String end) {
		return proto.getName() + end;
	}

	/**
	 * get cpp function signature
	 * @param lang
	 * @return
	 */
	public String getCPPFunctionSignature(functionDeclaration func) {
		return getSignatureFromArgs(func.getArgs());
	}

	/**
	 * get cpp lexical cast
	 * @param type
	 * @return
	 */
	public String getCPPLexicalCast(basicType type) {
		for (lexicalCastDecl cast : type.getCasts()) {
			if (DSLQueries.isCPPLanguage(cast.getLang())) {
				return cast.getCast();
			}
		}
		return type.getName();
	}

	/**
	 * get xml array dimensions
	 * @param type
	 * @return
	 */
	public String getXmlArrayDims(arrayType param) {
		String function = "";
		if (DSLQueries.isDynamicArray((arrayType) param)) {
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
	 * get xml struct dimensions
	 * @param type
	 * @return
	 */
	public String getXmlStructDims(structType type) {
		String function = "";
		for (structElement elt : type.getParameters()) {
			DataType param = elt.getTypename();
			if (DSLQueries.isArrayType(param)) {
				function += getXmlArrayDims((arrayType) param);
			}
		}
		return function;

	}

	/**
	 * get the number of writers for a parameter
	 */
	public int getParameterNbWriters(parameterDeclaration param) {
		if (param.isHasNbW()) {
			return param.getNbw();
		}
		return 1;
	}

	/**
	 * get an array allocation c++ call
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
	 * get a qualified name as a dotted string 
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
			if (pd != null) {
				decl_args = pd.getArgs().getArguments();
			}
		}
		return decl_args;
	}

	/**
	 * get an argument declaration in c++
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
			if (args == null)
				return "";
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
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			return "***";
		}
	}

	/**
	 * get a function call signature as a c++ text
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
	 * get a processing function signature as a c++ text
	 * @param call
	 * @return
	 */
	public String getProcessingFunctionCallSignature(functionCall call) {
		String str = "";
		try {
			boolean first = true;
			for (farg a : call.getArguments()) {
				if (!first)
					str += ", ";
				str += a.getVarName();
				first = false;
			}
		} catch (Exception e) {
			System.out.println(call);
			System.out.println(e);
			e.printStackTrace();
		}
		return str;
	}

	/**
	 * get a condition as c++ text 
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
	 * i it a Function call ?
	 * @param s
	 * @return
	 */
	public boolean isFunctionCall(statement s) {
		return s.getCall() instanceof functionCall;
	}

	/**
	 * is it a WHILE block ?
	 * @param s
	 * @return
	 */
	public boolean isWhileBlock(statement s) {
		return s.getCall() instanceof whileblock;
	}

	/**
	 * is it an IF block ?
	 * @param s
	 * @return
	 */
	public boolean isIfBlock(statement s) {
		return s.getCall() instanceof ifblock;
	}
	
	public Boolean hasStateSet(prototypeDeclaration proto)
	{
		Boolean result = false;
		for(architectureElement elt : proto.getDefinitions())
		{
			result |= (elt instanceof statesetDeclaration);
		}
		return result;
	}
	
}
