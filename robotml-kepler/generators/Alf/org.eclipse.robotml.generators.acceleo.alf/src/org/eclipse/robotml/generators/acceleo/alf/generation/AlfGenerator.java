/**
 * 
 */
package org.eclipse.robotml.generators.acceleo.alf.generation;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.uml.alf.alf.AcceptStatement;
import org.eclipse.papyrus.uml.alf.alf.AdditiveExpression;
import org.eclipse.papyrus.uml.alf.alf.AndExpression;
import org.eclipse.papyrus.uml.alf.alf.AnnotatedStatement;
import org.eclipse.papyrus.uml.alf.alf.Annotation;
import org.eclipse.papyrus.uml.alf.alf.AssignmentCompletion;
import org.eclipse.papyrus.uml.alf.alf.AssignmentOperator;
import org.eclipse.papyrus.uml.alf.alf.BOOLEAN_LITERAL;
import org.eclipse.papyrus.uml.alf.alf.Block;
import org.eclipse.papyrus.uml.alf.alf.BlockStatement;
import org.eclipse.papyrus.uml.alf.alf.BreakStatement;
import org.eclipse.papyrus.uml.alf.alf.ClassExtentExpression;
import org.eclipse.papyrus.uml.alf.alf.ClassificationExpression;
import org.eclipse.papyrus.uml.alf.alf.ClassifyStatement;
import org.eclipse.papyrus.uml.alf.alf.ConcurrentClauses;
import org.eclipse.papyrus.uml.alf.alf.ConditionalAndExpression;
import org.eclipse.papyrus.uml.alf.alf.ConditionalOrExpression;
import org.eclipse.papyrus.uml.alf.alf.ConditionalTestExpression;
import org.eclipse.papyrus.uml.alf.alf.DoStatement;
import org.eclipse.papyrus.uml.alf.alf.DocumentedStatement;
import org.eclipse.papyrus.uml.alf.alf.EmptyStatement;
import org.eclipse.papyrus.uml.alf.alf.EqualityExpression;
import org.eclipse.papyrus.uml.alf.alf.ExclusiveOrExpression;
import org.eclipse.papyrus.uml.alf.alf.Expression;
import org.eclipse.papyrus.uml.alf.alf.FinalClause;
import org.eclipse.papyrus.uml.alf.alf.ForControl;
import org.eclipse.papyrus.uml.alf.alf.ForStatement;
import org.eclipse.papyrus.uml.alf.alf.INTEGER_LITERAL;
import org.eclipse.papyrus.uml.alf.alf.IfStatement;
import org.eclipse.papyrus.uml.alf.alf.InclusiveOrExpression;
import org.eclipse.papyrus.uml.alf.alf.InlineStatement;
import org.eclipse.papyrus.uml.alf.alf.InstanceCreationExpression;
import org.eclipse.papyrus.uml.alf.alf.InstanceCreationInvocationStatement;
import org.eclipse.papyrus.uml.alf.alf.InvocationOrAssignementOrDeclarationStatement;
import org.eclipse.papyrus.uml.alf.alf.LITERAL;
import org.eclipse.papyrus.uml.alf.alf.LinkOperationExpression;
import org.eclipse.papyrus.uml.alf.alf.LinkOperationKind;
import org.eclipse.papyrus.uml.alf.alf.LinkOperationTuple;
import org.eclipse.papyrus.uml.alf.alf.LinkOperationTupleElement;
import org.eclipse.papyrus.uml.alf.alf.LocalNameDeclarationStatement;
import org.eclipse.papyrus.uml.alf.alf.LoopVariableDefinition;
import org.eclipse.papyrus.uml.alf.alf.MultiplicativeExpression;
import org.eclipse.papyrus.uml.alf.alf.NUMBER_LITERAL;
import org.eclipse.papyrus.uml.alf.alf.NameExpression;
import org.eclipse.papyrus.uml.alf.alf.NonEmptyStatementSequence;
import org.eclipse.papyrus.uml.alf.alf.NonFinalClause;
import org.eclipse.papyrus.uml.alf.alf.NonLiteralValueSpecification;
import org.eclipse.papyrus.uml.alf.alf.NullExpression;
import org.eclipse.papyrus.uml.alf.alf.OperationCallExpression;
import org.eclipse.papyrus.uml.alf.alf.SequenceConstructionCompletion;
//import org.eclipse.papyrus.uml.alf.alf.OperationCallExpressionWithoutDot;
import org.eclipse.papyrus.uml.alf.alf.ParenthesizedExpression;
import org.eclipse.papyrus.uml.alf.alf.PrimaryExpression;
import org.eclipse.papyrus.uml.alf.alf.PropertyCallExpression;
import org.eclipse.papyrus.uml.alf.alf.QualifiedNamePath;
import org.eclipse.papyrus.uml.alf.alf.QualifiedNameWithBinding;
import org.eclipse.papyrus.uml.alf.alf.RelationalExpression;
import org.eclipse.papyrus.uml.alf.alf.ReturnStatement;
import org.eclipse.papyrus.uml.alf.alf.STRING_LITERAL;
//import org.eclipse.papyrus.uml.alf.alf.SequenceConstructionCompletion;
import org.eclipse.papyrus.uml.alf.alf.SequenceConstructionOrAccessCompletion;
import org.eclipse.papyrus.uml.alf.alf.SequenceExpansionExpression;
import org.eclipse.papyrus.uml.alf.alf.SequenceOperationExpression;
import org.eclipse.papyrus.uml.alf.alf.SequenceReductionExpression;
import org.eclipse.papyrus.uml.alf.alf.SequentialClauses;
import org.eclipse.papyrus.uml.alf.alf.ShiftExpression;
import org.eclipse.papyrus.uml.alf.alf.Statement;
import org.eclipse.papyrus.uml.alf.alf.StatementSequence;
import org.eclipse.papyrus.uml.alf.alf.SuffixExpression;
import org.eclipse.papyrus.uml.alf.alf.SuperInvocationExpression;
import org.eclipse.papyrus.uml.alf.alf.SuperInvocationStatement;
import org.eclipse.papyrus.uml.alf.alf.SwitchCase;
import org.eclipse.papyrus.uml.alf.alf.SwitchClause;
import org.eclipse.papyrus.uml.alf.alf.SwitchDefaultClause;
import org.eclipse.papyrus.uml.alf.alf.SwitchStatement;
import org.eclipse.papyrus.uml.alf.alf.TemplateBinding;
import org.eclipse.papyrus.uml.alf.alf.ThisExpression;
import org.eclipse.papyrus.uml.alf.alf.ThisInvocationStatement;
import org.eclipse.papyrus.uml.alf.alf.Tuple;
import org.eclipse.papyrus.uml.alf.alf.TupleElement;
import org.eclipse.papyrus.uml.alf.alf.UNLIMITED_LITERAL;
import org.eclipse.papyrus.uml.alf.alf.UnaryExpression;
import org.eclipse.papyrus.uml.alf.alf.UnqualifiedName;
import org.eclipse.papyrus.uml.alf.alf.ValueSpecification;
import org.eclipse.papyrus.uml.alf.alf.VariableDeclarationCompletion;
import org.eclipse.papyrus.uml.alf.alf.WhileStatement;

