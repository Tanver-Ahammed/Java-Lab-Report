package com.shamimsir.lab3;

import java.util.Scanner;

public class No14_PrintFindGCDOfTwoNumbers {
    private static int gcd(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a == b)
            return a;
        if (a > b)
            return gcd(a - b, b);
        else
            return gcd(a, b - a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + " and " + b + " gcd is: " + gcd(a, b));
    }
}
