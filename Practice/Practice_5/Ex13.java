/*
Chef wants to appear in a competitive exam. To take the exam, there are following requirements:
Minimum age limit is X (i.e. Age should be greater than or equal to X).
Age should be strictly less than Y.
Chef's current Age is A. Find whether he is currently eligible to take the exam or not.

Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing three integers X,Y, and A as mentioned in the statement.
Output Format
For each test case, output YES if Chef is eligible to give the exam, NO otherwise.
You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).

Constraints
1≤T≤1000
20≤X<Y≤40
10≤A≤50

Sample 1:
Input
5
21 34 30
25 31 31
22 29 25
20 40 15
28 29 28

Output
YES
NO
YES
NO
YES
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Ex13
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int a=sc.nextInt();
		    if(a>=x && a<y)
		    {
		        System.out.println("YES");
		    }
		    else
		    System.out.println("NO");
		    
		}
	}
}
