package com.shamimsir.lab1;

import java.util.Scanner;

public class No10_DayConversion {
    public static void main(String[] args) {

        int days = new Scanner(System.in).nextInt();

        int years, weeks;

        years = days / 365;
        days = days % 365;
        weeks = days / 7;
        days = days % 7;

        System.out.println("Years: " + years);
        System.out.println("week: " + weeks);
        System.out.println("days: " + days);

    }
}
