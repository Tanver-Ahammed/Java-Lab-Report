package com.shamimsir.lab1;

import java.util.Scanner;

public class No15_TriangleValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a > 0 && b > 0 && c > 0) && (a + b + c == 180))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
