package com.week10.day38;
import java.util.*;
public class SwitchMarks {
    public static void main(String[] args) {
       Scanner S = new Scanner(System.in);
        System.out.print("Enter the Marks (0-100): ");
        int marks = S.nextInt();
        int category = 0;

        if (marks >= 90 && marks <= 100) {
            category = 1; 
        } else if (marks >= 80 && marks < 90) {
            category = 2; 
        } else if (marks >= 70 && marks < 80) {
            category = 3; 
        } else if (marks >= 60 && marks < 70) {
            category = 4;
        } else if (marks >= 50 && marks < 60) {
            category = 5; 
        } else if (marks >= 0 && marks < 50) {
            category = 6; 
        } else {
            category = 7; 
        }
        switch (category) {
            case 1: {
                System.out.println("Excellent"); 
                break;
            }
            case 2: {
            System.out.println("Good"); 
            break;}
            case 3: {System.out.println("Average"); 
            break;}
            case 4: {
            System.out.println("Below Average"); 
            break;}
            case 5: 
        {System.out.println("Pass"); 
            break;}
            case 6: 
           {System.out.println("Fail"); 
            break;}
            default:{
            System.out.println("Invalid marks entered"); 
            break;}
        }
        S.close();
    }
    }

