package com.dsalgo;
/* You are given two numbers n and p. You need to find n raised to the power p.

Input
Take input for testcases in first line. For each testcase,
take input for n and p in different line separated with space.

Constraints:
1 <= T <= 10
1 <= n, p <= 9

Output
Return n^p.

Example
Sample Input:
3
2 3
9 9
2 9

Sample Output:
8
387420489
512               */

import java.util.Scanner;

public class ComputePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int p = input.nextInt();
            System.out.println(calculatePower(n, p));
        }
    }

    static int calculatePower(int n, int p) {

        if (n == 1 || p == 0) {
            return 1;
        }
        return n * calculatePower(n, p - 1);
    }
}
