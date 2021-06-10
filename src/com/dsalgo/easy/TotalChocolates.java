package com.dsalgo.easy;

import java.util.Scanner;
/* It's Erica's 1st birthday and everyone is gifting her chocolates.
There are N guests invited, the ith guest gives Erica A[i] chocolates.

Find the total number of chocolates that Erica receives.

Input
The first line of the input contains an integer N, the number of guests.
The second line of the input contains N integers A[1], A[2],. , A[N].

Constraints
1 <= N <= 100
1 <= A[i] <= 100

Output
Output a single integer, the total number of chocolates that Erica receives.

Example:
Sample Input
5
1 2 4 3 2
Sample Output
12
Explanation: Erica receives a total of 1+2+4+3+2 = 12 chocolates. */

public class TotalChocolates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
        }
        System.out.println(getTotalChoc(N, A));
    }

    static int getTotalChoc(int N, int[] A) {
        int total = 0;
        for (int i = 0; i < N; i++) {
            total = total + A[i];
        }
        return total;
    }
}
