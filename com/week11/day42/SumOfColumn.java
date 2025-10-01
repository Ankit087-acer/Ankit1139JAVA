package com.week11.day42;

public class SumOfColumn {
   public static void main(String[] args) {
     int[][] m={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
     for(int c=0;c<m[0].length;c++){
        int sum=0;
        for(int r=0;r<m.length;r++){
            sum+=m[r][c];
        }
        System.out.println("Sum of Coloumn"+" "+(c+1)+" "+"is"+" "+sum);
     }
   } 
}
