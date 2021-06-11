package com.dsalgo;
/*  Given a string , you need to check whether the given string is Palindrome or not.
 A string is said to be Palindrome when it reads the same from backward as forward.

Input
Input contains a String.

Output
You need to return "true" if the string is palindrome otherwise "false".

Example:
Sample Input 1
eye
Sample Output 1
true

Sample Input 2
54789
Sample Output 2
false         */

import java.util.Scanner;

public class PalindromeString {
    public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        String str = input.nextLine();
        boolean isPalindrome=true;

        for(int i=0; i<str.length()/2; i++){
            char begin =str.charAt(i);
            char end =str.charAt(str.length()-1-i);
            if (begin!= end){
                isPalindrome=false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
