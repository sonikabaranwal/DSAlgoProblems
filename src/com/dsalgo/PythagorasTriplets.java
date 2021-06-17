package com.dsalgo;

/* Given three numbers. Tell whether they form a Pythagoras triplet or not.
Given A , B and C. Three integers form Pythagoras triplet if sum of square of two is equal to square of third.

Input:
The first line of the input contains three space separated integers A, B and C.

Constraints:
1 <= A,B,C <= 100

Output:
The output should contain "YES" if they form a triplet else you should print "NO" without quotes.

Example:
Sample Input
4 3 5
Sample Output
YES                       */

import java.util.Scanner;

public class PythagorasTriplets {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        System.out.println(isPythagorasTriplet(A, B, C));
    }

    static String isPythagorasTriplet(int A, int B, int C) {
        if (A > B && A > C) {
            if (A == Math.sqrt(B * B + C * C)) {
                return "YES";
            }
            return "NO";
        } else if (B > C) {
            if (B == Math.sqrt(A * A + C * C)) {
                return "YES";
            }
            return "NO";
        } else {
            if (C == Math.sqrt(A * A + B * B)) {
                return "YES";
            }
            return "NO";
        }
    }
}
