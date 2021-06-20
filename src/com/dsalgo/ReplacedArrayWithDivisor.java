package com.dsalgo;

/* You have an array Arr which may or may not be in strictly increasing order.
You want to make this array increasing but does not wish to change the position of any element.
So you came with an idea that you will replace an element with any of its divisors
 i.e you change an element X to M if X%M=0.

Your task is to tell whether the given array can be transformed to strictly increasing by performing the operation given above.

Input
First line of input contains the size of the array N.
Next line of input contains N space- separated integers depicting the values of the array Arr.

Constraints
1 <= N <= 100000
1 <= Arr[i] <= 100000

Output
Print "YES" if the array can be transformed in the strictly increasing order else print "NO".

Example:
Sample Input
5
1 2 16 16 16
Sample Output
YES                          */


import java.util.Scanner;

public class ReplacedArrayWithDivisor {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int Arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            Arr[i] = input.nextInt();
        }
        canBeReplaced(N, Arr);
    }

    public static void canBeReplaced(int N, int[] Arr){
    int divisor=2;
        for(int i=1;i<N-1;i++){
            while(Arr[i]%divisor!=0 && divisor<=Arr[i]){
                divisor++;
            }
            if(divisor>=Arr[i+1]){
                System.out.println("NO");
                return;
            }
            Arr[i]=divisor;
            divisor++;
        }
        System.out.println("YES");
    }
}
