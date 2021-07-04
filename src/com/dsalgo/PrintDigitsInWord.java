package com.dsalgo;
/* Given a natural number N, your task is to print the digits of the number as shown in the example.

Input
Take an integer N as an input.

Constraints:-
1 <= N <= 10000000

Output
Print the digits of the number as shown in the example.
Note:- Print all digits in lowercase English letters.

Example
Sample Input:-
1024

Sample Output:-
one zero two four                 */

import java.util.Scanner;

public class PrintDigitsInWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        getDigits(n);
    }

    static void getDigits(int N) {
        int r;
        if (N == 0) {
            return;
        }
        r = N % 10;
        getDigits(N / 10);
        System.out.print(digitInWord(r) + " ");
    }

    public static String digitInWord(int n) {
        switch (n) {

            case 1:
                return "one";

            case 2:
                return "two";

            case 3:
                return "three";

            case 4:
                return "four";

            case 5:
                return "five";

            case 6:
                return "six";

            case 7:
                return "seven";

            case 8:
                return "eight";

            case 9:
                return "nine";

            default:
                return "zero";
        }
    }
}