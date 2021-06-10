package com.dsalgo;

import java.util.Scanner;

/* Given an integer n, your task is to print a right angled triangle pattern of consecutive numbers of height n.

Input
The input contains a single integer n.

Constraint:
1 <= n <= 100

Example:
Sample Input:
5

Sample Output:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
public class PatternPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printPattern(n);
    }

    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}