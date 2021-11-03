package com.shamimsir.lab2;

import java.util.Scanner;

public class No12_CircleFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double diameter = 2 * radius;
        double circumference = diameter * Math.PI;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);

        System.out.printf("The circle Diameter %.2f unit,\nCircumference %.2f unit and\nArea: %.2f unit.", diameter, circumference, areaOfCircle);


    }
}
