package com.shamimsir.lab3;

import java.util.Scanner;

public class No13_PrintFindKthFibonacci {
    private static int kthFibonacci(int k) {
        int f1 = 0;
        int f2 = 1;
        int f3;
        if (k == 1)
            return f1;
        if (k == 2)
            return f2;
        int index = 2;
        for (int i = 0; i < k - 2; i++) {
            ++index;
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            if (index == k)
                return f3;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kth = scanner.nextInt();
        System.out.println(kthFibonacci(kth));
    }
}
