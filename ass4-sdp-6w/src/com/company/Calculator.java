package com.company;

public class Calculator {
    private final Function function;
    private final Expression expressionClass;

    public Calculator() {
        function = new Function();
        expressionClass = new Expression();
    }

    void start(String expression) {
        if (expressionClass.checkExpression(expression)) {
            //  System.out.println("Result: " + calculate(expression));
           calculate(expression);
        }

    }
    void end(){
        System.out.println("the end");
    }

    void calculate(String expression) {
        if (expression.contains("/") && expression.contains("*")) {
            if (expression.indexOf('/') < expression.indexOf('*')) {
                System.out.println(function.divide(expression, expression.indexOf('/')));
                calculate(function.divide(expression, expression.indexOf('/')));
            } else {
                System.out.println(function.multiple(expression, expression.indexOf('*')));
                calculate(function.multiple(expression, expression.indexOf('*')));
            }
        } else if (expression.contains("/") && !expression.contains("*")) {
            System.out.println(function.divide(expression, expression.indexOf('/')));
            calculate(function.divide(expression, expression.indexOf('/')));

        } else if (expression.contains("*") && !expression.contains("/")) {
            System.out.println(function.multiple(expression, expression.indexOf('*')));
            calculate(function.multiple(expression, expression.indexOf('*')));

        } else if (expression.contains("-") && expression.contains("+")) {
            if (expression.indexOf('-') < expression.indexOf('+')) {
                System.out.println(function.minus(expression, expression.indexOf('-')));
                calculate(function.minus(expression, expression.indexOf('-')));
            } else {
                System.out.println(function.plus(expression, expression.indexOf('+')));
                calculate(function.plus(expression, expression.indexOf('+')));
            }

        } else if (expression.contains("-") && !expression.contains("+")) {
            System.out.println(function.minus(expression, expression.indexOf('-')));
            calculate(function.minus(expression, expression.indexOf('-')));

        } else if (expression.contains("+") && !expression.contains("-")) {
            System.out.println(function.plus(expression, expression.indexOf('+')));
            calculate(function.plus(expression, expression.indexOf('+')));
        }

    }
}