/**
 * @author nbrodnan
 *
 * Abstract generator contain common code translation 
 */
public abstract class AlfGenerator implements IAlfGenerator {

	private final String BREAK_KEYWORD = "break";
	private final String RETURN_KEYWORD = "return";
	private final String FOR_KEYWORD = "for";

	
	/* (non-Javadoc)
	 * @see org.eclipse.robotml.generators.acceleo.alf.main.IAlfGenerator#generateAlfBlock()
	 */
	public void generate(AlfBlock bloc) {
		bloc.setCodeTranslation(generateStatementSequence(bloc.getBlock().getSequence()));
	}
	
	/**
	 * generate the Alf bloc code
	 * @param bloc : Alf::Block
	 * @return code bloc : String
	 */
	protected String generateAlfBlock(Block bloc)
	{
		return "";
	}
	
	/**
	 * Inspect the statement sequence
	 * @param aStatementSequence : Alf::StatementSequence
	 * @return code translation : String
	 */
	protected String generateStatementSequence(StatementSequence aStatementSequence) {
		String result = "";
		for(DocumentedStatement ds : aStatementSequence.getStatements()) {
			result += generateDocumentedStatement(ds);
		}
		return result;
	}

	/**
	 * Inspect the document statment
	 * @param aDocumentedStatement : Alf::SocumentStatement
	 * @return code translation : String
	 */
	protected String generateDocumentedStatement(DocumentedStatement aDocumentedStatement) {
		return generateSequenceStatement(aDocumentedStatement.getStatement());
	}

	/**
	 * Generate statement sequence
	 * @param aStatement : Alf::Statement 
	 * @return code translation : String
	 */
	protected String generateSequenceStatement(Statement aStatement) {
		return generateStatement(aStatement);
	}

	/**
	 * Inspect statement
	 * @param aStatement : Alf::Statement
	 * @return code translation : String
	 */
	protected String generateStatement(Statement aStatement) {
		String result = "";
		if(aStatement instanceof InlineStatement)
			result = generateInlineStatement((InlineStatement)aStatement);
		else if(aStatement instanceof AnnotatedStatement)
			result = generateAnnotatedStatement((AnnotatedStatement)aStatement);
		else if(aStatement instanceof BlockStatement)
			result = generateBlockStatement((BlockStatement)aStatement);
		else if(aStatement instanceof EmptyStatement)
			result = generateEmptyStatement((EmptyStatement)aStatement);
		else if(aStatement instanceof LocalNameDeclarationStatement)
			result = generateLocalNameDeclarationStatement((LocalNameDeclarationStatement)aStatement);
		else if(aStatement instanceof IfStatement)
			result = generateIfStatement((IfStatement)aStatement);
		else if(aStatement instanceof SwitchStatement)
			result = generateSwitchStatement((SwitchStatement)aStatement);
		else if(aStatement instanceof WhileStatement)
			result = generateWhileStatement((WhileStatement)aStatement);
		else if(aStatement instanceof DoStatement)
			result = generateDoStatement((DoStatement)aStatement);
		else if(aStatement instanceof ForStatement)
			result = generateForStatement((ForStatement)aStatement);
		else if(aStatement instanceof BreakStatement)
			result = generateBreakStatement((BreakStatement)aStatement);
		else if(aStatement instanceof ReturnStatement)
			result = generateReturnStatement((ReturnStatement)aStatement);
		else if(aStatement instanceof AcceptStatement)
			result = generateAcceptStatement((AcceptStatement)aStatement);
		else if(aStatement instanceof ClassifyStatement)
			result = generateClassifyStatement((ClassifyStatement)aStatement);
		else if(aStatement instanceof InvocationOrAssignementOrDeclarationStatement)
			result = generateInvocationOrAssignementOrDeclarationStatement((InvocationOrAssignementOrDeclarationStatement)aStatement);
		else if(aStatement instanceof SuperInvocationStatement)
			result = generateSuperInvocationStatement((SuperInvocationStatement)aStatement);
		else if(aStatement instanceof ThisInvocationStatement)
			result = generateThisInvocationStatement((ThisInvocationStatement)aStatement);
		else if(aStatement instanceof InstanceCreationInvocationStatement)
			result = generateInstanceCreationInvocationStatement((InstanceCreationInvocationStatement)aStatement);
		//result += "\n";
		return result;
	}

	/**
	 * Generate inline statement 
	 * @param aInlineStatement Alf::InLineStatement 
	 * @return code translation : String
	 */
	protected String generateInlineStatement(InlineStatement aInlineStatement) {
		return "";
	}

	/**
	 * Generate annotated statement
	 * @param aAnnotatedStatement Alf::AnnotatedStatement
	 * @return code translation : String
	 */
	protected String generateAnnotatedStatement(AnnotatedStatement aAnnotatedStatement) {
		return "/* TODO : AnnotatedStatement not define !!! */";
	}

