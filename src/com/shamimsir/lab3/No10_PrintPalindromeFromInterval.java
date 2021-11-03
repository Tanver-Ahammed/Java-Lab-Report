package com.shamimsir.lab3;

import java.util.Scanner;

public class No10_PrintPalindromeFromInterval {
    private static boolean isPalindrome(int num) {
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int a = temp % 10;
            sum = sum * 10 + a;
            temp /= 10;
        }
        return (sum == num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (isPalindrome(i))
                System.out.println(i);
        }
    }
}
