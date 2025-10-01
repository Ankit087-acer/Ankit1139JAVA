package com.week13.day50;
import java.util.*;
public class ConcatenateAppend1000num {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=S.nextLine();
        long start = System.currentTimeMillis();
        for(int i=0;i<1000;i++){
         str+=i;
        }
         long end = System.currentTimeMillis();
        System.out.println("Time with String: " + (end - start) + " ms");
  
        StringBuilder sb = new StringBuilder(str);
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            sb.append("a"); 
        }
        end = System.currentTimeMillis();
        System.out.println("Time with StringBuilder: " + (end - start) + " ms");
        S.close();
        
    }
}
