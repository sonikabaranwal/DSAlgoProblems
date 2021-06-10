package com.dsalgo;
/* Given a number N for each i (1 < = i < = N), you have to print the number except :-
For each i which is multiple of 3, print "Sun" instead of the number.
For each i which is multiple of 5, print "Shine" instead of the number.
For i which is multiple of both 3 and 5, print "SunShine" instead of the number.

Input
Input contains a single integer N.

Constraints:-
1 < = N < = 1000

Output
Print N space separated number or Sun Shine according to the condition.

Example:
Sample Input
5
Sample Output
1 2 Sun 4 Shine */

import java.util.Scanner;

public class SunShine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if (N > 0 && N <= 1000) {
            for (int i = 1; i <= N; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("SunShine" + " ");
                } else if (i % 3 == 0) {
                    System.out.print("Sun" + " ");
                } else if (i % 5 == 0) {
                    System.out.print("Shine" + " ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
