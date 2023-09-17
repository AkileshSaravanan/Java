/*
Your task is very simple: given two integers A and B, write a program to add these two numbers and output the sum.

Input Format
The first line contains an integer T, the total number of test cases.
Then follow T lines, each line contains two integers, A and B.
Output Format
For each test case, add A and B and display the sum in a new line.

Constraints
1≤T≤1000
0≤A,B≤10000

Sample 1:
Input
3
1 2
100 200
10 40

Output
3
300
50
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Ex10
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int c = a + b;
		    System.out.println(c);
		}
		
	}
}


