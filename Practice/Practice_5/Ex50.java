/*
Incorrect conditionals are one of the most common types of logical errors, which can be seen while using conditional statements like if-else and loops.

Example:- The code below is supposed to do the following

If an integer is even, then output True
If an integer is odd, then output False
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
        
        scanner.close();
    }
}

        
However, the code above is incorrect

Based on the code - if n%2==1 - i.e. for odd numbers - we will output True
Task
Given a program to check a number is greater then 5 or not.

Run the code it will give wrong answer.
find the wrong condition and correct it.
Sample 1:
Input
5

Output
the number is smaller than or equal to 5
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class Ex50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n>5) {             // correct the incorrect if codition 
            System.out.println("the number is greater than 5");
        } else {
            System.out.println("the number is smaller than or equal to 5");
        }
        
        scanner.close();
    }
}
