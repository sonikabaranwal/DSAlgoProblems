package com.dsalgo;
/* Given an integer N and M.
Check if N candies can be divided in M people such that each person gets equal number of candies.

Input
Input contains two integers N and M.

Constraints:
1 <= N <= 10^18
1 <= M <= 10^18

Output
Print "Yes" if it is possible otherwise "No".

Example:
Sample Input
12 6
Sample Output
Yes
Explanation: Give 2 candies to all. */

import java.util.Scanner;

public class DivideCandies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long N = input.nextLong();
        long M = input.nextLong();
        if (isDistributionPossible(N, M)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    static boolean isDistributionPossible(long N, long M) {
        if (N == 0 || M == 0)
            return false;
        return N % M == 0;
    }
}
