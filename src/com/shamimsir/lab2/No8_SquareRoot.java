package com.shamimsir.lab2;

import java.util.Scanner;

public class No8_SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        double sqrt = Math.sqrt(number);
        System.out.println(sqrt);
    }
}
