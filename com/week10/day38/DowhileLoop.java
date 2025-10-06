package Com.week10.day38;

import java.util.Scanner;

public class DowhileLoop {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=S.nextInt();
        int i=1;
        do{
            System.out.println(i);  //Runs and Print the output if the Condition is False
            i++;
        }while(i<=n);
        S.close();
    }
}
