package com.shamimsir.lab3;

import java.util.Scanner;

public class No7_PrintSumFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("1 to " + number + " sum is: " + sum);
    }
}
