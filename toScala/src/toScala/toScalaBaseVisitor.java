// Generated from E:\Marti\cours\Année 2\info\structure et execution des langages de programmation\tp1000\tmp\toScala.g4 by ANTLR 4.0
package toScala;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class toScalaBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements toScalaVisitor<T> {
	@Override public T visitBooLit(toScalaParser.BooLitContext ctx) { return visitChildren(ctx); }

	@Override public T visitConstrCall(toScalaParser.ConstrCallContext ctx) { return visitChildren(ctx); }

	@Override public T visitClasse(toScalaParser.ClasseContext ctx) { return visitChildren(ctx); }

	@Override public T visitVariable(toScalaParser.VariableContext ctx) { return visitChildren(ctx); }

	@Override public T visitParam(toScalaParser.ParamContext ctx) { return visitChildren(ctx); }

	@Override public T visitUnaryExpr(toScalaParser.UnaryExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitIntLit(toScalaParser.IntLitContext ctx) { return visitChildren(ctx); }

	@Override public T visitExprOfExpr(toScalaParser.ExprOfExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitParams(toScalaParser.ParamsContext ctx) { return visitChildren(ctx); }

	@Override public T visitMethodCall(toScalaParser.MethodCallContext ctx) { return visitChildren(ctx); }

	@Override public T visitThis(toScalaParser.ThisContext ctx) { return visitChildren(ctx); }

	@Override public T visitStrLit(toScalaParser.StrLitContext ctx) { return visitChildren(ctx); }

	@Override public T visitBinaryExprSimple(toScalaParser.BinaryExprSimpleContext ctx) { return visitChildren(ctx); }

	@Override public T visitFieldAccess(toScalaParser.FieldAccessContext ctx) { return visitChildren(ctx); }

	@Override public T visitBinaryExprMinus(toScalaParser.BinaryExprMinusContext ctx) { return visitChildren(ctx); }

	@Override public T visitProgram(toScalaParser.ProgramContext ctx) { return visitChildren(ctx); }

	@Override public T visitCondExpr(toScalaParser.CondExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitMethod(toScalaParser.MethodContext ctx) { return visitChildren(ctx); }

	@Override public T visitExprs(toScalaParser.ExprsContext ctx) { return visitChildren(ctx); }

	@Override public T visitNull(toScalaParser.NullContext ctx) { return visitChildren(ctx); }
}