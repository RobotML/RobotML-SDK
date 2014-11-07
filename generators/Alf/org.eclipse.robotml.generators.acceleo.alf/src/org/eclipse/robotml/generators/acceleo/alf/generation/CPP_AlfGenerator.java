/**
 * 
 */
package org.eclipse.robotml.generators.acceleo.alf.generation;

import java.util.HashMap;

import org.eclipse.papyrus.uml.alf.alf.AcceptStatement;
import org.eclipse.papyrus.uml.alf.alf.AnnotatedStatement;
import org.eclipse.papyrus.uml.alf.alf.Block;
import org.eclipse.papyrus.uml.alf.alf.BlockStatement;
import org.eclipse.papyrus.uml.alf.alf.BreakStatement;
import org.eclipse.papyrus.uml.alf.alf.ClassifyStatement;
import org.eclipse.papyrus.uml.alf.alf.ConcurrentClauses;
import org.eclipse.papyrus.uml.alf.alf.ConditionalTestExpression;
import org.eclipse.papyrus.uml.alf.alf.DoStatement;
import org.eclipse.papyrus.uml.alf.alf.EmptyStatement;
import org.eclipse.papyrus.uml.alf.alf.Expression;
import org.eclipse.papyrus.uml.alf.alf.IfStatement;
import org.eclipse.papyrus.uml.alf.alf.InlineStatement;
import org.eclipse.papyrus.uml.alf.alf.InstanceCreationExpression;
import org.eclipse.papyrus.uml.alf.alf.InstanceCreationInvocationStatement;
import org.eclipse.papyrus.uml.alf.alf.InvocationOrAssignementOrDeclarationStatement;
import org.eclipse.papyrus.uml.alf.alf.LocalNameDeclarationStatement;
import org.eclipse.papyrus.uml.alf.alf.NameExpression;
import org.eclipse.papyrus.uml.alf.alf.NonFinalClause;
import org.eclipse.papyrus.uml.alf.alf.Tuple;
//import org.eclipse.papyrus.uml.alf.alf.OperationCallExpressionWithoutDot;
import org.eclipse.papyrus.uml.alf.alf.QualifiedNameWithBinding;
import org.eclipse.papyrus.uml.alf.alf.ReturnStatement;
import org.eclipse.papyrus.uml.alf.alf.SequentialClauses;
import org.eclipse.papyrus.uml.alf.alf.Statement;
import org.eclipse.papyrus.uml.alf.alf.SuperInvocationExpression;
import org.eclipse.papyrus.uml.alf.alf.SuperInvocationStatement;
import org.eclipse.papyrus.uml.alf.alf.SwitchCase;
import org.eclipse.papyrus.uml.alf.alf.SwitchClause;
import org.eclipse.papyrus.uml.alf.alf.SwitchDefaultClause;
import org.eclipse.papyrus.uml.alf.alf.SwitchStatement;
import org.eclipse.papyrus.uml.alf.alf.ThisExpression;
import org.eclipse.papyrus.uml.alf.alf.ThisInvocationStatement;
import org.eclipse.papyrus.uml.alf.alf.VariableDeclarationCompletion;
import org.eclipse.papyrus.uml.alf.alf.WhileStatement;

/**
 * @author nbrodnan
 * 
 * C++ generator for Alf bloc code
 *
 */
public class CPP_AlfGenerator extends AlfGenerator {
	
	private final String ELSE_KEYWORD = "else";
	private final String IF_KEYWORD = "if";
	private final String WHILE_KEYWORD = "while";
	private final String DO_KEYWORD = "do";
	private final String NEW_KEYWORD = "new";
	private final String SWITCH_KEYWORD = "switch";
	private final String DEFAULT_KEYWORD = "default:";
	private final String CASE_KEYWORD = "case:";
	private final String THIS_KEYWORD = "this";
	
	private final String INTEGER_KEYWORD = "Integer";
	private final String INT_TYPE_KEYWORD = "int";
	private final String OBJECT_KEYWORD = "Object";
	private final String OBJECT_TYPE_KEYWORD = "void*";
	private final String STRING_KEYWORD = "String";
	private final String STRING_TYPE_KEYWORD = "string";
	private final String BOOLEAN_KEYWORD = "Boolean";
	private final String BOOLEAN_TYPE_KEYWORD = "bool";
	private final String UNLIMITED_NATURAL_KEYWORD = "Unlimited naturl";
	private final String UNLIMITED_NATURAL_TYPE_KEYWORD = "unsigned long int";
	
