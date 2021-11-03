package com.shamimsir.lab2;

import java.util.Scanner;

public class No3_CheckIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a == b || b == c || c == a) && (a + b > c && b + c > a && c + a > b))
            System.out.println("Isosceles Triangle");
        else
            System.out.println("No Isosceles Triangle");
    }
}
