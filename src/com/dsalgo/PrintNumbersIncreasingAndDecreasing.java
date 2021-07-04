package com.dsalgo;

// Given the value of n.
// You have to print the n numbers in increasing as well as decreasing order in different line.
//Use recursive methods.

import java.util.Scanner;

public class PrintNumbersIncreasingAndDecreasing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        printIncreasing(n);
        System.out.println();
        printDecreasing(n);
    }

    public static void printDecreasing(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }

    public static void printIncreasing(int n) {
        if (n == 0)
            return;
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }
}
