package Com.week13.day50;
import java.util.*;
public class UpperCase {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String name=S.nextLine();
        String r=name.toUpperCase();
        System.out.println("The original String is "+name);
        System.out.println("The string to the uppercase is "+r);
        int n=r.charAt(2);
        System.out.println("The Character at index 2 is "+(char)n);
        S.close();
    }
}
