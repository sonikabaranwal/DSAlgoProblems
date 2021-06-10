package com.dsalgo;
/* There are N balloons numbered from 1 to N. Every balloon has another integer value Arr[i] assigned to it where i varies from 1 to N, and i represents the number of balloon.

A balloon at an odd position (i = 1, 3, 5. ) is happy if Arr[i] is odd.
A balloon at an even position (i = 2, 4, 6. ) is happy if Arr[i] is even.

Find the number of happy balloons.

Input
The first line of the input contains a single integer N.
The second line of the input contains N singly spaced integers, Arr[1], Arr[2], Arr[3],. , Arr[N].

Constraints
1 <= N <= 200000
1 <= Arr[i] <= 1000000

Output
Output a single integer, the number of happy balloons.

Example:
Sample Input
5
1 3 4 6 7
Sample Output
3
Explanation
Happy balloons are balloons numbered 1, 4, 5.*/

import java.util.Scanner;

public class HappyBalloons {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = obj.nextInt();
        }
        System.out.println(getHappyBalloons(N, array));
    }

    static int getHappyBalloons(int P, int[] arr) {
        int count = 0;
        for (int i = 0; i < P; i++) {
            if (((i + 1) % 2 == 0 && arr[i] % 2 == 0) || ((i + 1) % 2 != 0 && arr[i] % 2 != 0)) {
                count++;
            }
        }
        return count;
    }
}