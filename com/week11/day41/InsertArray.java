package Com.week11.day41;

import java.util.*;

public class InsertArray {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n=S.nextInt();
        int arr[]=new int[100];
        System.out.print("Enter the Elements of the Array: ");
        for(int i=0;i<n;i++){
               arr[i]=S.nextInt();
        }
        System.out.print("Enter the Element to insert: ");
        int ele=S.nextInt();
        System.out.print("Enter the Index in Which element has to be inserted: ");
        int pos=S.nextInt();
        for(int i=n;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=ele;
        n++;
        System.out.print("Array after insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        S.close();
    }
}
