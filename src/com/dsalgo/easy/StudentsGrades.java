package com.dsalgo.easy;
/* Given marks of a student in 5 subjects(any).
You need to find the grade he/she would get on the basis of percentage obtained. Grades computed are as follows:

If the percentage of marks is >= 80 then print Grade ‘A’
If the percentage is <80 and >=60 then print Grade ‘B’
If the percentage is <60 and >=40 then print Grade ‘C’
else print Grade ‘D’

Input
Input contains marks of five subjects.

Constraints:
1 <= marks <= 100

Output
You need to return the grade obtained by him/her.

Example:
Sample Input
75 78 86 90 92
Sample Output
A                   */

import java.util.Scanner;

public class StudentsGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = input.nextInt();
        }
        System.out.println(getGrades(A));
    }

    static char getGrades(int[] A) {
        int percentage = (A[0] + A[1] + A[2] + A[3] + A[4]) / 5;
        if (percentage >= 80) {
            return 'A';
        } else if (percentage >= 60) {
            return 'B';
        } else if (percentage >= 40) {
            return 'C';
        } else {
            return 'D';
        }
    }
}
