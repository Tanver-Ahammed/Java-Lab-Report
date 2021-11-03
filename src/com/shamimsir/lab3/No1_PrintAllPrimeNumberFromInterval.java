package com.shamimsir.lab3;

import java.util.Scanner;

public class No1_PrintAllPrimeNumberFromInterval {
    private static boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }
}
