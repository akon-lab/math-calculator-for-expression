package com.company;

public class Num {
    Integer getInt1(String expression, int operId) {
        expression = expression.substring(0, operId);

        if (expression.lastIndexOf('+') > expression.lastIndexOf('-')) {
            return Integer.parseInt(expression.substring(expression.lastIndexOf('+')+1, operId  ));
        } else if (expression.lastIndexOf('+') < expression.lastIndexOf('-')) {
            return Integer.parseInt(expression.substring(expression.lastIndexOf('-') + 1, operId));
        } else {
            //if no operators , than expession contian num
            return Integer.parseInt(expression);
        }
    }

    Integer getInt2(String expression, int id) {
        expression = expression.substring(id+1);
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '/' || expression.charAt(i) == '*' || expression.charAt(i) == '-' || expression.charAt(i) == '+') {
                return Integer.parseInt(expression.substring(0, i));
            }
        }
        //if no operators , than expession contian num a+b*3+-0
        return Integer.parseInt(expression);
    }
}
