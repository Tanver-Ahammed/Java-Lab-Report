package com.shamimsir.lab3;

import java.util.Scanner;

public class No3_PrintAllArmstrongNumberFromInterval {
    private static boolean isArmstrongNumber(int num) {
        int temp = num;
        double sum = 0;
        while (temp != 0) {
            int a = temp % 10;
            sum += Math.pow(a, 3);
            temp /= 10;
        }
        return (num == sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (isArmstrongNumber(i))
                System.out.println(i);
        }
    }
}
