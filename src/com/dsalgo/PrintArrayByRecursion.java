package com.dsalgo;
/* Given an array, you have to print the array using recursion.*/

public class PrintArrayByRecursion {

    public static void main(String[] args) {
        int[] a = {1, 5, 8, 6, 75, 9, 98, 100};
        Print(a, 0);
    }

    private static void Print(int[] a, int i) {
        if (i == a.length) {
            return;
        }
        System.out.print(a[i] + " ");
        Print(a, i + 1);
        System.out.print(a[i] + " ");
    }
}
