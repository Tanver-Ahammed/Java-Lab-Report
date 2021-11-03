package com.shamimsir.lab1;

import java.util.Scanner;

public class No3_ArithmeticOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Summation: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiply: " + (a * b));
        System.out.println("Division: " + (a / b * 1.0));
    }
}
