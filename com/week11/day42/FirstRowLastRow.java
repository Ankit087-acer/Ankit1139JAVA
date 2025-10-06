package Com.week11.day42;

import java.util.Scanner;

public class FirstRowLastRow {
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
        System.out.print("The first row of the matrix is ");
        for(int x:m[0]){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.print("The last row of the matrix is ");
        for(int x:m[m.length-1]){
            System.out.print(x+" ");
        }
        S.close();
    }
}
