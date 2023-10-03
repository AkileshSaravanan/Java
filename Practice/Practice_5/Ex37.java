/*
CodeChef offers a feature called streak count. A streak is maintained if you solve at least one problem daily.
Om and Addy actively maintain their streaks on CodeChef. Over a span of N consecutive days, you have observed the count of problems solved by each of them.
Your task is to determine the maximum streak achieved by Om and Addy and find who had the longer maximum streak.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains an integer N — the number of days.

Output Format
For each test case, output:
OM, if Om has longer maximum streak than Addy;
ADDY, if Addy has longer maximum streak than Om;
DRAW, if both have equal maximum streak.
You may print each character in uppercase or lowercase. For example, OM, om, Om, and oM, are all considered the same.

Sample 1:
Input
3
6
1 7 3 0 2 13
0 2 3 4 5 0
3
1 3 4
3 1 2
5
1 2 3 0 1
1 2 0 2 3

Output
Addy
Draw
Om
*/
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
public class Ex37
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			
			int[] om = new int[n];
			int[] ad = new int[n];
			
			int countOM = 0 , countAD = 0 ;
			int maxOM = 0 , maxAD = 0 ;

			for (int i = 0; i < om.length; i++) {
				om[i] = sc.nextInt();
				if (om[i] > 0) {
					countOM++ ;
				}
				else {
					if (countOM > maxOM) 
						maxOM = countOM ;
					countOM = 0 ;
				}
			}
			if (countOM > maxOM) 
				maxOM = countOM ;
			
			for (int i = 0; i < ad.length; i++) {
				ad[i] = sc.nextInt();
				if (ad[i] > 0) {
					countAD++ ;
				}
				else {
					if (countAD > maxAD) 
						maxAD = countAD ;
					countAD = 0 ;
				}
			}
			if (countAD > maxAD) 
				maxAD = countAD ;
			
			System.out.println( maxOM == maxAD ? "Draw" : (maxOM > maxAD ? "Om" : "Addy") ) ;
		}
	}
}