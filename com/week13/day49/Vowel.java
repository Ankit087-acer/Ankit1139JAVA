package Com.week13.day49;
import java.util.*;
public class Vowel {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String name=S.nextLine();
        for(int i=0;i<name.length();i++){
            char alpha = name.charAt(i);
            if((alpha == 'a')||(alpha=='e')||(alpha=='i')||(alpha=='o')||(alpha=='u')||(alpha == 'A')||(alpha=='E')||(alpha=='I')||(alpha=='O')||(alpha=='U')){
               alpha='*';
            }
            System.out.print(alpha+" ");
        }
        S.close();
    }
}
