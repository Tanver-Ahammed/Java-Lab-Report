package com.shamimsir.lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class No6_PrintAllEvenOddNumberFromInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0)
                even.add(i);
            else
                odd.add(i);
        }

        System.out.println("Even Numbers:\n" + even);
        System.out.println("\nOdd Numbers:\n" + odd);

    }
}
