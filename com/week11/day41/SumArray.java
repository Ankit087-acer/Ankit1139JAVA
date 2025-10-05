package com.week11.day41;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
      System.out.print("Enter the Size of the Array: ");
      int n=S.nextInt();
      int arr[]=new int[100];
      System.out.print("Enter the Elements of the Array: ");
      for(int i=0;i<n;i++){
        arr[i]=S.nextInt();
      }
      System.out.print("The array is: ");
      for(int i=0;i<n;i++){
           System.out.println(arr[i]+" ");
      }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.print("The sum of array elements is "+sum);
        S.close();
    }
}
