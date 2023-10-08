/*
As our string uses zero-based indexing, many times we forget about it and write logic using one-based indexing, which gives us the wrong answer. This incorrect indexing gives you a logical error.

Program to print the last character of the string
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Input length of the string

        String s = scanner.next(); // Input string
        System.out.println(s.charAt(n-1)); // right answer
        // System.out.println(s.charAt(n));  // wrong answer
        scanner.close();
    }
}

Task
Give a program to print 1, 4 and 6 character of a string
Find out the logical error and solve it
Sample 1:
Input
hellohowudoing

Output
hlh
*/
import java.util.*;
public class Ex51{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(); // Input string
        scanner.close();

        if (s.length() > 1 && s.length() > 4 && s.length() > 6) {
            char c1 = s.charAt(0); // correct the indexing from one based to zero based
            char c2 = s.charAt(2);
            char c3 = s.charAt(5);

            System.out.println("" + c1 + c2 + c3);
        } else {
            System.out.println("Invalid indices"); // Handle the case when indices are out of bounds
        }
    }
}
