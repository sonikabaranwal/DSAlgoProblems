package com.dsalgo;

import java.util.Scanner;

/* Given a number N, you need to check whether the given number is Armstrong number or not.
Now what is Armstrong number let us see below:
A number is said to Armstrong if it is equal to sum of cube of its digits.

Input
Input contains integer N.

Constraints:
1 <= N <= 10^4

Output
You need to return "true" if the given number is an Armstrong number otherwise "false"

Example:
Sample Input
153
Sample Output
true                       */
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println(isArmstrong(N));
    }

    static boolean isArmstrong(int N) {
        int R;
        int sum = 0;
        int number = N;
        while (N > 0) {
            R = N % 10;
            sum = sum + (int) Math.pow(R, 3);
            N = N / 10;
        }
        return sum == number;
    }
}
