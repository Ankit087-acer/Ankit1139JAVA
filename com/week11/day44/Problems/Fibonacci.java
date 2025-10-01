package com.week11.day44.Problems;
// import java.util.*;
import java.util.Scanner;
public class Fibonacci {
    public static int fibonacci(int n){
            if(n==0){
                return 0;
            }
            else if(n==1){
                return 1;
            }
            return fibonacci(n-1)+fibonacci(n-2);
        }
    public static void main(String[] args) {
       int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=sc.nextInt();
        System.out.print("The fibonacci("+n+") is "+" "+fibonacci(n));
        sc.close();
    }
}
