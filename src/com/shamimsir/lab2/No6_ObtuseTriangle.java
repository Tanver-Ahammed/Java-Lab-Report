package com.shamimsir.lab2;

import java.util.Scanner;

public class No6_ObtuseTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a + b + c == 180) && (a > 90 || b > 90 || c > 90))
            System.out.println("Obtuse Triangle");
        else
            System.out.println("No Obtuse Triangle");
    }
}
