package com.dsalgo.easy;

import java.util.Scanner;

/* Given an array A[] of size N, containing positive integers.
 You need to print the sum and mean (floor value) of given numbers.

Input
Input contain the Array and the integer N.

Constraints:-
1 <= N <= 100
1 <= A[i] <= 100

Output
Print the Sum and the Mean of the array separated by a space.

Example:
Sample Input
5
1 2 19 28 5
Sample Output
55 11                                        */

public class SumAndMean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
        }
        getSumAndMean(A, N);
    }

    static void getSumAndMean(int[] arr, int N) {
        int sum = 0;
        int mean = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + arr[i];
            mean = sum / N;
        }
        System.out.println(sum + " " + mean);
    }
}
