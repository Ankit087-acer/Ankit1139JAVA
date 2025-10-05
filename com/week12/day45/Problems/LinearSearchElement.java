package com.week12.day45.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchElement {
    public  static int linearsearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n=S.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the Elements of the Array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=S.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the Element to Search: ");
        int target=S.nextInt();
        int result=linearsearch(arr, target);   // It is Slower  because the time Complexity is O(n)
        if(result==-1){
            System.out.println("Not found ");
        }
        else{
            System.out.println("Found at "+result);
        }
        S.close();
    }
}
