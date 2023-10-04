/*
Andrew likes meatballs very much.
He has N plates of meatballs, here the ith plate contains Pi meatballs. 
You need to find the minimal number of plates Andrew needs to take to his trip to Las Vegas, if he wants to eat there at least M meatballs. 
Note that each plate is already packed, i.e. he cannot change the amount of meatballs on any plate.

Input
The first line of the input contains an integer T, denoting the number of test cases. 
The description of T test cases follows. The first line of each test case contains two space-separated integers N and M. 
The second line contains N space-separated integers P1, P2, ..., PN.

Output
For each test case, output an integer, denoting the minimum number of plates. 
If it's impossible to take at least M meatballs, print -1.

Constraints
1 ≤ T ≤ 7777
1 ≤ N ≤ 7
1 ≤ M, Pi ≤ 1018

Sample 1:
Input
1
4 7
1 2 3 4

Output
2
*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class Ex41{
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long m = sc.nextLong();
            long[] p = new long[n];
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextLong();
            }
            Arrays.sort(p);
            long s = 0;
            int flag = 1;
            for (int j = n - 1; j >= 0; j--) {
                s += p[j];
                if (s >= m) {
                    flag = 0;
                    System.out.println(n - j);
                    break;
                }
            }
            if (flag == 1)
                System.out.println(-1);
        }
    }
}
