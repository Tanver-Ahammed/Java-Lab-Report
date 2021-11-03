package com.shamimsir.lab1;

import java.util.Scanner;

public class No6_CircleOperation {
    public static void main(String[] args) {
        double radius = new Scanner(System.in).nextDouble();

        System.out.printf("Diameter of Circle %.3f\n", (2 * radius));
        System.out.printf("Circumference of Circle %.3f\n", (2 * 3.1416 * radius));
        System.out.printf("Area of Circle %.3f\n", (3.1416 * radius * radius));

    }
}
