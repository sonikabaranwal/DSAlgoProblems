package com.dsalgo;
/* Given an integer N, find the Nth number in the fibonacci series. Consider 0 and 1 to be the seed values.

In a fibonacci series, each number ( Fibonacci number ) is the sum of the two preceding numbers.
The series with 0 and 1 as seed values will go like -
0, 1, 1, 2, 3, 5.....

Input:
Input is an integer N.

Constraints:
1 ≤ T ≤ 10
1 ≤ N ≤ 30

Output
Return the Nth Fibonacci number.

Example:
Sample Input
2
3
5
Sample Output
2
5              */

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long n= in.nextLong();
            System.out.println(Fibonacci(n));
        }


    static long Fibonacci(long n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
