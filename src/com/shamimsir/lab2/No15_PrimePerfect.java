package com.shamimsir.lab2;

import java.util.Scanner;

public class No15_PrimePerfect {
    private static boolean isPrime(long n) {
        if (n < 2)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    private static boolean isPerfect(long num) {
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
        long number = new Scanner(System.in).nextLong();
        if (isPrime(number))
            System.out.println(number + " is Prime Number.");
        else if (isPerfect(number))
            System.out.println(number + " is Perfect Number.");
        else
            System.out.println(number + " is not Prime or Perfect.");
    }
}
