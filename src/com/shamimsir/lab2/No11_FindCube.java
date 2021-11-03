package com.shamimsir.lab2;

import java.util.Scanner;

public class No11_FindCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number + " Cube is: " + (int) Math.pow(number, 3));
    }
}
