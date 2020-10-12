package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter expression:");
        System.out.println("Без пробелов!!!!!!!!!!!!!");

        calculator.start(sc.nextLine().trim());
        calculator.end();
    }

}
