package Com.week10.day38;
import java.util.*;
public class Even {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a=S.nextInt();
        if(a%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
        S.close();
    }
}
