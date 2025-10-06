package Com.week12.day45.Classwork;
// import java.util.Arrays;
public class LinearSearch {
    public static void main(String[] args) {
        int []arr={7,2,3,4,6};
        int target=3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Found at "+i);
            }
            
        }
    }
}
