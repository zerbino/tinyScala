package toScala;

import java.util.ArrayList;
import java.util.List;

import ast.AST;
import ast.BinaryExpr;
import ast.BooLit;
import ast.BooleanLiteral;
import ast.ClassId;
import ast.Classe;
import ast.CondExpr;
import ast.ConstrCall;
import ast.Expr;
import ast.ExprOfExpr;
import ast.Exprs;
import ast.FieldAccess;
import ast.Id;
import ast.IntLit;
import ast.Method;
import ast.MethodCall;
import ast.Null;
import ast.Param;
import ast.Params;
import ast.Program;
import ast.StrLit;
import ast.StringLiteral;
import ast.This;
import ast.UnaryExpr;
import ast.VOp;
import ast.Variable;

public class ASTVisitor extends toScalaBaseVisitor<AST> {

	@Override
	public AST visitProgram(toScalaParser.ProgramContext ctx) {
		Expr expr = (Expr) visit(ctx.expr());
		List<toScalaParser.ClasseContext> classeCtxs = ctx.classe();
		List<Classe> classes = new ArrayList<Classe>();
		for (toScalaParser.ClasseContext classeContext : classeCtxs) {
			classes.add((Classe) visit(classeContext));

		}

		return new Program(expr, classes);
	}

	@Override
	public AST visitClasse(toScalaParser.ClasseContext ctx) {
		ClassId classId = new ClassId(ctx.getText());
		Params params = (Params) visit(ctx.params());

		List<toScalaParser.MethodContext> methodCtxs = ctx.method();
		List<Method> methodes = new ArrayList<Method>();
		for (toScalaParser.MethodContext methodeCtx : methodCtxs) {
			methodes.add((Method) visit(methodeCtx));
		}

		return new Classe(classId, params, methodes);
	}

	@Override
	public AST visitMethod(toScalaParser.MethodContext ctx) {
		Id id = new Id(ctx.getText());
		Params params = (ctx.params()!=null)?(Params) visit(ctx.params()):null;
		ClassId classId = new ClassId(ctx.getText());
		Expr expr = (Expr) visit(ctx.expr());

		return new Method(id, params, classId, expr);
	}

	@Override
	public AST visitIntLit(toScalaParser.IntLitContext ctx) {
		return new IntLit(Integer.parseInt(ctx.getText()));
	}

	@Override
	public AST visitBooLit(toScalaParser.BooLitContext ctx) {
		String valBool = ctx.getText();
		boolean bool = valBool.toUpperCase().equals("TRUE");
		return new BooLit(new BooleanLiteral(bool));
	}

	@Override
	public AST visitStrLit(toScalaParser.StrLitContext ctx) {
		return new StrLit(new StringLiteral(ctx.getText()));
	}

	@Override
	public AST visitThis(toScalaParser.ThisContext ctx) {
		ctx.getText();
		return new This();
	}

	@Override
	public AST visitNull(toScalaParser.NullContext ctx) {
		ctx.getText();
		return new Null();
	}

	@Override
	public AST visitVariable(toScalaParser.VariableContext ctx) {
		return new Variable(new Id(ctx.getText()));
	}

	@Override
	public AST visitFieldAccess(toScalaParser.FieldAccessContext ctx) {
		Expr expr = (Expr) visit(ctx.expr());
		Id id = new Id(ctx.getText());
		return new FieldAccess(expr, id);
	}

	@Override
	public AST visitMethodCall(toScalaParser.MethodCallContext ctx) {
		Expr expr = (Expr) visit(ctx.expr());
		Id id = new Id(ctx.getText());
		Exprs exprs = ((ctx.exprs()!=null)?(Exprs) visit(ctx.exprs()):null);
		return new MethodCall(expr, id, exprs);

	}

	@Override
	public AST visitConstrCall(toScalaParser.ConstrCallContext ctx) {
		ClassId classId = new ClassId(ctx.getText());
		Exprs exprs = (Exprs) visit(ctx.exprs());
		return new ConstrCall(classId, exprs);
	}

	@Override
	public AST visitUnaryExpr(toScalaParser.UnaryExprContext ctx) {
		VOp vop = VOp.getEnum(ctx.getText());
		Expr expr = (Expr) visit(ctx.expr());
		return new UnaryExpr(vop, expr);
	}

	@Override
	public AST visitBinaryExprMinus(toScalaParser.BinaryExprMinusContext ctx) {
		Expr expr1 = (Expr) visit(ctx.expr(0));
		VOp vop = VOp.getEnum(ctx.MINUS().getText());
		Expr expr2 = (Expr) visit(ctx.expr(1));

		return new BinaryExpr(expr1, expr2, vop);
	}

	@Override
	public AST visitBinaryExprSimple(toScalaParser.BinaryExprSimpleContext ctx) {
		Expr expr1 = (Expr) visit(ctx.expr(0));
		VOp vop = VOp.getEnum(ctx.OP2().getText());
		Expr expr2 = (Expr) visit(ctx.expr(1));

		return new BinaryExpr(expr1, expr2, vop);

	}

	public AST visitCondExpr(toScalaParser.CondExprContext ctx) {
		Expr expr1 = (Expr) visit(ctx.expr(0));
		Expr expr2 = (Expr) visit(ctx.expr(1));
		Expr expr3 = (Expr) visit(ctx.expr(2));

		return new CondExpr(expr1, expr2, expr3);
	}

	@Override
	public AST visitExprOfExpr(toScalaParser.ExprOfExprContext ctx) {
		Expr expr = (Expr) visit(ctx.expr());
		return new ExprOfExpr(expr);
	}
	
	@Override
	public AST visitParam(toScalaParser.ParamContext ctx){
		Id id = new Id(ctx.getText());
		ClassId classId = new ClassId(ctx.getText());
		return new Param(id, classId);
	}
	
	@Override
	public AST visitParams(toScalaParser.ParamsContext ctx){
		List<toScalaParser.ParamContext> paramCtxts = ctx.param();
		List<Param> params = new ArrayList<Param>();
		for(toScalaParser.ParamContext paramCtxt:paramCtxts){
			params.add((Param)visit(paramCtxt));
		}
		
		return new Params(params);
	}
	
	@Override
	public AST visitExprs(toScalaParser.ExprsContext ctx){
		List<toScalaParser.ExprContext> exprCtxts = ctx.expr();
		List<Expr> exprs = new ArrayList<Expr>();
		for(toScalaParser.ExprContext exprCtxt : exprCtxts){
			exprs.add((Expr)visit(exprCtxt));
		}
		
		return new Exprs(exprs);
	}
}
