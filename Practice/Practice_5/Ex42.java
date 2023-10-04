/*
In a class of N students, a class test was held. It is also known that the scores of all students were distinct.
A student passes the test if their score is strictly greater than the passing mark. 
Given that exactly X students pass in the test, find the maximum value of the passing mark of the test.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains two space-separated integers N and X — the number of students in the class and the number of students that passed in the test.

Output Format
For each test case, output on a new line, the maximum value of the passing mark of the test.

Constraints
1≤T≤100
1≤N≤100
1≤X≤N

Sample 1:
Input
3
2 2
5 1
4 1
5 1 7 4
4 3
15 70 100 31

Output
0
6
30
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class Ex42 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            Arrays.sort(arr);

            if (n == x) {
                int min = arr[0];
                for (int i = 0; i < n; i++) {
                    if (min > arr[i])
                        min = arr[i];
                }
                System.out.println(min - 1);
            } else {
                System.out.println(arr[n - x] - 1);
            }

            t--;
        }
    }
}
