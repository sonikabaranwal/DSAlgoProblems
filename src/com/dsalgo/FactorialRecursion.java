package com.dsalgo;
/* Find factorial of a given number N using recursion.

Input
Take an integer n as input.

Constraints:
1 <= N <= 15

Output
Return the factorial of the given number.

Example
Sample Input:-
5
Sample Output:-
120                                  */

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.println(Factorial(n));
    }

    static long Factorial(long N) {
        if (N == 1) {
            return 1;
        }
        return N * Factorial(N - 1);
    }
}
