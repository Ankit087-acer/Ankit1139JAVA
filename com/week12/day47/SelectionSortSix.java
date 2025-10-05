package com.week12.day47;
import java.util.*;
public class SelectionSortSix {
    public static void SelectionSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int small=i;
            for(int j=i+1;j<n;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[small];
            arr[small]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n=S.nextInt();
        System.out.print("Enter the Elements of the Array: ");
        int arr[]=new int[100];
        for(int i=0;i<n;i++){
                 arr[i]=S.nextInt();
        }
        System.out.print("The Unsorted Array is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        SelectionSort(arr, n);
        System.out.println();
        System.out.print("The Array after Selection Sort is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        S.close();
    }
}
