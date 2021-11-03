package com.shamimsir.lab1;

import java.util.Scanner;

public class No11_Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int result = (int) Math.pow(x, y);
        System.out.println(result);
    }
}
