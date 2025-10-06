package Com.week13.day51;
import java.util.*;
public class StringTokenizerSentence {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=S.nextLine();
        StringTokenizer token = new StringTokenizer(str," ");
        int count=token.countTokens();
        System.out.print("Words in the Sentence: ");
        while(token.hasMoreTokens()){
            System.out.println(token.nextToken());
        }
        System.out.println("Total number of words: "+count);
        S.close();
    }
}
