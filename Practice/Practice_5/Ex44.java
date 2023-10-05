/*
Devu has n weird friends. Its his birthday today, so they thought that this is the best occasion for testing their friendship with him. They put up conditions before Devu that they will break the friendship unless he gives them a grand party on their chosen day. Formally, ith friend will break his friendship if he does not receive a grand party on dith day.

Devu despite being as rich as Gatsby, is quite frugal and can give at most one grand party daily. Also, he wants to invite only one person in a party. So he just wonders what is the maximum number of friendships he can save. Please help Devu in this tough task !!

Input
The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
First line will contain a single integer denoting n.
Second line will contain n space separated integers where ith integer corresponds to the day dith as given in the problem.
Output
Print a single line corresponding to the answer of the problem.

Sample 1:
Input
2
2
3 2
2
1 1

Output
2
1
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class Ex44 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase-- > 0) {
            int a = sc.nextInt();
            int count = 0;
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < a - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    count++;
                }
            }
            System.out.println(count + 1);
        }
    }
}
