package com.shamimsir.lab3;

import java.util.Scanner;

public class No12_PrintFindFactorial {
    private static long factorial(int num) {
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        System.out.println(number + "'s Factorial is: " +factorial(number));
    }
}