	/**
	 * Generate block statement
	 * @param aBlockStatement Alf::BlockStatement
	 * @return code translation : String
	 */
	protected String generateBlockStatement(BlockStatement aBlockStatement) {
		String result = "";
		if(aBlockStatement != null)
		{
			result = generateAlfBlock(aBlockStatement.getBlock());
		}
		return result;
	}

	/**
	 * Generate empty statement
	 * @param aEmptyStatement Alf::EmptyStatement
	 * @return code translation : String
	 */
	protected String generateEmptyStatement(EmptyStatement aEmptyStatement) {
		return "";
	}

	/**
	 * Generate if statement
	 * @param aIfStatement Alf::IfStatement
	 * @return code translation : String
	 */
	protected String generateIfStatement(IfStatement aIfStatement) {
		return "";
	}

	/**
	 * Inspect sequential clause template
	 * @param aSequentialClauses Alf::SequentialClausesTemplate
	 * @return code translation : String
	 */
	protected String generateSequentialClausesTemplate(SequentialClauses aSequentialClauses) {
		return "";
	}

	/**
	 * Inspect concurrent clauses template
	 * @param aConcurrentClauses Alf::CoucurrentClausesTemplate
	 * @return code translation : String
	 */
	protected String generateConcurrentClausesTemplate(ConcurrentClauses aConcurrentClauses) {
		return "";
	}

	/**
	 * Generate non final clauses template
	 * @param aNonFinalClause Alf::NonFinalClauseTemplate
	 * @return code translation : String
	 */
	protected String generateNonFinalClauseTemplate(NonFinalClause aNonFinalClause) {
		return "";
	}

	/**
	 * Generate final clause
	 * @param aFinalClause : Alf::FinalClause
	 * @return code translation : String
	 */
	protected String generateFinalClauseTemplate(FinalClause aFinalClause) {
		return generateAlfBlock(aFinalClause.getBlock());
	}

	/**
	 * Generate switch statement
	 * @param aSwitchStatement : Alf::SwitchStatement
	 * @return code translation : String
	 */
	protected String generateSwitchStatement(SwitchStatement aSwitchStatement) {
		return "";
	}

	/**
	 * generate switch default clause
	 * @param aSwitchDefaultClause Alf::SwitchDefaultClause
	 * @return code translation : String
	 */
	protected String generateSwitchDefaultclause(SwitchDefaultClause aSwitchDefaultClause) {
		return "";
	}

	/**
	 * Generate switch clause
	 * @param aSwitchClause : Alf::SwitchClause
	 * @return code translation : String
	 */
	protected String generateSwitchClause(SwitchClause aSwitchClause) {
		return "";
	}

	/**
	 * Generate switch case
	 * @param aSwitchCase : Alf::SwitchCase
	 * @return
	 */
	protected String generateSwitchCase(SwitchCase aSwitchCase) {
		return "";
	}

	/**
	 * Inspect non empty statement sequence
	 * @param aNonEmptyStatementSequence : Alf::NonEmptyStatementSequence
	 * @return code translation : String
	 */
	protected String generateNonEmptyStatementSequence(NonEmptyStatementSequence aNonEmptyStatementSequence) {
		String result = "";
		for(DocumentedStatement ds : aNonEmptyStatementSequence.getStatement())
		{
			result += generateDocumentedStatement(ds);
		}
		return result;
	}

	/**
	 * Generate while statement
	 * @param aWhileStatement : Alf::WhileStatement
	 * @return code translationn : String
	 */
	protected String generateWhileStatement(WhileStatement aWhileStatement) {
		return "";
	}

	/**
	 * Generate do while statement
	 * @param aDoStatement : Alf::DoStatement
	 * @return code translation : String
	 */
	protected String generateDoStatement(DoStatement aDoStatement) {
		return "";
	}

	/**
	 * Generate for statement
	 * @param aForStatement : Alf::ForStatement
	 * @return code translation : String
	 */
	protected String generateForStatement(ForStatement aForStatement) {
		String result = "";
		
		ForControl control = aForStatement.getControl();
		EList<LoopVariableDefinition> vardef = control.getLoopVariableDefinition();
		LinkedList<Expression> init = new LinkedList<Expression>();
		LinkedList<Expression> borne = new LinkedList<Expression>();
		LinkedList<Expression> increment = new LinkedList<Expression>();
		init.add((Expression)vardef.get(0));
		borne.add((Expression)vardef.get(1));
		increment.add((Expression)vardef.get(2));
		
		result += FOR_KEYWORD + "(" + generateSequenceExpressionForm((EList<Expression>) init) + ";";
		result += generateSequenceExpressionForm((EList<Expression>) borne) + ";";
		result += generateSequenceExpressionForm((EList<Expression>) increment) + ")\n";
		result += generateAlfBlock(aForStatement.getBlock());
				
		return result;
	}

	/**
	 * Generate break statement
	 * @param aBreakStatement : Alf::BreakStatement
	 * @return code translation : String
	 */
	protected String generateBreakStatement(BreakStatement aBreakStatement) {
		String result = "";
		if(aBreakStatement != null)
		{
			result = BREAK_KEYWORD;
		}
		return result;
	}

	/**
	 * Generate return statement
	 * @param aReturnStatement : Alf::ReturnStatement
	 * @return code translation : String
	 */
	protected String generateReturnStatement(ReturnStatement aReturnStatement) {
		String result = "";
		if(aReturnStatement != null)
		{
			result = RETURN_KEYWORD;
			result += generateExpressionForm(aReturnStatement.getExpression()) + "\n";
		}
		return result;
	}

	/**
	 * Generate accept statement
	 * @param aAcceptStatement : Alf::AcceptStatement
	 * @return code translation : String
	 */
	protected String generateAcceptStatement(AcceptStatement aAcceptStatement) {
		return "/* TODO : AcceptStatement not define !!! */";
	}

	/**
	 * Generate classify statement
	 * @param aClassifyStatement : Alf::ClassifyStatement
	 * @return code translation : String
	 */
	protected String generateClassifyStatement(ClassifyStatement aClassifyStatement) {
		return "/* TODO : ClassifyStatement not define!!! */";
	}

