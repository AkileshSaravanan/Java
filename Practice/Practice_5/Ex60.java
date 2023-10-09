/*
So as you solve programming problems - you will need to debug and find errors in your own code.

Task
You are given a program which does the following
Accepts the count of test cases - t - in the 1st line
The only line of each test case consists of an integer N
For each test case, output to the console the value that is double the integer N
Can you try and debug / fix the error in the given program?

Sample 1:
Input
3
1
2
3

Output
2
4
6
*/
import java.util.Scanner;
public class Ex60
{
	public static void main (String[] args)
	{
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();        
        for(int i=0; i<t; i++)
        {
            int n = read.nextInt();
            System.out.println(n*2);
        }
	}
}