package com.week11.day44.Problems;

import java.util.Scanner;
public class Sum {
    public static int sum(int n){
            if(n==0){
               return 0;
            }
           else if(n==1){
            return 1;
           }
           return n+sum(n-1);
        }
    public static void main(String[] args) {
       int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=sc.nextInt();
        System.out.print("The sum of the numbers upto the "+n+" "+"is"+" "+sum(n));
        sc.close();
    }
}