	/**
	 * Generate invocation, assignement or declaration statement
	 * @param aInvocationOrAssignementOrDeclarationStatement : Alf::InvocationorAssignementorDeclarationStatement
	 * @return code translation : String
	 */
	protected String generateInvocationOrAssignementOrDeclarationStatement(
			InvocationOrAssignementOrDeclarationStatement aInvocationOrAssignementOrDeclarationStatement) {
		return "";
	}

	/**
	 * Generate variable declaration completion
	 * @param aVariableDeclarationCompletion : Alf::VariableDeclarationCompletion
	 * @return code translation : String
	 */
	protected String generateVariableDeclarationCompletion(
			VariableDeclarationCompletion aVariableDeclarationCompletion) {
		return "";
	}

	/**
	 * Generate asssignment completion
	 * @param aAssignmentCompletion : Alf::AssignmentCompletion
	 * @return code translation : String
	 */
	protected String generateAssignmentCompletion(AssignmentCompletion aAssignmentCompletion) {
		String result = "";
		if(aAssignmentCompletion != null)
		{
			result = aAssignmentCompletion.getOp().getLiteral();
			result += generateConditionalTestExpression((ConditionalTestExpression)aAssignmentCompletion.getRightHandSide());
		}
		return result;
	}

	/**
	 * Generate assignment operator
	 * @param aAssignmentOperator : Alf::AssignmentOperator
	 * @return code translation : String
	 */
	protected String generateAssignmentOperator(AssignmentOperator aAssignmentOperator) {
		return aAssignmentOperator.getName();
	}

	/**
	 * Generate super invocation statement
	 * @param aSuperInvocationStatement : Alf::SuperinvocationStatement
	 * @return code translation : String
	 */
	protected String generateSuperInvocationStatement(SuperInvocationStatement aSuperInvocationStatement) {
		String result = "";
		if(aSuperInvocationStatement != null)
		{
			result = generateSuperInvocationExpression(aSuperInvocationStatement.get_super());
		}
		return result;
	}

	/**
	 * Generate super invocation expression
	 * @param aSuperInvocationExpression : Alf::SuperInvocationExpression
	 * @return code translation : String
	 */
	protected String generateSuperInvocationExpression(
			SuperInvocationExpression aSuperInvocationExpression) {
		return "";
	}

	/**
	 * Generate operation call expression
	 * @param aOperationCallExpression : Alf::OperationCallExpression
	 * @return code translation : String
	 */
	protected String generateOperationCallExpression(OperationCallExpression aOperationCallExpression) {
		String result = "";
		result = aOperationCallExpression.getOperationName();
		result += generateTupleTemplate(aOperationCallExpression.getTuple());
		result += generateSuffixExpression(aOperationCallExpression.getSuffix(), ".");
		return result;
	}

	/**
	 * inspect tuple template
	 * @param aTuple : Alf::Tuple
	 * @return code translation : String
	 */
	protected String generateTupleTemplate(Tuple aTuple) {
		String result = "";
		if(aTuple != null)
		{
			result = "(";
			for(TupleElement elt : aTuple.getTupleElements())
			{
				boolean isLast = (aTuple.getTupleElements().indexOf(elt) == (aTuple.getTupleElements().size() - 1));
				result += generateTupleElement(elt);
				if(isLast == false)
				{
					result += ",";
				}
			}
			result += ")";
		}
		return result;
	}

	/**
	 * Generate tuple element
	 * @param aTupleElement : Alf::TupleElement
	 * @return code translation : String
	 */
	protected String generateTupleElement(TupleElement aTupleElement) {
		return generateConditionalTestExpression((ConditionalTestExpression)aTupleElement.getArgument());
	}

//	 TODO a faire...
//	/**
//	 * Generate operation call expression without '.'
//	 * @param aOperationCallExpressionWithoutDot : Alf::OperationCallExpressionWithoutDot
//	 * @return code translation : String
//	 */
//	protected String generateOperationCallExpressionWithoutDot(OperationCallExpressionWithoutDot aOperationCallExpressionWithoutDot) {
//		return "";
//	}

	/**
	 * Generate this invocation statement
	 * @param aThisInvocationStatement : Alf::ThisinvocationStatement
	 * @return code translation : String
	 */
	protected String generateThisInvocationStatement(ThisInvocationStatement aThisInvocationStatement) {
		String result = "";
		if(aThisInvocationStatement != null)
		{
			result = generateThisExpression(aThisInvocationStatement.get_this());
			result = generateAssignmentCompletion(aThisInvocationStatement.getAssignmentCompletion());
		}
		return result;
	}

	/**
	 * Generate instance invocation statement
	 * @param aInstanceCreationInvocationStatement : Alf::InstanceInvocationstatement
	 * @return code translation : String
	 */
	protected String generateInstanceCreationInvocationStatement(InstanceCreationInvocationStatement aInstanceCreationInvocationStatement) {
		String result = "";
		if(aInstanceCreationInvocationStatement != null)
		{
			result = generateInstanceCreationExpression(aInstanceCreationInvocationStatement.get_new());
		}
		return result;
	}

	/**
	 * Generate annotation
	 * @param aAnnotation : Alf::Annotation
	 * @return code translation : String
	 */
	protected String generateAnnotation(Annotation aAnnotation) {
		return "/* TODO : Annotation not define !!! */";
	}

	/**
	 * Generate expression
	 * @param aExpression : Alf::Expression
	 * @return code translation: String
	 */
	protected String generateExpressionForm(Expression aExpression) {
		String result = "";
		if(aExpression instanceof ConditionalTestExpression)
		{
			result = generateConditionalTestExpression((ConditionalTestExpression)aExpression);
		}
		return result;
	}

	/**
	 * inspect expression sequence
	 * @param list : EList<Expression>
	 * @return code translation : String
	 */
	protected String generateSequenceExpressionForm(EList<Expression> list) {
		String result = "";
		for(Expression exp : list)
		{
			result += generateExpressionForm(exp);
		}
		return result;
	}

