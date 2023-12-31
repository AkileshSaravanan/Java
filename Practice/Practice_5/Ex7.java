/*
In ChefLand, human brain speed is measured in bits per second (bps). Chef has a threshold limit of X bits per second above which his calculations are prone to errors.
If Chef is currently working at Y bits per second, is he prone to errors?If Chef is prone to errors print YES, otherwise print NO.

Input Format
The only line of input contains two space separated integers X and Y — the threshold limit and the rate at which Chef is currently working at.

Output Format
If Chef is prone to errors print YES, otherwise print NO.
You may print each character of the string in uppercase or lowercase (for example, the strings yes, Yes, yEs, and YES will all be treated as identical).

Constraints
1≤X,Y≤100

Sample 1:
Input
7 9

Output
YES
 */

 import java.util.*;
 import java.lang.*;
 import java.io.*;
 
public class Ex7
 {
     public static void main (String[] args) throws java.lang.Exception
     {
         // your code goes here
         Scanner s = new Scanner(System.in);
         int a = s.nextInt();
         int b = s.nextInt();
         if (a<b)
         {
             System.out.println("YES");
         }
         else{
             System.out.println("NO");
         }
     }
 }
 