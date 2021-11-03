package com.shamimsir.lab1;

import java.util.Scanner;

public class No12_FindThirdAngle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();

        System.out.println("Third Angle is: " + (180 - angle1 - angle2));
    }
}