	/**
	 * Generate conditional test expression
	 * @param aConditionalTestExpression : Alf::ConditionalTestExpression
	 * @return code translation : String
	 */
	protected String generateConditionalTestExpression(ConditionalTestExpression aConditionalTestExpression) {
		String result = "";
		if(aConditionalTestExpression != null)
		{
			result += generateConditionalOrExpression(aConditionalTestExpression.getExp());
			if(aConditionalTestExpression.getWhenTrue() != null)
			{
				result += "?" + generateConditionalTestExpression(aConditionalTestExpression.getWhenTrue());
			}
			if(aConditionalTestExpression.getWhenFalse() != null)
			{
				result += ":" + generateConditionalTestExpression(aConditionalTestExpression.getWhenFalse());
			}
		}
		return result;
	}

	/**
	 * Generate conditional or expression
	 * @param aConditionalOrExpression : Alf::ConditionalOrExpression
	 * @return code translation : String
	 */
	protected String generateConditionalOrExpression(ConditionalOrExpression aConditionalOrExpression) {
		String result = "";
		for(ConditionalAndExpression exp : aConditionalOrExpression.getExp()){
			boolean islast = (aConditionalOrExpression.getExp().indexOf(exp)) == (aConditionalOrExpression.getExp().size() - 1);
			if(aConditionalOrExpression.getExp().size() > 1)
			{
				result += "(" + generateConditionalAndExpression(exp) + ")";
			}
			else
			{
				result += generateConditionalAndExpression(exp);
			}
			
			if(islast == false)
			{
				result += "||";
			}
		}
		return result;

	}
	
	/**
	 * Generate conditional and expression
	 * @param aConditionalAndExpression : Alf::ConditionalAndExpression
	 * @return code translation : String
	 */
	protected String generateConditionalAndExpression(ConditionalAndExpression aConditionalAndExpression) {
		String result = "";
		for(InclusiveOrExpression exp : aConditionalAndExpression.getExp()){
			boolean islast = (aConditionalAndExpression.getExp().indexOf(exp)) == (aConditionalAndExpression.getExp().size() - 1);
			if(aConditionalAndExpression.getExp().size() > 1)
			{
				result += "(" + generateInclusiveOrExpression(exp) + ")";
			}
			else
			{
				result += generateInclusiveOrExpression(exp);
			}
			
			if(islast == false)
			{
				result += "&&";
			}
		}
		return result;
	}

	/**
	 * Generate inclusive or expression
	 * @param aInclusiveOrExpression : Alf::InclusiveOrExpression
	 * @return code translation : String
	 */
	protected String generateInclusiveOrExpression(InclusiveOrExpression aInclusiveOrExpression) {
		String result = "";
		for(ExclusiveOrExpression exp : aInclusiveOrExpression.getExp()){
			boolean islast = (aInclusiveOrExpression.getExp().indexOf(exp)) == (aInclusiveOrExpression.getExp().size() - 1);
			if(aInclusiveOrExpression.getExp().size() > 1)
			{
				result += "(" + generateExclusiveOrExpression(exp) + ")";
			}
			else
			{
				result += generateExclusiveOrExpression(exp);
			}
			
			if(islast == false)
			{
				result += "|";
			}
		}
		return result;
	}

	/**
	 * Generate exclusive or expression
	 * @param aExclusiveOrExpression : Alf::ExclusiveOrExpression
	 * @return code translation : String
	 */
	protected String generateExclusiveOrExpression(ExclusiveOrExpression aExclusiveOrExpression) {
		String result = "";
		for(AndExpression exp : aExclusiveOrExpression.getExp()){
			boolean islast = (aExclusiveOrExpression.getExp().indexOf(exp)) == (aExclusiveOrExpression.getExp().size() - 1);
			if(aExclusiveOrExpression.getExp().size() > 1)
			{
				result += "(" + generateAndExpression(exp) + ")";
			}
			else
			{
				result += generateAndExpression(exp);
			}
			
			if(islast == false)
			{
				result += "^";
			}
		}
		return result;
	}

	/**
	 * Generate and expression
	 * @param aAndExpression : Alf::AndExpression
	 * @return code translation : String
	 */
	protected String generateAndExpression(AndExpression aAndExpression) {
		String result = "";
		for(EqualityExpression exp : aAndExpression.getExp()){
			boolean islast = (aAndExpression.getExp().indexOf(exp)) == (aAndExpression.getExp().size() - 1);
			if(aAndExpression.getExp().size() > 1)
			{
				result += "(" + generateEqualityExpression(exp) + ")";
			}
			else
			{
				result += generateEqualityExpression(exp);
			}
			
			if(islast == false)
			{
				result += "&";
			}
		}
		return result;
	}

	/**
	 * Generate equality expression
	 * @param aEqualityExpression : Alf::EqualityExpression
	 * @return code translation : String
	 */
	protected String generateEqualityExpression(EqualityExpression aEqualityExpression) {
		String result = "";
		if(aEqualityExpression != null)
		{
			for(int cpt = 0; cpt < aEqualityExpression.getExp().size(); cpt ++)
			{
				ClassificationExpression exp = aEqualityExpression.getExp().get(cpt);
				result += generateClassificationExpression(exp);
				if(cpt < aEqualityExpression.getOp().size())
				{
					result += aEqualityExpression.getOp().get(cpt);
				}
			}
		}
		return result;
	}

	/**
	 * Generate classification expression
	 * @param aClassificationExpression : Alf::ClassificationExpression
	 * @return code translation : String
	 */
	protected String generateClassificationExpression(ClassificationExpression aClassificationExpression) {
		String result = "";
		if(aClassificationExpression != null)
		{
			if(aClassificationExpression.getOp() != null)
			{
				result += aClassificationExpression.getOp();
			}
			result += generateRelationalExpression(aClassificationExpression.getExp());
		}
		return result;
	}

	/**
	 * Generate sequence construction or access completion
	 * @param aSequenceConstructionOrAccessCompletion : Alf::SequenceConstructionorAccesCompletion
	 * @return code translation : String
	 */
	protected String generateSequenceConstructionOrAccessCompletion(
			SequenceConstructionOrAccessCompletion aSequenceConstructionOrAccessCompletion) {
		return "";

	}

