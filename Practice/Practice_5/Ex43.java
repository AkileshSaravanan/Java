/*
Chef is fan of pairs and he likes all things that come in pairs. He even has a doll collection in which the dolls come in pairs. One day while going through his collection he found that there are odd number of dolls. Someone had stolen a doll!!!

Help chef find which type of doll is missing..

Input
The first line contains an integer T, the number of test cases.
The first line of each test case contains an integer N, the number of dolls.
The next N lines are the types of dolls that are left.

Output
For each test case, display the type of doll that doesn't have a pair, in a new line.

Sample 1:
Input
1
3
1 
2
1

Output
2
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class Ex43 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            int n = inp.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = inp.nextInt();
            }

            Arrays.sort(arr);
            for (int i = 0; i < n - 1; i += 2) {
                if (arr[i] == arr[i + 1]) {
                    continue;
                } else {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
