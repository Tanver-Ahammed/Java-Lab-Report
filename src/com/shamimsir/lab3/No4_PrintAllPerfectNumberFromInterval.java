package com.shamimsir.lab3;

import java.util.Scanner;

public class No4_PrintAllPerfectNumberFromInterval {
    private static boolean isPerfectNumber(long num) {
        long temp = num;
        long sum = 0;
        for (int i = 1; i <= temp / 2; i++) {
            if (temp % i == 0) {
                sum = sum + i;
            }
        }
        return (sum == num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if ( isPerfectNumber(i))
                System.out.println(i);
        }
    }
}
