package com.shamimsir.lab1;

import java.util.Scanner;

public class No13_TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        System.out.printf("Area of Triangle is %.3f unit\n", (.5 * base * height));

    }
}
