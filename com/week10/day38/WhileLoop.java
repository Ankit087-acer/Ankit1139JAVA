package Com.week10.day38;
import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=S.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);  //Runs if the Condition is true but if false then nothing is print.
            i++;
        }
        S.close();
    }
}
