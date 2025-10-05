package com.week12.day46;
import java.util.*;
public class SumodDiagonal {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int row=S.nextInt();
        System.out.print("Enter the number of Columns: ");
        int cols=S.nextInt();
        int arr[][]=new int[row][cols];
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=S.nextInt();
            }
        }
       for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.print("The sum of diagonal elements is "+sum);   // If the matrix size is doubles then the time complexity still remains same.
        S.close();
    }
}