	private HashMap<String, String> _mapCPPStd = new HashMap<String, String>();
	
	public CPP_AlfGenerator()
	{
		_mapCPPStd.put(INTEGER_KEYWORD, INT_TYPE_KEYWORD);
		_mapCPPStd.put(OBJECT_KEYWORD, OBJECT_TYPE_KEYWORD);
		_mapCPPStd.put(STRING_KEYWORD, STRING_TYPE_KEYWORD);
		_mapCPPStd.put(BOOLEAN_KEYWORD, BOOLEAN_TYPE_KEYWORD);
		_mapCPPStd.put(UNLIMITED_NATURAL_KEYWORD, UNLIMITED_NATURAL_TYPE_KEYWORD);
	}

	@Override
	protected String generateAlfBlock(Block bloc)
	{
		return "{\n" + generateStatementSequence(bloc.getSequence()) + "}\n";
	}
	
	@Override
	protected String generateStatement(Statement aStatement)
	{
		String result = "";
		result += super.generateStatement(aStatement);
		if((aStatement instanceof InlineStatement) || 
			(aStatement instanceof AnnotatedStatement) ||
			(aStatement instanceof BlockStatement) ||
			(aStatement instanceof EmptyStatement) ||
			(aStatement instanceof LocalNameDeclarationStatement) ||
			(aStatement instanceof BreakStatement) ||
			(aStatement instanceof ReturnStatement) ||
			(aStatement instanceof AcceptStatement) ||
			(aStatement instanceof ClassifyStatement) ||
			(aStatement instanceof InvocationOrAssignementOrDeclarationStatement) ||
			(aStatement instanceof SuperInvocationStatement) ||
			(aStatement instanceof ThisInvocationStatement) ||
			(aStatement instanceof InstanceCreationInvocationStatement))
		{
			result += ";\n";
		}
		return result;
	}
	
	@Override
	protected String generateInlineStatement(InlineStatement aInLineStatement)
	{
		String result = "";
		result += "//The language is " + aInLineStatement.getLangageName() + "\n";
		result += aInLineStatement.getBody() + "\n";
		return result;
	}
	
	@Override
	protected String generateIfStatement(IfStatement aIfStatement) {
		String result = "";
		if(aIfStatement != null)
		{
			result = generateSequentialClausesTemplate(aIfStatement.getSequentialClausses());
			result += "\n" + ELSE_KEYWORD + "\n";
			result += generateFinalClauseTemplate(aIfStatement.getFinalClause());
		}
		return result;
	}
	
	@Override
	protected String generateSequentialClausesTemplate(SequentialClauses aSequentialClauses) {
		String result = "";
		for(ConcurrentClauses clause : aSequentialClauses.getConccurentClauses())
		{
			boolean isLast = (aSequentialClauses.getConccurentClauses().indexOf(clause) == 
					(aSequentialClauses.getConccurentClauses().size() -1));
			result += IF_KEYWORD;
			result += generateConcurrentClausesTemplate(clause);
			
			if(isLast == false)
			{
				result += ELSE_KEYWORD;
			}
		}
		return result;
	}
	
	@Override
	protected String generateConcurrentClausesTemplate(ConcurrentClauses aConcurrentClauses) {
		String result = "";
		for(NonFinalClause clause : aConcurrentClauses.getNonFinalClause())
		{
			boolean isLast = (aConcurrentClauses.getNonFinalClause().indexOf(clause) == 
					(aConcurrentClauses.getNonFinalClause().size() -1));
			
			result += generateNonFinalClauseTemplate(clause);
			
			if(isLast == false)
			{
				result += ELSE_KEYWORD + " " + IF_KEYWORD;
			}
		}
		return result;
	}
	
	@Override
	protected String generateNonFinalClauseTemplate(NonFinalClause aNonFinalClause) {
		String result = "";
		result += "(" + generateConditionalTestExpression((ConditionalTestExpression)aNonFinalClause.getCondition()) + ")\n";
		result += generateAlfBlock(aNonFinalClause.getBlock());
		return result;
	}
	
	@Override
	protected String generateSwitchStatement(SwitchStatement aSwitchStatement) {
		String result = "";
		if(aSwitchStatement != null)
		{
			result += SWITCH_KEYWORD + "(" + generateExpressionForm(aSwitchStatement.getExpression()) + ")";
			for(SwitchClause clause : aSwitchStatement.getSwitchClause())
			{
				result += generateSwitchClause(clause);
			}
			result += generateSwitchDefaultclause(aSwitchStatement.getDefaultClause());
		}
		return result;
	}
	
