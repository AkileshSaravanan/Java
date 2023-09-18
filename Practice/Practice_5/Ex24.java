/*
Chef has started working at the candy store. The store has 100 chocolates in total.
Chef’s daily goal is to sell X chocolates. For each chocolate sold, he will get 1 rupee. However, if Chef exceeds his daily goal, he gets 2 rupees per chocolate for each extra chocolate.
If Chef sells Y chocolates in a day, find the total amount he made.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of two space-separated integers X and Y — the daily goal of Chef, and the number of chocolates he actually sells.
Output Format
For each test case, output on a new line the total amount Chef made in a day.

Constraints
1≤T≤100
1≤X,Y≤10

Sample 1:
Input
4
3 1
5 5
4 7
2 3

Output
1
5
10
4
*/


import java.util.*;
import java.lang.*;
import java.io.*;

public class Ex24
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
		    if(a>=b)
		    {
		        System.out.println(b);
		    }
		    else
            {
		        System.out.println(a+2*(b - a));
		    }
		}
	}
}
