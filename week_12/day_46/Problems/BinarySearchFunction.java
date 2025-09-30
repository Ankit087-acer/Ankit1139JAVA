package week_12.day_46.Problems;

public class BinarySearchFunction {
    public static int binarySearch(int target,int arr[],int start,int end){
            while(start<=end){
            int mid=(end-start)/2;
            if(arr[mid]==target){
                 return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,9,10,12};
        int target=89;
        int start=0;
        int end=arr.length-1;
        int ans=-1;
    }
}
