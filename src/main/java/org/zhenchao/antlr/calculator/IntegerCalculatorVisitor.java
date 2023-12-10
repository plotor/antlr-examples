package org.zhenchao.antlr.calculator;

public class IntegerCalculatorVisitor extends CalculatorBaseVisitor<Integer> {

    @Override
    public Integer visitMulDiv(CalculatorParser.MulDivContext ctx) {
        Integer left = visit(ctx.expr(0));
        Integer right = visit(ctx.expr(1));
        return CalculatorParser.MUL == ctx.op.getType() ? left * right : left / right;
    }

    @Override
    public Integer visitAddSub(CalculatorParser.AddSubContext ctx) {
        Integer left = visit(ctx.expr(0));
        Integer right = visit(ctx.expr(1));
        return CalculatorParser.ADD == ctx.op.getType() ? left + right : left - right;
    }

    @Override
    public Integer visitParens(CalculatorParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitNum(CalculatorParser.NumContext ctx) {
        return Integer.parseInt(ctx.NUM().getText());
    }

}