	@Override
	protected String generateSwitchDefaultclause(SwitchDefaultClause aSwitchDefaultClause) {
		String result = "";
		if(aSwitchDefaultClause != null)
		{
			result += DEFAULT_KEYWORD + generateNonEmptyStatementSequence(aSwitchDefaultClause.getStatementSequence());
		}
		return result;
	}
	
	@Override
	protected String generateSwitchClause(SwitchClause aSwitchClause) {
		String result = "";
		for(SwitchCase switch_case : aSwitchClause.getSwitchCase())
		{
			result += generateSwitchCase(switch_case);
		}
		result += generateNonEmptyStatementSequence(aSwitchClause.getStatementSequence());
		return result;
	}
	
	@Override
	protected String generateSwitchCase(SwitchCase aSwitchCase) {
		return  CASE_KEYWORD + generateConditionalTestExpression((ConditionalTestExpression)aSwitchCase.getExpression());
	}
	
	@Override
	protected String generateWhileStatement(WhileStatement aWhileStatement) {
		String result = "";
		if(aWhileStatement != null)
		{
			result += WHILE_KEYWORD + "(" + generateConditionalTestExpression((ConditionalTestExpression)aWhileStatement.getCondition()) + ")\n";
			result += generateAlfBlock(aWhileStatement.getBlock());
		}
		return result;
	}
	
	@Override
	protected String generateDoStatement(DoStatement aDoStatement) {
		String result = "";
		if(aDoStatement != null)
		{
			result += DO_KEYWORD + "\n" + generateAlfBlock(aDoStatement.getBlock());
			result += WHILE_KEYWORD + "(" + generateConditionalTestExpression((ConditionalTestExpression)aDoStatement.getCondition()) + ");";
		}
		return result;
	}
	
	@Override
	protected String generateInvocationOrAssignementOrDeclarationStatement(
			InvocationOrAssignementOrDeclarationStatement aInvocationOrAssignementOrDeclarationStatement) {
		String result = "";
		if(aInvocationOrAssignementOrDeclarationStatement != null)
		{
			if(aInvocationOrAssignementOrDeclarationStatement.getVariableDeclarationCompletion() == null || 
					aInvocationOrAssignementOrDeclarationStatement.getAssignmentCompletion() != null)
			{
				result += generateNameExpression(
						aInvocationOrAssignementOrDeclarationStatement.getTypePart_OR_assignedPart_OR_invocationPart(),true);
			}
			else
			{
				result += generateNameExpression(
						aInvocationOrAssignementOrDeclarationStatement.getTypePart_OR_assignedPart_OR_invocationPart(),false);
			}
			
			result += generateVariableDeclarationCompletion(aInvocationOrAssignementOrDeclarationStatement.getVariableDeclarationCompletion());
			result += generateAssignmentCompletion(aInvocationOrAssignementOrDeclarationStatement.getAssignmentCompletion());
		}
		return result;
	}
	
	@Override
	protected String generateVariableDeclarationCompletion(VariableDeclarationCompletion aVariableDeclarationCompletion) {
		String result = "";
		if(aVariableDeclarationCompletion != null)
		{
			if(aVariableDeclarationCompletion.getVariableName() != null)
			{
				result += aVariableDeclarationCompletion.getVariableName();
				if(aVariableDeclarationCompletion.isMultiplicityIndicator() == true)
				{
					result += "[] ";
				}
			}
			result += generateAssignmentCompletion(aVariableDeclarationCompletion.getInitValue());
		}
		return result;
	}

	@Override
	protected String generateSuperInvocationExpression(SuperInvocationExpression aSuperInvocationExpression) {
		String result = "";
		if(aSuperInvocationExpression != null)
		{
//			result += aSuperInvocationExpression.getClass().getClassName();
//			result += "::" + generateOperationCallExpression(aSuperInvocationExpression.getOperationCall());
//			result += "::" + generateOperationCallExpressionWithoutDot(aSuperInvocationExpression.getOperationCallWithoutDot());
			result += aSuperInvocationExpression.getClass().getClass().getName();
//			result += "::" + generateOperationCallExpression(aSuperInvocationExpression.getClass());
			result += "::" + generateTupleTemplate((Tuple)aSuperInvocationExpression.getTuple());
		}
		return result;
	}
	
//	@Override
//	protected String generateOperationCallExpressionWithoutDot(OperationCallExpressionWithoutDot aOperationCallExpressionWithoutDot) {
//		String result = "";
//		result += aOperationCallExpressionWithoutDot.getOperationName();
//		result += generateTupleTemplate(aOperationCallExpressionWithoutDot.getTuple());
//		result += generateSuffixExpression(aOperationCallExpressionWithoutDot.getSuffix(), ".");
//		return result;
//	}
	
