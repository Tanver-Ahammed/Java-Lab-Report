package com.shamimsir.lab1;

import java.util.Scanner;

public class No4_RectangleParameter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        System.out.println("Perimeter: " + 2 * (length + breadth));
    }
}
