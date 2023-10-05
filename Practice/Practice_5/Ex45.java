/*
You are given an array A of size N. In one operation, you can do the following:
Find the minimum number of operations required to make all elements of the array equal.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains an integer N — the size of the array.
The next line contains N space-separated integers, denoting the array A.
Output Format
For each test case, output on a new line, the minimum number of operations required to make all elements of the array equal.

Sample 1:
Input
3
3
1 2 3
4
2 2 3 1
4
3 1 2 4

Output
2
2
3
*/
import java.util.Scanner;
public class Ex45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int[] ar = new int[n + 1];
            for (int i = 0; i < n; i++) {
                int b = sc.nextInt();
                ar[b]++;
            }
            int sum = 0;
            for (int i = 0; i < n + 1; i++) {
                if (ar[i] > sum)
                    sum = ar[i];
            }
            System.out.println(n - sum);
        }
    }
}
