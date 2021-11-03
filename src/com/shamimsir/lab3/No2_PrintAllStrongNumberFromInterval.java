package com.shamimsir.lab3;

import java.util.Scanner;

public class No2_PrintAllStrongNumberFromInterval {
    private static boolean isStrongNumber(int num) {
        int[] factorial = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int a = temp % 10;
            sum += factorial[a];
            temp /= 10;
        }
        return (sum == num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if ( isStrongNumber(i))
            System.out.println(i);
        }
    }
}
