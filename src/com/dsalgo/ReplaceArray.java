package com.dsalgo;
/* Given an array of N elements.
Your task is to update every element with multiplication of previous and next elements with following exceptions:
a) First element is replaced by multiplication of first and second.
b) Last element is replaced by multiplication of last and second last.

See example for more clarity

Input
First line of input contains the size of array N.
Next line contains N space separated integers denoting values of array.

Constraints:-
2 < = N < = 100000
1 < = arr[i] < = 100000

Output
Print the modified array

Example:
Sample Input
5
2 3 4 5 6
Sample Output
6 8 15 24 30
Explanation
{2*3, 2*4, 3*5, 4*6, 5*6}                 */

import java.util.Scanner;

public class ReplaceArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
        }
        int[] res = getNewArray(N, A);
        for (int i = 0; i < N; i++) {
            System.out.print(res[i] + " ");
        }
    }

    static int[] getNewArray(int N, int[] A) {
        int[] res = new int[N];
        res[0] = A[0] * A[1];
        res[N - 1] = A[N - 2] * A[N - 1];
        for (int i = 1; i <= N - 2; i++) {
            res[i] = A[i - 1] * A[i + 1];
        }
        return res;
    }
}