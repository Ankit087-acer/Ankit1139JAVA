package week_11.day_42;
public class largestelement {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for(int i=0;i<arr.length;i++){
             int largest=arr[0][0];
            for(int j=0;j<arr[i].length;j++){
               if(arr[i][j]>largest){
                largest=arr[i][j];
               }  
            }
             System.out.println(largest);
        }
       
    }
}
