package week_11.day_44.Classwork;
import java.util.Arrays;
public class Diagonal {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int product=1;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    product*=mat[i][j];
                }
            }
        }
        System.out.println("Product: "+product);
         for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    mat[i][j]=product;
                    System.out.println(Arrays.toString(mat[i]));
                }
            }
        }
      
      
    }
}
