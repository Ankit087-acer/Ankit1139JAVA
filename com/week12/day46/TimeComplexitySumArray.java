package com.week12.day46;
import java.util.*;
public class TimeComplexitySumArray {
    public static int SumArray(int arr[]){
        int n=arr.length,sum=0;
        for(int i=0;i<n;i++){
             sum+=arr[i];     //Time Complexity of the Function is O(n)
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int arr[]=new int[100];
        System.out.print("Enter the Elements of the Array: ");
        int n=5;
        for(int i=0;i<n;i++){
            arr[i]=S.nextInt();
        }
        int Sum=SumArray(arr);
        System.out.println("The Sum of the Array elements is "+Sum);
        S.close();
    }
}
