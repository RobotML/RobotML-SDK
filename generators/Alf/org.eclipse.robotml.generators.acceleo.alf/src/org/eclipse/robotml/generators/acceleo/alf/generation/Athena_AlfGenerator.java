/**
 * 
 */
package org.eclipse.robotml.generators.acceleo.alf.generation;

import java.util.Vector;

import org.eclipse.papyrus.uml.alf.alf.Block;
import org.eclipse.papyrus.uml.alf.alf.ConcurrentClauses;
import org.eclipse.papyrus.uml.alf.alf.ConditionalTestExpression;
import org.eclipse.papyrus.uml.alf.alf.Expression;
import org.eclipse.papyrus.uml.alf.alf.IfStatement;
import org.eclipse.papyrus.uml.alf.alf.InvocationOrAssignementOrDeclarationStatement;
import org.eclipse.papyrus.uml.alf.alf.LocalNameDeclarationStatement;
import org.eclipse.papyrus.uml.alf.alf.NameExpression;
import org.eclipse.papyrus.uml.alf.alf.NonFinalClause;
import org.eclipse.papyrus.uml.alf.alf.SequentialClauses;
import org.eclipse.papyrus.uml.alf.alf.Statement;
import org.eclipse.papyrus.uml.alf.alf.VariableDeclarationCompletion;
import org.eclipse.papyrus.uml.alf.alf.WhileStatement;

/**
 * @author nbrodnan
 *
 * Athena generator for Alf bloc code
 *
 */
public class Athena_AlfGenerator extends AlfGenerator {
	
	private final String ELSE_KEYWORD = "else";
	private final String BEGIN_KEYWORD = "begin";
	private final String END_KEYWORD = "end";
	private final String IF_KEYWORD = "if";
	private final String THEN_KEYWORD = "then";
	private final String WHILE_KEYWORD = "while";
	private final String DO_KEYWORD = "do";
	private final String EXECUTE_KEYWORD = "execute";
	private final String PARAMETER_KEYWORD = "parameter";
	private final String EVENT_KEYWORD = "event";
	
	private Vector<String> _listIfEvent = new Vector<String>();
	private Vector<String> _listIfEventBloc = new Vector<String>();
	
	private int event_count = 0;
	
	@Override
	protected String generateAlfBlock(Block bloc)
	{
		String result = BEGIN_KEYWORD + "\n";
		result += generateStatementSequence(bloc.getSequence());
		result += END_KEYWORD + "\n";
		return result;
	}
	
	@Override
	protected String generateStatement(Statement aStatement)
	{
		String result = "";
		result += super.generateStatement(aStatement);
		result += "\n";
		return result;
	}
	
	@Override
	protected String generateIfStatement(IfStatement aIfStatement) {
		String result = "";
		if(aIfStatement != null)
		{
			generateSequentialClausesTemplate(aIfStatement.getSequentialClausses());
			
			if(_listIfEvent.size() == _listIfEventBloc.size())
			{
				for(int cpt = 0; cpt < this._listIfEvent.size(); cpt ++)
				{
					result += EVENT_KEYWORD + " e" + event_count + " { " + this._listIfEvent.get(cpt) + " }\n";
					event_count ++;
				}
				
				for(int cpt = 0; cpt < this._listIfEvent.size(); cpt ++)
				{
					int num_event = (event_count - _listIfEvent.size()) + cpt;
					if(cpt == 0)
					{
						result += IF_KEYWORD + "( e" + num_event + " ) " + THEN_KEYWORD + " ";
					}
					else
					{
						result += ELSE_KEYWORD + " " + IF_KEYWORD + "( e" + num_event + " )" + THEN_KEYWORD + " ";
					}
					result += _listIfEventBloc.get(cpt);
				}
				
				if(aIfStatement.getFinalClause() != null)
				{
					result += ELSE_KEYWORD + " ";
					result += generateFinalClauseTemplate(aIfStatement.getFinalClause());
				}
			}
		}
		return result;
	}
	
	@Override
	protected String generateSequentialClausesTemplate(SequentialClauses aSequentialClauses) {
		String result = "";
		for(ConcurrentClauses clause : aSequentialClauses.getConccurentClauses())
		{
			generateConcurrentClausesTemplate(clause);
		}
		return result;
	}

	@Override
	protected String generateConcurrentClausesTemplate(ConcurrentClauses aConcurrentClauses) {
		String result = "";
		for(NonFinalClause clause : aConcurrentClauses.getNonFinalClause())
		{
			generateNonFinalClauseTemplate(clause);
		}
		return result;
	}
	
	@Override
	protected String generateNonFinalClauseTemplate(NonFinalClause aNonFinalClause) {
		String result = "";
		this._listIfEvent.add(generateConditionalTestExpression((ConditionalTestExpression)aNonFinalClause.getCondition()));
		this._listIfEventBloc.add(generateAlfBlock(aNonFinalClause.getBlock()));
		return result;
	}
	
	@Override
	protected String generateWhileStatement(WhileStatement aWhileStatement) {
		String result = "";
		if(aWhileStatement != null)
		{
			result += EVENT_KEYWORD + " e" + event_count + " { ";
			result += generateConditionalTestExpression((ConditionalTestExpression)aWhileStatement.getCondition()) + "}\n";
			result += WHILE_KEYWORD + "(" + result + ") ";
			result += DO_KEYWORD ;
			result += generateAlfBlock(aWhileStatement.getBlock());
			event_count ++;
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
				result += EXECUTE_KEYWORD + " " + generateNameExpression(
						aInvocationOrAssignementOrDeclarationStatement.getTypePart_OR_assignedPart_OR_invocationPart(),true);
			}
			else
			{
				result += PARAMETER_KEYWORD + " " +generateNameExpression(
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
					result += "[]";
				}
			}
		}
		return result;
	}
	
	@Override
	protected String generateLocalNameDeclarationStatement(LocalNameDeclarationStatement aLocalNameDeclarationStatement) {
		String result = "";
		if(aLocalNameDeclarationStatement != null)
		{
			result += aLocalNameDeclarationStatement.getType().getId();
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
		result += aNameExpression.getId();
		result += " " + generateTupleTemplate(aNameExpression.getInvocationCompletion());
		result += generateSequenceConstructionOrAccessCompletion(aNameExpression.getSequenceConstructionCompletion());
		if(aNameExpression.getPostfixOp() != null)
		{
			result += aNameExpression.getPostfixOp();
		}
		result += generateSuffixExpression(aNameExpression.getSuffix(), "->");
		return result;
	}
}
