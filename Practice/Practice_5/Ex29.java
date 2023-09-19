/*
Chef wants to implement wildcard pattern matching supporting only the wildcard '?'. 
The wildcard character '?' can be substituted by any single lower case English letter for matching. 
He has two strings X and Y of equal length, made up of lower case letters and the character '?'.
He wants to know whether the strings X and Y can be matched or not.

Input
The first line of input contain an integer T denoting the number of test cases. 
Each test case consists of two lines, the first line contains the string X and the second contains the string Y.

Output
For each test case, output a single line with the word Yes if the strings can be matched, otherwise output No.

Constraints
1 ≤ T ≤ 50
Both X and Y have equal length and the length is between 1 and 10.
Both X and Y consist of lower case letters and the character '?'.

Sample 1:
Input
2
s?or?
sco??
stor?
sco??

Output
Yes
No
*/
import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        while (T-- > 0) {
            String X = scanner.nextLine();
            String Y = scanner.nextLine();

            String result = canBeMatched(X, Y);
            System.out.println(result);
        }

        scanner.close();
    }

    static String canBeMatched(String X, String Y) {
        int len = X.length();

        for (int i = 0; i < len; i++) {
            char charX = X.charAt(i);
            char charY = Y.charAt(i);

            if (charX != charY && charX != '?' && charY != '?') {
                return "No";
            }
        }

        return "Yes";
    }
}
