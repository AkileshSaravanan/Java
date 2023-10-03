/*
CodeCheffers are aware that after a contest, all problems are moved into the platform’s practice section. 
Based on user submissions during the contest, the system calculates and assigns a difficulty rating to each problem. 
Ideally, it is recommended that users practice problems in increasing order of difficulty.
Our Chef has some students in his coding class who are practicing problems. 
Given the difficulty of the problems that the students have solved in order, help the Chef identify if they are solving them in non-decreasing order of difficulty. 
Output "Yes" if the problems are attempted in non-decreasing order of difficulty rating and "No" if not.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases. The description of the test cases follows.
Each test case consists of 2 lines of input.
The first line contains a single integer N, the number of problems solved by the students
The second line contains N space-separate integers, the difficulty ratings of the problems attempted by the students in order.
Output Format
For each test case, output in a new line "Yes" if the problems are attempted in non-decreasing order of difficulty rating and "No" if not. 
The output should be printed without the quotes.
Each letter of the output may be printed in either lowercase or uppercase. For example, the strings yes, YeS, and YES will all be treated as equivalent.

Constraints
1≤T≤100
2≤N≤100
1≤ difficulty of each problem ≤5000

Sample 1:
Input
4
3
1 2 3
3
1 1 2
5
100 200 300 400 350
5
1000 2000 5000 3000 1000

Output
Yes
Yes
No
No
*/

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int done = scanner.nextInt();
            
            int[] arr = new int[done];
            for (int k = 0; k < done; k++) {
                arr[k] = scanner.nextInt();
            }
            
            boolean isNonDecreasing = true;
            for (int j = 1; j < done; j++) {
                if (arr[j] < arr[j - 1]) {
                    isNonDecreasing = false;
                    break;
                }
            }
            
            if (isNonDecreasing) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
