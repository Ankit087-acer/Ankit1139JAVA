package Com.week11.day44.Classwork;

import java.util.Scanner;

public class Fibonacci {
     public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.print("The Fibonacci series is ");
        for(int i=0;i<=n;i++){
            System.out.print(fibonacci(i)+" ");
        }
        sc.close();
    }
}
