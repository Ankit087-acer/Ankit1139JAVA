package com.week13.day51;
import java.util.*;
public class PalindromeChecker {
    public static boolean palindrome(String st){
        String cleaned = st.replaceAll("[^a-zA-Z]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(cleaned);
        String reversed = sb.reverse().toString();
        return cleaned.equals(reversed);
    }
    public static void main(String[] args) {
       Scanner S=new Scanner(System.in); 
       System.out.print("Enter the String: ");
       String sent=S.nextLine();
       Boolean result=palindrome(sent);
       if(result==true){
        System.out.println("The String is Palindrome");
       }
       else{
        System.out.println("The String is not palindrome");
       }
    S.close();
    }
}
