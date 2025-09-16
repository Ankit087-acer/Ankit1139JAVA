package week_11.day_41.Problems;

import java.util.Arrays;

public class RemoveOccurences {
    public static void main(String[] args) {
        int[] arr = {10, 20, 25, 30, 40};
            int n = arr.length;
              int remove = 25; 
              int j=0;
          for (int i = 0; i < n; i++) {
               if(arr[i]!=remove){
                arr[j]=arr[i];
                j++;
               }
           }
            int[] arr2=Arrays.copyOf(arr,j);
           System.out.println(Arrays.toString(arr2)); 
    }
}
