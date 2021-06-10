package com.dsalgo.easy;
/* Given a calendar year, you need to check whether the year is leap or not.

Input
It is an integer value as year.

Output
You need to return "true" if the year is a leap year otherwise "false".

Example:
Sample Input
2021
Sample Output
false             */

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println("Enter the calender year which is to be checked for leap year.");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println("Is the year " + year + " a leap year? \n" + isLeapYear(year));
    }

    static boolean isLeapYear(int year) {

        if (year == 0 || year < 0) {
            return false;
        }
        boolean isleap = false;
        if (year > 0) {
            if (year % 400 == 0) {
                isleap = true;
            } else if (year % 100 == 0) {
                isleap = false;
            } else if (year % 4 == 0) {
                isleap = true;
            }
        }
        return isleap;

    }
}