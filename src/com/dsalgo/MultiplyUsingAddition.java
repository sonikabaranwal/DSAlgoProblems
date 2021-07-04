package com.dsalgo;
/* Given two numbers m and n, multiply them using only "addition" operations.

Input
Take input for testcases in first line. For each testcase,
take input for m and n in different line separated with space.

Constraints:
1 ≤ T ≤ 100
0 ≤ M, N ≤ 100

Output
Return the product of N and M.

Example
Sample Input
2
2 3
3 4

Sample Output
6
12                       */

import java.util.Scanner;

public class MultiplyUsingAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int m = input.nextInt();
            int n = input.nextInt();
            System.out.println(getProduct(m, n));
        }
    }

    static int getProduct(int M, int N) {
        if (N == 0 || M == 0) {
            return 0;
        }
        return M + getProduct(M, N - 1);
    }
}