package com.shamimsir.lab1;

import java.util.Scanner;

public class No9_TemperatureConvert {
    public static void main(String[] args) {

        double fahrenheit = new Scanner(System.in).nextDouble();

        // Celsius to Fahrenheit
        double celsius = (fahrenheit - 32) / 9 * 5.0;
        System.out.printf("Temperature: %f Celsius", celsius);

    }
}