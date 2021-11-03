package com.shamimsir.lab2;

import java.util.Scanner;

public class No1_TriangleValidityUsingSides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b > c && b + c > a && c + a > b)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
