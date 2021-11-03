package com.shamimsir.lab2;

import java.util.Scanner;

public class No14_EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0)
            System.out.println(number+" is EVEN Number");
        else
            System.out.println(number+" is ODD Number");
    }
}
