package com.shamimsir.lab1;

import java.util.Scanner;

public class No8_TemperatureConvert {
    public static void main(String[] args) {

        double celsius = new Scanner(System.in).nextDouble();

        // Celsius to Fahrenheit

        double fahrenheit = celsius / 5 * 9.0 + 32;
        System.out.printf("Temperature: %f Fahrenheit", fahrenheit);
    }
}
