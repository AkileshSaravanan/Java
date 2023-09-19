/*
For encoding an even-length binary string into a sequence of A, T, C, and G, we iterate from left to right and replace the characters as follows:
00 is replaced with A
01 is replaced with T
10 is replaced with C
11 is replaced with G
Given a binary string S of length N (N is even), find the encoded sequence.

Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case contains two lines of input.
First line contains a single integer N, the length of the sequence.
Second line contains binary string S of length N.
Output Format
For each test case, output in a single line the encoded sequence.

Note: Output is case-sensitive.


Sample 1:
Input
4
2
00
4
0011
6
101010
4
1001

Output
A
AG
CCC
CT
*/

import java.util.*;
public class Ex28 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int T, N;
        String S; // Store the binary string as a string
        T = read.nextInt();
        read.nextLine(); // Consume the newline character after reading T
        while (T-- > 0) {
            N = read.nextInt();
            S = read.next(); // Read the binary string as a string
            for (int i = 0; i < N; i += 2) {
                if (S.charAt(i) == '0' && S.charAt(i + 1) == '0')
                    System.out.print("A");
                if (S.charAt(i) == '0' && S.charAt(i + 1) == '1')
                    System.out.print("T");
                if (S.charAt(i) == '1' && S.charAt(i + 1) == '0')
                    System.out.print("C");
                if (S.charAt(i) == '1' && S.charAt(i + 1) == '1')
                    System.out.print("G");
            }
            System.out.println(); // Print a newline after each test case
        }
        read.close(); // Close the scanner
    }
}
