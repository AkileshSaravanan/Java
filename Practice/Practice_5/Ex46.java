/*
You are given an array A of length N. An element X is said to be dominant if the frequency of X in A is strictly greater than the frequency of any other element in the A.
Find if there exists any dominant element in A.

Input Format
The first line of input contains a single integer T — the number of test cases. Then the test cases follow.
The first line of each test case contains an integer N — the size of the array A.
The second line of each test case contains N space-separated integers 

Output Format
For each test case, output YES if there exists any dominant element in A. Otherwise, output NO.
You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).

Sample 1:
Input
4
5
2 2 2 2 2
4
1 2 3 4
4
3 3 2 1
6
1 1 2 2 3 4

Output
YES
NO
YES
NO
*/
import java.util.*;
public class Ex46 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T-- > 0) {
            int n = s.nextInt();
            int[] a = new int[n];
            int[] f1 = new int[1001];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                f1[a[i]]++;
            }
            Arrays.sort(f1);
            if (f1[1000] != f1[999]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
