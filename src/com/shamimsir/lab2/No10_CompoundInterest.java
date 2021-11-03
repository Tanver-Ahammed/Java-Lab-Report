package com.shamimsir.lab2;

import java.util.Scanner;

public class No10_CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p, r, n, t;
        p = scanner.nextDouble();
        r = scanner.nextDouble();
        t = scanner.nextDouble();
        n = scanner.nextDouble();

        r = r * .01;

        double amount = p * Math.pow(1 + (r / n), n * t);
        double interest = amount - p;

        System.out.printf("Compound Interest is %.2f", interest);
    }
}
