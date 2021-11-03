package com.shamimsir.lab3;

import java.util.Scanner;

public class No9_PrintReverseFromInterval {
    private static int isReverse(int num) {
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int a = temp % 10;
            sum = sum * 10 + a;
            temp /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.println(isReverse(i));
        }

    }
}
