package com.week10.day37;
public class Operator {
    public static void main(String[] args) {
        // --- Assignment Operators ---
        int a = 10;           // simple assignment
        int b = 5;
        int c;

        c = a + b;            
        System.out.println("c = a + b: " + c);

        c += a;               // c = c + a
        System.out.println("c += a: " + c);

        c -= b;               // c = c - b
        System.out.println("c -= b: " + c);

        c *= 2;               // c = c * 2
        System.out.println("c *= 2: " + c);

        c /= 3;               // c = c / 3
        System.out.println("c /= 3: " + c);

        c %= 4;               // c = c % 4
        System.out.println("c %= 4: " + c);

        // --- Relational Operators ---
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));   // equals
        System.out.println("a != b: " + (a != b));   // not equals
        System.out.println("a > b: " + (a > b));     // greater than
        System.out.println("a < b: " + (a < b));     // less than
        System.out.println("a >= b: " + (a >= b));   // greater than or equal
        System.out.println("a <= b: " + (a <= b));   // less than or equal

        // --- Logical Operators ---
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));   // logical AND
        System.out.println("x || y: " + (x || y));   // logical OR
        System.out.println("!x: " + (!x));           // logical NOT
        System.out.println("!(x && y): " + (!(x && y))); // combined

        // --- Ternary Operator ---
        int max = (a > b) ? a : b;  // if a > b then a else b
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b: " + max);

        String result = (a % 2 == 0) ? "Even" : "Odd"; // check even or odd
        System.out.println("a is " + result);
    }
}