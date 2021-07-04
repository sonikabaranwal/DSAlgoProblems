package com.dsalgo;

import java.util.Scanner;
/* Given an integer n.
 Find its divisors. Include 1 and the integer itself.

 Example:
 Input
 36
 Output
 1 2 3 4 6 9 12 18 36
 */

public class DivisorsOfNumber {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int squareRoot = (int)Math.sqrt(n);

            for(int i = 1; i <= squareRoot; i++) {
                if(n % i == 0) {
                    System.out.print(i + " ");
                }
            }
            for(int i = squareRoot - 1; i >= 1; i--) {
                if(n % i == 0) {
                    System.out.print((n / i) + " ");
                }
            }
            System.out.println();
        }
}