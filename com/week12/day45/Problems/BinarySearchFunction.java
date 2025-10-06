package Com.week12.day45.Problems;
import java.util.*;
public class BinarySearchFunction {
   public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
              }
           }
       }
     public  static int binarysearch(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+(high-low))/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
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
        System.out.print("Enter the Element to Search: ");
        int target=S.nextInt();
        bubblesort(arr);   //It is faster Because the time complexity is O(logn)
        int result=binarysearch(arr, target);
        if(result==-1){
            System.out.println("Not found ");
        }
        else{
            System.out.println("Found at "+result);
        }
        S.close();
    }
}
