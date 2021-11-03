package com.shamimsir.lab1;

import java.util.Scanner;

public class No7_LengthConvert {
    public static void main(String[] args) {
        double length = new Scanner(System.in).nextDouble();

        double meter = length / 100.0;
        double km = meter / 1000.0;

        System.out.printf("Length %.2f meter\n", meter);
        System.out.printf("Length %.2f km", km);
    }
}
