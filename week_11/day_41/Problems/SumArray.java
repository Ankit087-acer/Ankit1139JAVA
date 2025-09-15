package week_11.day_41.Problems;

public class SumArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.print("The sum of array elements is "+sum);
    }
}
