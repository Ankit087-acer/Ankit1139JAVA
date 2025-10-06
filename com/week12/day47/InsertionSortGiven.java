package Com.week12.day47;
public class InsertionSortGiven {
    public static void main(String[] args) {
        int arr[]={20,50,40,10,30};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && curr<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        System.out.print("The Sorted Array is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
