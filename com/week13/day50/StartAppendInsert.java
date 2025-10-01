package com.week13.day50;

public class StartAppendInsert {
    public static void main(String[] args) {
        StringBuffer name=new StringBuffer("Learning");
        name.append(" Java");
        name.insert(13," with fun");
        System.out.println("String After Modification is: ");
        System.out.println(name);

    }
}
 