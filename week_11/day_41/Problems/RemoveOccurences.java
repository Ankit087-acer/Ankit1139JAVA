package week_11.day_41.Problems;

import java.util.Arrays;

public class RemoveOccurences {
    public static void main(String[] args) {
        int[] arr = {10, 20, 25, 30, 40};
            int n = 5;
              int pos = 2; 
          for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i+1]; 
           }
              n--; 
           System.out.println(Arrays.toString(arr)); 
    }
}
