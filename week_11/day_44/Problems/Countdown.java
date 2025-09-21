package week_11.day_44.Problems;
// import java.util.*;
import java.util.Scanner;
public class Countdown {
    public static void countdown(int n){
            if(n==0){
               return ;
            }
            System.out.print(n+" ");
            countdown(n-1);
        }
    public static void main(String[] args) {
       int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=sc.nextInt();
        countdown(n);
        sc.close();
    }
}
