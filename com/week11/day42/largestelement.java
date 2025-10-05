package com.week11.day42;

import java.util.Scanner;

public class largestelement {
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
        for(int i=0;i<rows;i++){
             int largest=m[0][0];
            for(int j=0;j<columns;j++){
               if(m[i][j]>largest){
                largest=m[i][j];
               }  
            }
              System.out.println("Largest Element of Row"+" "+(i+1)+" "+"is"+" "+largest);
        }
        S.close();
       
    }
}
