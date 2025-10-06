package Com.week13.day49;
import java.util.*;
public class StringBuilderEfficiency {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
         int n = 100_000; 
         System.out.print("Enter the String: ");
        String str = S.nextLine();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            str += "a"; 
        }
        long end = System.currentTimeMillis();
        System.out.println("Time with String: " + (end - start) + " ms");

       
        StringBuilder sb = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sb.append("a"); 
        }
        end = System.currentTimeMillis();
        System.out.println("Time with StringBuilder: " + (end - start) + " ms");
        S.close();
    }
}
