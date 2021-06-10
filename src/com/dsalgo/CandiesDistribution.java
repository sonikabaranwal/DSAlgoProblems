package com.dsalgo;

import java.util.Scanner;
/* Sara has 2 brothers which initially have X and Y candies with them. Sara has also N candies with her.
 Sara wants to distribute her candies to his brothers such that both the brother have an equal amount of candies at last.
 Given the values of X, Y, and N, your task is to tell Sara whether she can distribute in such a way or not.

 Return 1 if it is possible else return 0.
 */

public class CandiesDistribution {
    public static void main(String[] args) {

        System.out.println("Enter the values of N, X and Y");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int X = input.nextInt();
        int Y = input.nextInt();
        System.out.println("Can she distribute the candies? \n" + isDistributionPossible(N, X, Y));
        System.out.println("============================\n");
    }

    static int isDistributionPossible(int N, int X, int Y) {
        if ((N + X + Y) % 2 == 0 && (N >= (X - Y) || N >= (Y - X))) {
            return 1;
        } else {
            return 0;
        }
    }
}
