/*
Chef has invented 1-minute Instant Noodles. As the name suggests, each packet takes exactly 1 minute to cook.
Chef's restaurant has X stoves and only 1 packet can be cooked in a single stove at any minute.How many customers can Chef serve in 
Y minutes if each customer orders exactly 1 packet of noodles?

Input Format
The first and only line of input contains two space-separated integers X and  Y — the number of stoves and the number of minutes, respectively.
Output Format
Print a single integer, the maximum number of customers Chef can serve in Y minutes
Constraints
1≤X,Y≤1000
 */

 import java.util.*;
 import java.lang.*;
 import java.io.*;
 public class Ex5
 {
     public static void main (String[] args) throws java.lang.Exception
     {
         // your code goes here
         Scanner s = new Scanner(System.in);
         int a = s.nextInt();
         int b = s.nextInt();
         int c = a * b;
         System.out.print(c);
     }
 }
 