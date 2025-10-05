package com.week10.day37;
import java.util.*;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a=S.nextInt();
        System.out.print("Enter the Second Number: ");
        int b=S.nextInt();
        System.out.println("Addition: "+(a+b)); //Addition
        System.out.println("Subtraction: "+(a-b)); //Subtraction
        System.out.println("Multiplication: "+(a*b));  //Multiplication
        System.out.println("Division: "+(a/b));   //Division
        System.out.println("Remainder: "+(a%b));  //Remainder
        S.close();
    }
}
