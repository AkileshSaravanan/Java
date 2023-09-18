/*
In Chefland, a valid phone number consists of 5 digits with no leading zeros.
For example, 98765,10000, and 71023 are valid phone numbers while 04123,9231, and 872310 are not.
Chef went to a store and purchased N items, where the cost of each item is X.
Find whether the total bill is equivalent to a valid phone number.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of two space-separated integers N and X — the number of items Chef bought and the cost per item.
Output Format
For each test case, output on a new line, YES, if the total bill is equivalent to a valid phone number and NO otherwise.
Each character of the output may be printed in either uppercase or lowercase. That is, the strings NO, no, nO, and No will be treated as equivalent.

Constraints
1≤T≤100
1≤N,X≤1000

Sample 1:
Input
4
25 785
402 11
100 100
333 333

Output
YES
NO
YES
NO
*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class Ex27
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
		    int c = a*b;
		    if(c>=10000 && c<=99999)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
	}
}