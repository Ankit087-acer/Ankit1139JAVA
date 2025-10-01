package com.week10.day39.practice;
import java.util.Scanner;
public class Rectangularpattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of the Rows: ");
        int r=s.nextInt();
        System.out.print("Enter the number of the Columns: ");
        int c=s.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("* ");
            }
           System.out.println(); 
        }
        s.close();
    }
}
