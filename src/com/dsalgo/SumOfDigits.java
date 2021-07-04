package com.dsalgo;
/* Given a number N, find the sum of all the digits of the number.
Note: Use a recursive method to solve this problem.

Input
Take input for testcases in first line. For each testcase,
take input for n in different line.

Constraints:
1 ≤ T ≤ 100
0 ≤ N ≤ 1000000000

Output
Return sum of digits.

Example
Sample Input
2
25
28

Sample Output
7
10                           */

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long n = input.nextLong();
            System.out.println(getSum(n));
        }
    }

    static long getSum(long n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + getSum(n / 10);
    }
}
