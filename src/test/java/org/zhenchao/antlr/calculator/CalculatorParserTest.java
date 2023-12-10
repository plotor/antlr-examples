package org.zhenchao.antlr.calculator;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

public class CalculatorParserTest {

    @Test
    public void test() {
        // 构造词法解析器
        CalculatorLexer lexer = new CalculatorLexer(CharStreams.fromString("2*2+10/5-1"));
        // 构造语法解析器
        CalculatorParser parser = new CalculatorParser(new CommonTokenStream(lexer));
        // 应用 expr 语法规则
        CalculatorParser.ExprContext context = parser.expr();
        System.out.println(context.toStringTree());
    }

}