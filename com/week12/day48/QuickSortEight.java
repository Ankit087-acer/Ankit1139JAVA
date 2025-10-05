package com.week12.day48;
import java.util.*;
public class QuickSortEight {
     public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    public static void quicksort(int arr[],int low,int high){
            if(low<high){
                int pidx=partition(arr,low,high);
                quicksort(arr,low,pidx-1);
            }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Size of the array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the Elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        quicksort(arr, 0, n-1);
        System.out.print("The sorted array is: ");
        printarray(arr);
        s.close();
    }
}
