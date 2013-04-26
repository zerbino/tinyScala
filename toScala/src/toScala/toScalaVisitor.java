// Generated from E:\Marti\cours\Année 2\info\structure et execution des langages de programmation\tp1000\tmp\toScala.g4 by ANTLR 4.0
package toScala;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface toScalaVisitor<T> extends ParseTreeVisitor<T> {
	T visitBooLit(toScalaParser.BooLitContext ctx);

	T visitConstrCall(toScalaParser.ConstrCallContext ctx);

	T visitClasse(toScalaParser.ClasseContext ctx);

	T visitVariable(toScalaParser.VariableContext ctx);

	T visitParam(toScalaParser.ParamContext ctx);

	T visitUnaryExpr(toScalaParser.UnaryExprContext ctx);

	T visitIntLit(toScalaParser.IntLitContext ctx);

	T visitExprOfExpr(toScalaParser.ExprOfExprContext ctx);

	T visitParams(toScalaParser.ParamsContext ctx);

	T visitMethodCall(toScalaParser.MethodCallContext ctx);

	T visitThis(toScalaParser.ThisContext ctx);

	T visitStrLit(toScalaParser.StrLitContext ctx);

	T visitBinaryExprSimple(toScalaParser.BinaryExprSimpleContext ctx);

	T visitFieldAccess(toScalaParser.FieldAccessContext ctx);

	T visitBinaryExprMinus(toScalaParser.BinaryExprMinusContext ctx);

	T visitProgram(toScalaParser.ProgramContext ctx);

	T visitCondExpr(toScalaParser.CondExprContext ctx);

	T visitMethod(toScalaParser.MethodContext ctx);

	T visitExprs(toScalaParser.ExprsContext ctx);

	T visitNull(toScalaParser.NullContext ctx);
}