	@Override
	protected String generateThisExpression(ThisExpression aThisExpression) {
		String result = "";
		if(aThisExpression != null)
		{
			result += THIS_KEYWORD + generateSuffixExpression(aThisExpression.getSuffix(), "->");
		}
		return result;
	}
	
	@Override
	protected String generateInstanceCreationExpression(InstanceCreationExpression aInstanceCreationExpression) {
		String result = "";
		if(aInstanceCreationExpression != null)
		{
			if(aInstanceCreationExpression.getSuffix() != null)
			{
				result += "(" + NEW_KEYWORD + generateQualifiedNameWithBinding(aInstanceCreationExpression.getConstructor());
				result += generateTupleTemplate((Tuple)aInstanceCreationExpression.getTuple());
				result += /*generateSequenceConstructionCompletion(aInstanceCreationExpression.getSequenceConstuctionCompletion()) +*/ ")";
				result += generateSuffixExpression(aInstanceCreationExpression.getSuffix(), "->");
			}
			else
			{
				result += NEW_KEYWORD + generateQualifiedNameWithBinding(aInstanceCreationExpression.getConstructor());
				result += generateTupleTemplate((Tuple)aInstanceCreationExpression.getTuple());
//				result += generateSequenceConstructionCompletion(aInstanceCreationExpression.getSequenceConstuctionCompletion());
				result += generateSuffixExpression(aInstanceCreationExpression.getSuffix(), "->");
			}
		}
		return result;
	}
	
	@Override
	protected String generateQualifiedNameWithBinding(QualifiedNameWithBinding aQualifiedNameWithBinding) {
		String result = "";
		if(aQualifiedNameWithBinding != null)
		{
			result += aQualifiedNameWithBinding.getId();
			result += generateTemplateBinding(aQualifiedNameWithBinding.getBinding());
			if(aQualifiedNameWithBinding.getRemaining() != null)
			{
				result += "." +  generateQualifiedNameWithBinding(aQualifiedNameWithBinding.getRemaining());
			}
		}
		return result;
	}
	
	@Override
	protected String generateLocalNameDeclarationStatement(LocalNameDeclarationStatement aLocalNameDeclarationStatement) {
		String result = "";
		if(aLocalNameDeclarationStatement != null)
		{
			result += cppTypeStandardFromString(aLocalNameDeclarationStatement.getType().getId());
			result += " " + aLocalNameDeclarationStatement.getVarName();
			if(aLocalNameDeclarationStatement.isMultiplicityIndicator() == true)
			{
				result += "[]";
			}
			result += generateExpressionForm((Expression)aLocalNameDeclarationStatement.getInit());
		}
		return result;
	}
	
	@Override
	protected String generateNameExpression(NameExpression aNameExpression,	Boolean isNotNew) {
		String result = "";
		if(aNameExpression.getPrefixOp() != null)
		{
			result += aNameExpression.getPrefixOp() + " ";
		}
		result += generateQualifiedNamePath(aNameExpression.getPath());
		if(isNotNew == true || aNameExpression.getSuffix() != null)
		{
			result += aNameExpression.getId();
		}
		else
		{
			result += cppTypeStandardFromString(aNameExpression.getId());
		}
		result += " " + generateTupleTemplate(aNameExpression.getInvocationCompletion());
		result += generateSequenceConstructionOrAccessCompletion(aNameExpression.getSequenceConstructionCompletion());
		if(aNameExpression.getPostfixOp() != null)
		{
			result += aNameExpression.getPostfixOp();
		}
		result += generateSuffixExpression(aNameExpression.getSuffix(), "->");
		return result;
	}
	
	
	/**
	 * Get CPP type standard if exist
	 * @param type : String
	 * @return type translation : String
	 */
	private String cppTypeStandardFromString(String type)
	{
		String result = "";
		
		if(_mapCPPStd.containsKey(type) == true)
		{
			result = _mapCPPStd.get(type);
		}
		else
		{
			result = type;
		}
		return result;
	}
	
}
