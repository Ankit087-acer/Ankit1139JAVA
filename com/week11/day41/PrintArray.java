package com.week11.day41;
import java.util.*;
public class PrintArray {
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
           System.out.print(arr[i]+" ");
      }
      S.close();
    }
}
