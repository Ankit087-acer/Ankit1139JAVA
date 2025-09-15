package week_11.day_41.Problems;

import java.util.Arrays;

public class InsertArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
       int n=arr.length;
       int value=45,pos=3;
       int[] newArr=new int[n+1];
       for(int i=0;i<pos;i++){
        newArr[i]=arr[i];
       }
       newArr[pos]=value;
       for(int i=pos;i<n;i++){
            newArr[i+1] = arr[i];
        }

        System.out.println(Arrays.toString(newArr));
    }
}
