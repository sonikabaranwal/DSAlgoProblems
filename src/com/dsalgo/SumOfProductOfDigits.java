package com.dsalgo;
/* You are given two numbers n1 and n2.
You need to find the sum of the products of their corresponding digits.
So, for a number n1= 6 and n2 = 34, you'll do (6*4)+(0*3) = 24.

Input
Take input for testcases in first line. For each testcase,
take input for n1 and n2 in different line separated with space.

Constraints:
1 <= T <= 100
0 <= n1, n2 <= 10^6

Output
Return the sum of product of corresponding digits of n1 and n2.

Example
Sample Input:
2
9 0
35 6798
Sample Output:
0
67
Explanation:-
For test 2:-
(8*5) + (9*3) + (7*0) + (6*0) = 67                         */

import java.util.Scanner;

public class SumOfProductOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            System.out.println(sumOfProductOfDigits(n1, n2));
        }
    }

    static int sumOfProductOfDigits(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            return 0;
        }
        return ((n1 % 10) * (n2 % 10) + sumOfProductOfDigits(n1 / 10, n2 / 10));
    }
}
