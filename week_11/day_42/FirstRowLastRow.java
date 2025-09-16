package week_11.day_42;

public class FirstRowLastRow {
    public static void main(String[] args) {
        int[][] m={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.print("The first row of the matrix is ");
        for(int x:m[0]){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.print("The last row of the matrix is ");
        for(int x:m[m.length-1]){
            System.out.print(x+" ");
        }
    }
}
