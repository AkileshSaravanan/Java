/*
There should be one closing bracket for each opening bracket and the closing bracket should also be of the same type, like (),{},[]

If we try to use different opening and closing brackets, it can give you a syntax error.

int a  = ( 5+7 } ;     // incorrect due to the usage of mismatched parenthesis
Task
We have given a program to check whether a given number is odd or even.
Debug the code the solve the problem.
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class Ex48 {
    public static void main(String[] args) {
        int n;
        n = 5;
        if (n % 2 == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }     // correct the closing bracket
    }
}
