package com.dsalgo.easy;
/* Given a number N, you need to check whether the given number is Palindrome or not.
 A number is said to be Palindrome when it reads the same from backward as forward.

Input
Input contains a integer N.

Constraints:
1 <= N <= 9999

Output
You need to return "true" if the number is palindrome otherwise "false".

Example:
Sample Input
121
Sample Output
true                       */

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println(isPalindrome(N));
    }

    static boolean isPalindrome(int N) {
        int number = N;
        int R;
        int reverse = 0;
        while (N != 0) {
            R = N % 10;
            reverse = (reverse * 10) + R;
            N = N / 10;
        }
        return reverse == number;
    }
}
