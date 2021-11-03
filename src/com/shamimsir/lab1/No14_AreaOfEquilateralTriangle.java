package com.shamimsir.lab1;

import java.util.Scanner;

public class No14_AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        double area = (Math.sqrt(3) / 4 * a * a);

        System.out.printf("The Area of Equilateral Triangle is %.3f unit.\n", area);

    }
}
