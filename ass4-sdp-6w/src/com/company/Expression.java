package com.company;

public class Expression {
    public Expression() {
    }

    String pasteNewValue(String expression, Integer result, int begin, int end) {
        return expression.replace(expression.substring(begin, end), result.toString());
    }

    boolean checkExpression(String expression) {
        if (expression.isEmpty()) {

            System.out.println("Expression is empty");
            return false;
        } else {
            return true;
        }
    }
}
