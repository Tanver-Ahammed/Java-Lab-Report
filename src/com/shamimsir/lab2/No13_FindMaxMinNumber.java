package com.shamimsir.lab2;

import java.util.Scanner;

public class No13_FindMaxMinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Maximum Number is: " + Math.max(a, b));
        System.out.println("Minimum Number is: " + Math.min(a, b));

    }
}
