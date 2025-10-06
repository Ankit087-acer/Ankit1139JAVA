package Com.week11.day41;
import java.util.*;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = S.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = S.nextInt();
        }

      System.out.print("The previous array is: ");
      for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
      }
      System.out.println();
        System.out.print("Enter element to remove: ");
        int x = S.nextInt();
        int newLength = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != x) {  
                arr[newLength] = arr[i];
                newLength++;
            }
        }

        System.out.print("Array after removing element is " );
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }

        S.close();
    }
}