	/**
	 * Generate Qualified name path
	 * @param aQualifiedNamePath : Alf::QualifiedNamepath
	 * @return code translation : String
	 */
	protected String generateQualifiedNamePath(QualifiedNamePath aQualifiedNamePath) {
		String result = "";
		if(aQualifiedNamePath != null)
		{
			for(UnqualifiedName name : aQualifiedNamePath.getNamespace())
			{
				result += generateUnqualifiedName(name);
			}
		}
		return result;
	}

	/**
	 * Generate unqualified name
	 * @param aUnqualifiedName : Alf::UnqualifiedName
	 * @return code translation : String
	 */
	protected String generateUnqualifiedName(UnqualifiedName aUnqualifiedName) {
		return "";

	}

	/**
	 * Generate templete binding
	 * @param aTemplateBinding: Alf::TemplateBinding
	 * @return code translation : String
	 */
	protected String generateTemplateBinding(TemplateBinding aTemplateBinding) {
		return "";
	}

	/**
	 * Generate relational epxression
	 * @param aRelationalExpression : Alf::RelationalExpression
	 * @return code translation : String
	 */
	protected String generateRelationalExpression(RelationalExpression aRelationalExpression) {
		String result = "";
		result = generateShiftExpression(aRelationalExpression.getLeft());
		if(aRelationalExpression.getOp() != null)
		{
			result += aRelationalExpression.getOp();
		}
		result += generateShiftExpression(aRelationalExpression.getRight());
		return result;
	}

	/**
	 * Generate shift expression
	 * @param aShiftExpression : Alf::ShiftExpression
	 * @return code translation : String
	 */
	protected String generateShiftExpression(ShiftExpression aShiftExpression) {
		String result = "";
		if(aShiftExpression != null)
		{
			for(AdditiveExpression exp : aShiftExpression.getExp())
			{
				result += generateAdditiveExpression(exp);
				if(aShiftExpression.getOp() != null)
				{
					result += aShiftExpression.getOp();
				}
			}
		}
		return result;
	}

	/**
	 * Generate additive expression
	 * @param aAdditiveExpression : Alf::AdditiveExpression
	 * @return code translation : String
	 */
	protected String generateAdditiveExpression(AdditiveExpression aAdditiveExpression) {
		String result = "";
		for(int cpt = 0; cpt < aAdditiveExpression.getExp().size(); cpt ++)
		{
			MultiplicativeExpression exp = aAdditiveExpression.getExp().get(cpt); 	
			result += generateMultiplicativeExpression(exp);
			if(cpt < aAdditiveExpression.getOp().size())
			{
				result += aAdditiveExpression.getOp().get(cpt);
			}
		}	
		return result;
	}
	
	/**
	 * Generate multiplicative expression
	 * @param aMultiplicativeExpression : Alf::MultiplicativeExpression
	 * @return code translation : String
	 */
	protected String generateMultiplicativeExpression(MultiplicativeExpression aMultiplicativeExpression) {
		String result = "";
		for(int cpt = 0; cpt < aMultiplicativeExpression.getExp().size(); cpt ++)
		{
			UnaryExpression exp = aMultiplicativeExpression.getExp().get(cpt); 	
			result += generateUnaryExpression(exp);
			if(cpt < aMultiplicativeExpression.getOp().size())
			{
				result += aMultiplicativeExpression.getOp().get(cpt);
			}
		}	
		return result;
	}

	/**
	 * Generate unary expression
	 * @param aUnaryExpression : Alf::UnaryExpression
	 * @return code translation : String
	 */
	protected String generateUnaryExpression(UnaryExpression aUnaryExpression) {
		String result = "";
		if(aUnaryExpression != null)
		{
			if(aUnaryExpression.getOp() != null)
			{
				result += aUnaryExpression.getOp();
			}
			result += generatePrimaryExpression(aUnaryExpression.getExp());
		}
		return result;

	}

	/**
	 * Generate primary expression
	 * @param aPrimaryExpression : Alf::PrimaryExpression
	 * @return code translation : String
	 */
	protected String generatePrimaryExpression(PrimaryExpression aPrimaryExpression) {
		return generateValueSpecification(aPrimaryExpression.getPrefix());
	}

	/**
	 * Generate value specification
	 * @param aValueSpecification : Alf::ValueSpecification
	 * @return code translation : String
	 */
	protected String generateValueSpecification(ValueSpecification aValueSpecification) {
		String result = "";
		if(aValueSpecification instanceof NameExpression)
			result = generateNameExpression((NameExpression) aValueSpecification, true);
		else if(aValueSpecification instanceof LITERAL)
			result = generateLiteral((LITERAL)aValueSpecification);
		else if(aValueSpecification instanceof ThisExpression)
			result = generateThisExpression((ThisExpression)aValueSpecification);
		else if(aValueSpecification instanceof SuperInvocationExpression)
			result = generateSuperInvocationExpression((SuperInvocationExpression)aValueSpecification);
		else if(aValueSpecification instanceof InstanceCreationExpression)
			result = generateInstanceCreationExpression((InstanceCreationExpression)aValueSpecification);
		else if(aValueSpecification instanceof ParenthesizedExpression)
			result = generateParenthesizedExpression((ParenthesizedExpression)aValueSpecification);
		else if(aValueSpecification instanceof NullExpression)
			result = generateNullExpression((NullExpression)aValueSpecification);
		return result;
	}

	/**
	 * Generate this expression
	 * @param aThisExpression : Alf::ThisExpression
	 * @return code translation : String
	 */
	protected String generateThisExpression(ThisExpression aThisExpression) {
		return "";
	}

	/**
	 * Generate null expression
	 * @param aNullExpression : Alf::NullExpression
	 * @return code translation : String
	 */
	protected String generateNullExpression(NullExpression aNullExpression) {
		String result = "";
		if(aNullExpression != null)
		{
			result = "0";
		}
		return result;
	}

	/**
	 * Generate parenthesized expression
	 * @param aParenthesizedExpression : Alf::ParenthesizedExpression
	 * @return code translation : String
	 */
	protected String generateParenthesizedExpression(ParenthesizedExpression aParenthesizedExpression) {
		String result = "";
		if(aParenthesizedExpression != null)
		{
			result += "(" + generateExpressionForm(aParenthesizedExpression.getExpOrTypeCast()) + ")";
			result += generateNonLiteralValueSpecification(aParenthesizedExpression.getCasted());
			result += generateSuffixExpression(aParenthesizedExpression.getSuffix(), "->");
		}
		return result;
	}

