package com.dsalgo;
/* RDX is playing a game with N people in his illegal house.
Also given a number k, which indicates that after skipping k-1 persons,
the kth person will be thrown outside from the window in a valley.
Uday Shetty is one of them and he has to choose the safe place in the circle ,
so that when he performs these operations starting from 1st place in the circle, he will be the lone survivor.
Uday is confused as to where to stand. Can you help him?

Input
Take input for testcases in first line. For each testcase,
take input for n and k in different line separated with space.

Constraints:
1 <= T <= 100
1 <= k, n <= 20

Output
Return the safe position where Uday can stand in a circle satisfying above condition.

Example
Sample Input:
2
3 2
5 3

Sample Output:
3
4

Explanation:
Test case 1: There are 3 people so skipping 1 person i.e 1st person,2nd person will be killed.
In next step 3rd person will be skipped and 1st person will be killed. Thus the safe position is 3.
Test case 2: 2 people i.e 1 and 2 are skipped and person 3 will be killed.
In next step 4 and 5 will be skipped and 1st person will be killed.
In next step 2 and 4 will be skipped and 5th person will be killed .
In next step first 2 will be skipped then 4 will be skipped and so coming back to 2 therefore person 2 will be killed.
Thus the safe position is 4.
*/

import java.util.Scanner;

public class WelcomeMovie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            System.out.println(safePosition(n, k));
        }
    }

    public static int safePosition(int n, int k) {
        return solveProblem(n, k) + 1;
    }

    public static int solveProblem(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (solveProblem(n - 1, k) + k) % n;
    }
}
