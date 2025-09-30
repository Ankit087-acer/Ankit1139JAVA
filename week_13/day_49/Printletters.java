package week_13.day_49;
import java.util.*;
public class Printletters {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String letter=S.nextLine();
        for(int i=0;i<letter.length();i++){
            System.out.print(letter.charAt(i)+" ");
        }
        S.close();
    }
}
