package com.dsalgo;
/* Given an array of N integers, your task is to calculate the sum of all the odd integers present in the array.

Input
First line of input contains a single integer N. The next line contains the N space separated integers.

Constraints:-
1 < = N < = 1000
1 < = Arr[i] < = 10000

Output
Print the sum of all the odd integers present in the array.

Example:
Sample Input
3 1 6 8
Sample Output
4                               */

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
        }
        System.out.println(getSumOfOdd(N, A));
    }

    static int getSumOfOdd(int N, int[] A) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] % 2 != 0) {
                sum = sum + A[i];
            }

        }
        return sum;
    }
}
