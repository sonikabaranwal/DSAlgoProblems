package com.dsalgo.easy;
/* Given an array A of size N containing positive integers. Find maximum and minimum elements from the array.

Input
The first line of input contains an integer T, denoting the number of testcases.
The description of T testcases follows:
The first line of each testcase contains a single integer N denoting the size of array.
The second line contains N space-separated integers denoting the elements of the array.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
1 <= A[i] <= 10^7

Output
For each testcase you need to print the maximum and minimum element found separated by space.

Example:
Sample Input:
2
5
7 3 4 5 6
4
1 2 3 4
Sample Output:
7 3
4 1
*/

import java.util.Scanner;

public class MaxMinInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        while (T > 0) {
            T--;
            int N = input.nextInt();
            int[] A = new int[N];
            for (int j = 0; j < N; j++) {
                A[j] = input.nextInt();
            }
            System.out.print(getMax(N, A) + " ");
            System.out.println(getMin(N, A));
        }
    }

    static int getMax(int N, int[] A) {
        int max = A[0];
        for (int i = 1; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

    static int getMin(int N, int[] A) {
        int min = A[0];
        for (int i = 1; i < N; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        return min;
    }
}
