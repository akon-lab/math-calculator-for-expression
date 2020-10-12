package com.company;

public class Function {
    private final Num num;
    private final Expression expressionClass;

    public Function() {
        num = new Num();
        expressionClass = new Expression();
    }

    String divide(String expression, int id) {
        Integer fisrt, second;
        fisrt = num.getInt1(expression, id);
        second = num.getInt2(expression, id);

        return expressionClass.pasteNewValue(expression, fisrt / second, id - fisrt.toString().length(), id + second.toString().length()+1);
    }

    String multiple(String expression, int id) {
        Integer fisrt, second;
        fisrt = num.getInt1(expression, id);
        second = num.getInt2(expression, id);

        return expressionClass.pasteNewValue(expression, fisrt * second, id - fisrt.toString().length(), id + second.toString().length()+1);
    }

    String plus(String expression, int id) {
        Integer fisrt, second;
        fisrt = num.getInt1(expression, id);
        second = num.getInt2(expression, id);

        return expressionClass.pasteNewValue(expression, fisrt + second, id - fisrt.toString().length(), id + second.toString().length()+1);
    }

    String minus(String expression, int id) {
        Integer fisrt, second;
        fisrt = num.getInt1(expression, id);
        second = num.getInt2(expression, id);

        return expressionClass.pasteNewValue(expression, fisrt - second, id - fisrt.toString().length(), id + second.toString().length()+1);
    }
}
