package com.shamimsir.lab2;

import java.util.Scanner;

public class No9_SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principle = scanner.nextDouble();
        double time = scanner.nextDouble();
        double rate = scanner.nextDouble();

        rate = rate * .01;

        double interest = principle * time * rate;

        System.out.printf("Interest: %.2f", interest);
    }
}
