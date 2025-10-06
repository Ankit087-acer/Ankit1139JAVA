package Com.week13.day50;
import java.util.*;
public class ReverseStringBuilder {
   public static void main(String[] args) {
    Scanner S=new Scanner(System.in);
    System.out.print("Enter the String: ");
    String name1=S.nextLine();
    StringBuffer name=new StringBuffer(name1);
    for(int i=0;i<name.length()/2;i++){
            int front=i;
            int back=name.length()-1-i;
            char frontChar=name.charAt(front);
            char backChar=name.charAt(back);
           name.setCharAt(front, backChar);
           name.setCharAt(back, frontChar);
        }
        System.out.println("The Reverse of the String is "+name);
    S.close();
   } 
}
