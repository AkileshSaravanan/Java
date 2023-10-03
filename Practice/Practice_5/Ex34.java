/*
Chef visited a grocery store for fresh supplies. There are N items in the store where the ℎ ith item has a freshness value 
Chef has decided to purchase all the items having a freshness value greater than equal to X. Find the total cost of the groceries Chef buys.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains two space-separated integers N and X — the number of items and the minimum freshness value an item should have.
The second line contains N space-separated integers, the array A, denoting the freshness value of each item.
The third line contains N space-separated integers, the array B, denoting the cost of each item.
Output Format
For each test case, output on a new line, the total cost of the groceries Chef buys.

Constraints
1≤T≤100
1≤N,X≤100

Sample 1:
Input
4
2 20
15 67
10 90
3 1
1 2 3
1 2 3
3 100
10 90 50
30 7 93
4 50
12 78 50 40
40 30 20 10

Output
90
6
0
50
*/
import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int f = scanner.nextInt();
            int[] f_arr = new int[n];
            int[] c_arr = new int[n];
            for (int i = 0; i < n; i++) {
                f_arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                c_arr[i] = scanner.nextInt();
            }
            int total = 0;
            for (int k = 0; k < n; k++) {
                if (f_arr[k] >= f) {
                    total += c_arr[k];
                }
            }
            System.out.println(total);
            t--;
        }
    }
}
