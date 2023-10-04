/*
Chef and Roma are playing a game. Rules of the game are quite simple. 
Initially there are N piles of stones on the table. 
In each turn, a player can choose one pile and remove it from the table. 
Each player want to maximize the total number of stones removed by him. 
Chef takes the first turn.
Please tell Chef the maximum number of stones he can remove assuming that both players play optimally.

Input
The first line of the input contains an integer T denoting the number of test cases. 
The description of T test cases follows.
The first line of each test case contains a single integer N denoting the number of piles.
The second line contains N space separated integers A1, A2, ..., AN denoting the number of stones in each pile.

Output
For each test case, output a single line containg the maximum number of stones that Chef can remove.

Constraints
1 ≤ Ai ≤ 109
Subtask 1 (35 points): T = 10, 1 ≤ N ≤ 1000
Subtask 2 (65 points): T = 10, 1 ≤ N ≤ 105

Sample 1:
Input
2
3
1 2 3
3
1 2 1

Output
4
3
*/
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Ex40
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0 ){
		    int n = sc.nextInt();
		    
		    int a[] = new int[n];
		    
		    for (int i = 0 ; i < n ; i++ ) a[i] = sc.nextInt();
		    
		    Arrays.sort( a );
		    
		    long sum = 0;
		    
		    for( int i = n - 1 ; i >= 0 ; i-=2 ){
		        
		        sum += a[i];
		        
		    }
		    
		    System.out.println( sum );
		    
		}
	}
}