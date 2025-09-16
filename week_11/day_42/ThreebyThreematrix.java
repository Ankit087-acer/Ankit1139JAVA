package week_11.day_42;

public class ThreebyThreematrix {
    public static void main(String[] args) {
        int[][] m={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        for(int i=0;i<m.length;i++){
            int[] r=m[i];
            for(int j=0;j<r.length;j++){
                System.out.print(r[j]+" ");
            }
            System.out.println();
        }
    }
    
}
