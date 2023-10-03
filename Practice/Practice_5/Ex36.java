/*
You are given an array A of N integers.
Find the maximum sum of two distinct integers in the array.

Note: It is guaranteed that there exist at least two distinct integers in the array.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains single integer N — the size of the array.
The next line contains N space-separated integers, denoting the array A.
Output Format
For each test case, output on a new line, the maximum sum of two distinct integers in the array.

Constraints
1≤T≤1000
2≤N≤10 

Sample 1:
Input
4
3
4 1 6
7
3 7 2 1 1 5 3
5
8 2 9 4 9
2
1 2

Output
10
12
17
3
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            List<Integer> ori = new ArrayList<>();
            for (int i = 0; i < N - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    ori.add(arr[i]);
                }
            }
            ori.add(arr[N - 1]);
            int j = ori.size();
            for (int i = 0; i < j; i++) {
                arr[i] = ori.get(i);
            }
            System.out.println(arr[j - 1] + arr[j - 2]);
            t--;
        }
    }
}
