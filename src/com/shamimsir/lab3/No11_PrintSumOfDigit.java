package com.shamimsir.lab3;

import java.util.Scanner;

public class No11_PrintSumOfDigit {
    private static int sumOfDigit(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        System.out.println("Sum Of The Digit: " + sumOfDigit(number));
    }
}
