package com.shamimsir.lab3;

import java.util.Scanner;

public class No8_PrintEvenOddSumFromInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long evenSum = 0;
        long oddSum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0)
                evenSum += i;
            else
                oddSum += i;
        }

        System.out.println("From " + a + " to " + b + " Even sum is: " + evenSum);
        System.out.println("From " + a + " to " + b + " Odd sum is: " + oddSum);
    }
}
