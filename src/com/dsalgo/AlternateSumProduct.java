package com.dsalgo;
/* Given an array Arr of N integers.
Print the sum of elements present at even places and print the product of elements present at the odd places.

Input
The first line of input contains a single integer N.
The next line of input contains N space separated integers depicting the values of the array.

Constraints:-
1 <= N <= 50

Output
Print the sum of elements present at even places and print the product of elements present at the odd places separated by a space.

Example:
Sample Input
5
1 2 3 4 5
Sample Output
6 15
Explanation
Sum = 2 + 4
Product = 1*3*5                       */

import java.util.Scanner;

public class AlternateSumProduct {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] Arr = new int[N];
        for (int i = 0; i < N; i++) {
            Arr[i] = input.nextInt();
        }
        System.out.print(getSum(N, Arr) + " ");
        System.out.print(getProduct(N, Arr));
    }

    private static int getProduct(int n, int[] arr) {
        int product = 1;
        for (int j = 0; j < n; j = j + 2) {
            product = product * arr[j];
        }
        return product;
    }

    private static int getSum(int n, int[] arr) {
        int sum = 0;
        for (int i = 1; i < n; i = i + 2) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
