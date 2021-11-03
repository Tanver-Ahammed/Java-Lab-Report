package com.shamimsir.lab1;

import java.util.Scanner;

public class No5_RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();

        System.out.printf("Area Of Rectangle %.3f", (length * breadth));
    }
}
