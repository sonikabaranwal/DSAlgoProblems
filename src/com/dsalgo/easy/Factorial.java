package com.dsalgo.easy;

/* Given a number N,find the factorial of that number.
  Input
  Input contains an integer N.

  Constraints:
  1 <= N <= 20

  Output
  You need to return -1 if N is negative, 1 if N= 0 or 1 and factorial if N>0.

  Example:
  Sample Input
  6
  Sample Output
  720                      */

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
            System.out.println("Enter a number!");
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            System.out.println("Factorial of " + N + " is " + getFactorial(N));
            System.out.println("============================\n");

    }

    static long getFactorial(int N) {
        if (N < 0) {
            return -1;
        }
        if (N == 0 || N == 1) {
            return 1;
        }
        long factorial = N;
        for (long i = N - 1; i > 0; i--) {
            factorial = factorial * i;
        }

        return factorial;

    }

}