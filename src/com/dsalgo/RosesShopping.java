package com.dsalgo;
/* You wish to buy roses of 3 different colors. You always buy roses in order, white, yellow, red.
So if you buy 7 roses, they will be "white, yellow, red, white, yellow, red, white".
You need to find the number of yellow roses that you will buy?

Input
The input contains a single integer, N, the number of roses that you will buy.

Constraints
1 <= N <= 1000

Output
Output a single integer, the number of yellow roses.

Example:
Sample Input
8
Sample Output
3
Explanation
8 flowers will be white, yellow, red, white, yellow, red, white, yellow.
So number of yellow flower is 3.    */

import java.util.Scanner;

public class RosesShopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        System.out.println(getYellowFlowers(N));
    }

    static int getYellowFlowers(int N) {
        int count = 0;
        for (int i = 2; i <= N; i = i + 3) {
            count++;
        }
        return count;
    }
}
