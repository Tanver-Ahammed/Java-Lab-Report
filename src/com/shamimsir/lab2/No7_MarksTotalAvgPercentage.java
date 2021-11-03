package com.shamimsir.lab2;

import java.util.Scanner;

public class No7_MarksTotalAvgPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] subject = new int[5];

        int total = 0;
        for (int i = 0; i < subject.length; i++) {
            subject[i] = scanner.nextInt();
            total += subject[i];
        }

        double average = (double) total / 5;

        System.out.println("Total: " + total + "\nAverage: " + average + "\nPercentage: " + average + " %");
    }
}
