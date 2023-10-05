/*
There are N different types of colours numbered from 1 to N. Chef has A balls having colour i, (1≤i≤N).
Chef will arrange some boxes and put each ball in exactly one of those boxes.
Find the minimum number of boxes Chef needs so that no box contains two balls of same colour.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases. The description of the test cases follows.
The first line of each test case contains a single integer N, denoting the number of colors.

Output Format
For each test case, output the minimum number of boxes required so that no box contains two balls of same colour.
Sample 1:
Input
3
2
8 5
3
5 10 15
4
4 4 4 4
Output
8
15
4
*/
import java.util.Scanner;
public class Ex47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            
            int max = a[0];
            
            for (int j = 0; j < n; j++) {
                if (a[j] > max) {
                    max = a[j];
                }
            }
            
            System.out.println(max);
        }
    }
}
