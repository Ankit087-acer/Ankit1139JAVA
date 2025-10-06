package Com.week13.day49;
import java.util.*;
public class CharacterArray {
    public static void main(String[] args) {
       Scanner S=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=S.nextLine();
        char arr[]=str.toCharArray();
        arr[0]='o';
        System.out.println("Char Array: "+new String(arr));
        System.out.println("Original String: "+str);
        S.close(); 
    }
}
