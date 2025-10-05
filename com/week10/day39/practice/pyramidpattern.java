package com.week10.day39.practice;
import java.util.Scanner;
public class pyramidpattern {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n=S.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         S.close();
    }
   
}
