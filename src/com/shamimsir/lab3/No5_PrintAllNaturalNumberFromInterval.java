package com.shamimsir.lab3;

import java.util.Scanner;

public class No5_PrintAllNaturalNumberFromInterval {
    private static void naturalNumber1ToN(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        naturalNumber1ToN(a);
    }
}
