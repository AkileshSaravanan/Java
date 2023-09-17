/*
Chef is fond of burgers and decided to make as many burgers as possible.
Chef has A patties and B buns. To make 1 burger, Chef needs 1 patty and 1 bun.
Find the maximum number of burgers that Chef can make.

Input Format
The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.
The first and only line of each test case contains two space-separated integers A and B, the number of patties and buns respectively.
Output Format
For each test case, output the maximum number of burgers that Chef can make.

Constraints
1≤T≤1000
1≤A,B≤10 
 
Sample 1:
Input
4
2 2
2 3
3 2
23 17

Output
2
2
2
17
*/

import java.util.*;
import java.lang.Math;
import java.io.*;

public class Ex15
{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    for(int i=0;i<T;i++){
	       int A=sc.nextInt();
	       int B=sc.nextInt();
	       System.out.println(Math.min(A,B));
	       
	    }
	}
}