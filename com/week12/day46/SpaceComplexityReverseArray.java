package Com.week12.day46;
import java.util.*;
public class SpaceComplexityReverseArray {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n=S.nextInt();
        System.out.print("Enter the Elements of the Array: ");
        int arr[]=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=S.nextInt(); // The Space Complexity is O(1)
        }
        for(int i=0;i<n/2;i++){
            int start=i;
            int end=n-i-1;
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        System.out.print("The Reversed array is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        S.close();
    }
}
