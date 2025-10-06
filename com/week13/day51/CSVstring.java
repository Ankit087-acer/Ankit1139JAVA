package Com.week13.day51;
import java.util.*;
public class CSVstring {
    public static void main(String[] args) {
        String fruits="apple,banana,grape";
        StringTokenizer token=new StringTokenizer(fruits,",");
        System.out.println("Fruits are: ");
        while(token.hasMoreTokens()){
            System.out.println(token.nextToken());
        }
    }
}
