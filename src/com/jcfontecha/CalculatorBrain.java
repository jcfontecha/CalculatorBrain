package com.jcfontecha;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by JuanCa on 8/23/16.
 */

public class CalculatorBrain
{
    public enum TokenType
    {
        Operand,
        Variable,
        UnaryOperation,
        BinaryOperation,
        Constant
    }

    private static class Token<T>
    {
        private T value;
        private TokenType type;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public TokenType getType() {
            return type;
        }

        public void setType(TokenType type) {
            this.type = type;
        }

        public Token(T value, TokenType type)
        {
            this.value = value;
            this.type = type;
        }
    }

    public static class TokenFactory
    {
        public static Token<Double> newOperand(Double num)
        {
            return new Token<Double>(num, TokenType.Operand);
        }

        public static Token<String> newVariable(String var)
        {
            return new Token<String>(var, TokenType.Variable);
        }

        public static Token<Function<Double, Double>> newUnaryOperation(Function<Double, Double> fun)
        {
            return new Token<Function<Double, Double>>(fun, TokenType.UnaryOperation);
        }

        public static Token<BiFunction<Double, Double, Double>> newBinaryOperation(BiFunction<Double, Double, Double> fun)
        {
            return new Token<BiFunction<Double, Double, Double>>(fun, TokenType.BinaryOperation);
        }

        public static Token<Double> newConstant(Double c)
        {
            return new Token<Double>(c, TokenType.Constant);
        }
    }

    
}

