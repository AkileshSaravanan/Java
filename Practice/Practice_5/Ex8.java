/*
Alice has scored X marks in her test and Bob has scored Y marks in the same test.
Alice is happy if she scored at least twice the marks of Bob’s score. Determine whether she is happy or not.

Input Format
The first and only line of input contains two space-separated integers X,Y — the marks of Alice and Bob respectively.
Output Format
For each testcase, print Yes if Alice is happy and No if she is not, according to the problem statement.
The judge is case insensitive so you may output the answer in any case. In particular YES, yes, yEsare all considered equivalent toYes`.

Constraints
1≤X,Y≤100

Sample 1:
Input
2 1

Output
Yes
 */

 import java.util.*;
 import java.lang.*;
 import java.io.*;
 
 /* Name of the class has to be "Main" only if the class is public. */
 public class Ex8
 {
     public static void main (String[] args) throws java.lang.Exception
     {
         // your code goes here
         Scanner s = new Scanner(System.in);
         int a = s.nextInt();
         int b = s.nextInt();
         if(a >= 2*b)
         {
             System.out.println("Yes");
         }
         else
         {
             System.out.println("No");
         }
     }
 }
 