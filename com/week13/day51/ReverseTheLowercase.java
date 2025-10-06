package Com.week13.day51;
import java.util.*;
public class ReverseTheLowercase {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the String: ");
       String Str=S.nextLine();
       String ne=Str.toLowerCase();
       StringBuilder reverse=new StringBuilder(ne);
       for(int i=0;i<reverse.length()/2;i++){
            int front=i;
            int back=reverse.length()-1-i;
            char frontChar=reverse.charAt(front);
            char backChar=reverse.charAt(back);
           reverse.setCharAt(front, backChar);
           reverse.setCharAt(back, frontChar);
        }
        System.out.println("The reverse is "+reverse);
        S.close();
    }
}