	/**
	 * Generate non literal value speciifcation
	 * @param aNonLiteralValueSpecification : Alf::NonLiteralValueSpecification
	 * @return code translation : String
	 */
	protected String generateNonLiteralValueSpecification(NonLiteralValueSpecification aNonLiteralValueSpecification) {
		String result = "";
		if(aNonLiteralValueSpecification instanceof NameExpression)
			result = generateNameExpression((NameExpression)aNonLiteralValueSpecification, true);
		else if(aNonLiteralValueSpecification instanceof ThisExpression)
			result = generateThisExpression((ThisExpression)aNonLiteralValueSpecification);
		else if(aNonLiteralValueSpecification instanceof SuperInvocationExpression)
			result = generateSuperInvocationExpression((SuperInvocationExpression)aNonLiteralValueSpecification);
		else if(aNonLiteralValueSpecification instanceof InstanceCreationExpression)
			result = generateInstanceCreationExpression((InstanceCreationExpression)aNonLiteralValueSpecification);
		else if(aNonLiteralValueSpecification instanceof ParenthesizedExpression)
			result = generateParenthesizedExpression((ParenthesizedExpression)aNonLiteralValueSpecification);
		return result;
	}

	/**
	 * Generate instance creation expression
	 * @param aInstanceCreationExpression : Alf::InstanceCreationExpression
	 * @return code translation : String
	 */
	protected String generateInstanceCreationExpression(InstanceCreationExpression aInstanceCreationExpression) {
		return "";
	}

	/**
	 * Generate qualified name with binding
	 * @param aQualifiedNameWithBinding : Alf::QualifiedNameWithBinding
	 * @return code translation : String
	 */
	protected String generateQualifiedNameWithBinding(QualifiedNameWithBinding aQualifiedNameWithBinding) {
		return "";
	}
	
	/**
	 * Generate sequence construction completion
	 * @param aSequenceConstructionCompletion : Alf::SequenceConstructionCompletion
	 * @return code translation : String
	 */
	protected String generateSequenceConstructionCompletion(SequenceConstructionCompletion aSequenceConstructionCompletion) {
		return "";

	}

	/**
	 * Inspect literal
	 * @param aLITERAL : Alf::LITERAL
	 * @return code translation : String
	 */
	protected String generateLiteral(LITERAL aLITERAL) {
		String result = "";
		if(aLITERAL != null)
		{
			if(aLITERAL instanceof STRING_LITERAL)
				result = generateStringLiteral((STRING_LITERAL)aLITERAL);
			else if(aLITERAL instanceof BOOLEAN_LITERAL)
				result = generateBooleanLiteral((BOOLEAN_LITERAL)aLITERAL);
			else if(aLITERAL instanceof NUMBER_LITERAL)
				result = generateNumberLiteral((NUMBER_LITERAL)aLITERAL);
		}
		return result;
	}

	/**
	 * Generate interger literal
	 * @param aINTEGER_LITERAL : Alf::INTEGER_LITERAL
	 * @return code translation : String
	 */
	protected String generateIntegerLiteral(INTEGER_LITERAL aINTEGER_LITERAL) {
		String result = "";
		if(aINTEGER_LITERAL != null)
		{
			result = aINTEGER_LITERAL.getValue();
		}
		return result;
	}

	/**
	 * Generate string literal
	 * @param aSTRING_LITERAL : Alf::STRING_LITERAL
	 * @return code translation : String
	 */
	protected String generateStringLiteral(STRING_LITERAL aSTRING_LITERAL) {
		String result = "";
		if(aSTRING_LITERAL != null)
		{
			result = aSTRING_LITERAL.getValue();
		}
		return result;
	}

	/**
	 * Generate boolean literal
	 * @param aBOOLEAN_LITERAL : Alf::BOOLEAN_LITERAL
	 * @return code translation : String
	 */
	protected String generateBooleanLiteral(BOOLEAN_LITERAL aBOOLEAN_LITERAL) {
		String result = "";
		if(aBOOLEAN_LITERAL != null)
		{
			result = aBOOLEAN_LITERAL.getValue().getName();
		}
		return result;
	}

	/**
	 * inspect number literal
	 * @param aNUMBER_LITERAL : Alf::NUMBER_LITERAL
	 * @return code translation : String
	 */
	protected String generateNumberLiteral(NUMBER_LITERAL aNUMBER_LITERAL) {
		String result = "";
		if(aNUMBER_LITERAL != null)
		{
			if(aNUMBER_LITERAL instanceof INTEGER_LITERAL)
				result = generateIntegerLiteral((INTEGER_LITERAL)aNUMBER_LITERAL);
			else if(aNUMBER_LITERAL instanceof UNLIMITED_LITERAL)
				result = generateUnlimitedLiteral((UNLIMITED_LITERAL)aNUMBER_LITERAL);
		}
		return result;
	}

	/**
	 * Generate unlimited literal
	 * @param aUNLIMITED_LITERAL : Alf::UNLIMITED_LITERAL
	 * @return code translation : String
	 */
	protected String generateUnlimitedLiteral(UNLIMITED_LITERAL aUNLIMITED_LITERAL) {
		String result = "";
		if(aUNLIMITED_LITERAL != null)
		{
			result = aUNLIMITED_LITERAL.getValue();
		}
		return result;

	}

