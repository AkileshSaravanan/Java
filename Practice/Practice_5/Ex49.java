/*
Runtime Error: Generally caused by accessing a negative or unreachable index of a string or an array or dividing a number by 0.

Example :-

 int a = 5; 
 int b = 0; 
 int c = a/b;      // runtime error due to dividing a number with zero  
Task
Run the code given in the IDE - it will cause a run-time error.
Uncomment the if condition to make the code work - i.e. print infinity whenever b = 0

Sample 1:
Input
5 3

Output
1
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class Ex49 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (b == 0) {
            System.out.println("infinity");   // uncomment the if condition
            return;
        } 
        System.out.println(a / b);
    }
}
