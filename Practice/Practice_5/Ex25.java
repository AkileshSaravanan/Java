/*
Given A,B, and C as the sides of a triangle, find whether the triangle is scalene.

Note:
A triangle is said to be scalene if all three sides of the triangle are distinct.
It is guaranteed that the sides represent a valid triangle.
Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of three space-separated integers A,B, and C — the length of the three sides of the triangle.
Output Format
For each test case, output on a new line, YES, if the triangle is scalene, and NO otherwise.
You may print each character of the string in uppercase or lowercase. For example, YES, yes, Yes, and yEs are all considered identical.

Constraints
1≤T≤100
1≤A≤B≤C≤10
C<(A+B)

Sample 1:
Input
4
2 3 4
1 2 2
2 2 2
3 5 6

Output
YES
NO
NO
YES
*/


import java.util.*;
import java.lang.*;
import java.io.*;

public class Ex25
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
		    int c = s.nextInt();
		    if(a != b && a != c && b != c)
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