	/**
	 * Inspect suffix expression
	 * @param aSuffixExpression : Alf::SuffixExpression
	 * @param dot_or_arrow '.' or '->' operator : String
	 * @return code translation : String
	 */
	protected String generateSuffixExpression(SuffixExpression aSuffixExpression, String dot_or_arrow) {
		String result = "";

		if(aSuffixExpression != null)
		{
			if(aSuffixExpression instanceof OperationCallExpression)
				result = generateOperationCallExpression((OperationCallExpression)aSuffixExpression);
			else if(aSuffixExpression instanceof PropertyCallExpression)
				result = generatePropertyCallExpression((PropertyCallExpression)aSuffixExpression);
			else if(aSuffixExpression instanceof LinkOperationExpression)
				result = generateLinkOperationExpression((LinkOperationExpression)aSuffixExpression);
			else if(aSuffixExpression instanceof SequenceOperationExpression)
				result = generateSequenceOperationExpression((SequenceOperationExpression)aSuffixExpression);
			else if (aSuffixExpression instanceof SequenceReductionExpression)
				result = generateSequenceReductionExpression((SequenceReductionExpression)aSuffixExpression);
			else if(aSuffixExpression instanceof SequenceExpansionExpression)
				result = generateSequenceExpansionExpression((SequenceExpansionExpression)aSuffixExpression);
			else if(aSuffixExpression instanceof ClassExtentExpression)
				result = generateClassExtentExpression((ClassExtentExpression)aSuffixExpression);
		}
		return result;
	}

	/**
	 * Generate property call expression
	 * @param aPropertyCallExpression : Alf::PropertyCallExpression
	 * @return code translation : String
	 */
	protected String generatePropertyCallExpression(PropertyCallExpression aPropertyCallExpression) {
		String result = "";
		if(aPropertyCallExpression != null)
		{
			result += aPropertyCallExpression.getPropertyName();
			result += "[" + generateConditionalTestExpression((ConditionalTestExpression)aPropertyCallExpression.getIndex()) + "]";
			result += generateSuffixExpression(aPropertyCallExpression.getSuffix(), "->");
		}
		return result;
	}

	/**
	 * Generate link operation call expression
	 * @param aLinkOperationExpression : Alf::LinkOperationCallExpression
	 * @return code translation : String
	 */
	protected String generateLinkOperationExpression(LinkOperationExpression aLinkOperationExpression) {
		String result = "";
		if(aLinkOperationExpression != null)
		{
			//TODO : a faire ...
			
//			result += generateLinkOperationKind((aLinkOperationExpression).getKind());
//			result += generateLinkOperationTuple(aLinkOperationExpression.getTuple());
		}
		return result;
	}

	/**
	 * Generate link operation tuple
	 * @param aLinkOperationTuple : Alf::LinkOperationTuple
	 * @return code translation : String
	 */
	protected String generateLinkOperationTuple(LinkOperationTuple aLinkOperationTuple) {
		String result = "";
		if(aLinkOperationTuple != null)
		{
			result = "(";
			for(LinkOperationTupleElement elt : aLinkOperationTuple.getLinkOperationTupleElement()){
				boolean isLast = (aLinkOperationTuple.getLinkOperationTupleElement().indexOf(elt) ==
						(aLinkOperationTuple.getLinkOperationTupleElement().size() -1));
				
				result += generateLinkOperationTupleElement(elt);
				if(isLast == false)
				{
					result += ",";
				}
			}
		}
		return result;
	}

	/**
	 * Generate link operation tuple element
	 * @param aLinkOperationTupleElement : Alf::LinkOperationTupleElement
	 * @return code translation : String
	 */
	protected String generateLinkOperationTupleElement(LinkOperationTupleElement aLinkOperationTupleElement) {
		String result = "";
		if(aLinkOperationTupleElement != null)
		{
//			result = aLinkOperationTupleElement.getObjectOrRole();
			result = aLinkOperationTupleElement.getRole();
			if(aLinkOperationTupleElement.getRole().isEmpty() == false)
			{
				if(aLinkOperationTupleElement.getRoleIndex() != null)
				{
					result += "[" + generateConditionalTestExpression((ConditionalTestExpression)aLinkOperationTupleElement.getRoleIndex()) + "]";
				}
				result += ":" + aLinkOperationTupleElement.getObject();
			}
		}
		return result;
	}

	/**
	 * Generate link operation kind
	 * @param aLinkOperationKind : Alf::LinkOperationKind
	 * @return code translation : String
	 */
	protected String generateLinkOperationKind(LinkOperationKind aLinkOperationKind) {
		String result = "";
		if(aLinkOperationKind != null)
		{
			result = aLinkOperationKind.getLiteral();
		}
		return result;
	}

	/**
	 * Generate sequence operation expression
	 * @param aSequenceOperationExpression : Alf::SequenceOperationExpression
	 * @return code translation : String
	 */
	protected String generateSequenceOperationExpression(SequenceOperationExpression aSequenceOperationExpression) {
		return "/* TODO : SequenceOperationExpression not define !!! */";
	}

	/**
	 * Generate sequence reduction expression
	 * @param aSequenceReductionExpression : Alf::SequenceReductionExpression
	 * @return code translation : String
	 */
	protected String generateSequenceReductionExpression(SequenceReductionExpression aSequenceReductionExpression) {
		return "/* TODO : SequenceReductionExpression not define !!! */";
	}

	/**
	 * Generate sequence expansion expression
	 * @param aSequenceExpansionExpression : Alf::SequenceExpansionExpression
	 * @return code translation : String
	 */
	protected String generateSequenceExpansionExpression(SequenceExpansionExpression aSequenceExpansionExpression) {
		return "/* TODO : SequenceExpansionExpression not define !!! */";
	}

	/**
	 * Generate class extent expression
	 * @param aClassExtentExpression : Alf::ClassExtentExpression
	 * @return code translation : String
	 */
	protected String generateClassExtentExpression(ClassExtentExpression aClassExtentExpression) {
		return "/* TODO : ClassExtentExpression not define !!! */";
	}

	/**
	 * Generate local name delaration statement
	 * @param aLocalNameDeclarationStatement : Alf::LocalNameDeclarationStatement
	 * @return code translation : String
	 */
	protected String generateLocalNameDeclarationStatement(LocalNameDeclarationStatement aLocalNameDeclarationStatement) {
		return "";
	}

	/**
	 * Generate name expression
	 * @param aNameExpression : Alf::NameExpression
	 * @param isNotNew : Boolean
	 * @return code translation : String
	 */
	protected String generateNameExpression(NameExpression aNameExpression,	Boolean isNotNew) {
		return "";
	}

}
