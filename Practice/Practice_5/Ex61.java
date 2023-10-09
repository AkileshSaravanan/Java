/*
Now try and debug this problem.

You are given a program in the IDE which is trying to do the following

Accepts the count of test cases - t - in the 1st line
Each line of test case consists of an integer N
For each test case, it is supposed to print double the integer N as the output

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
public class Ex61
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