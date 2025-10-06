package Com.week11.day42;

import java.util.Scanner;

public class SumOfColumn {
   public static void main(String[] args) {
      Scanner S = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int rows = S.nextInt();
        System.out.print("Enter the Number of Columns: ");
        int columns = S.nextInt();
        int[][] m = new int[rows][columns];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                m[i][j] = S.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
     for(int c=0;c<m[0].length;c++){
        int sum=0;
        for(int r=0;r<m.length;r++){
            sum+=m[r][c];
        }
        System.out.println("Sum of Column"+" "+(c+1)+" "+"is"+" "+sum);
     }
     S.close();
   } 
}
