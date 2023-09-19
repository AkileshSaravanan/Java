/*
Chef has a string S with him. Chef is happy if the string contains a contiguous substring of length strictly greater than 2 in which all its characters are vowels.
Determine whether Chef is happy or not.
Note that, in english alphabet, vowels are a, e, i, o, and u.

Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, a string S.
Output Format
For each test case, if Chef is happy, print HAPPY else print SAD.
You may print each character of the string in uppercase or lowercase (for example, the strings hAppY, Happy, haPpY, and HAPPY will all be treated as identical).

Sample 1:
Input
4
aeiou
abxy
aebcdefghij
abcdeeafg

Output  
Happy
Sad
Sad
Happy
*/

import java.util.Scanner;

public class Ex30{
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int t = 0; t < T; t++) {
            String S = scanner.nextLine().toLowerCase(); // Convert to lowercase

            if (isChefHappy(S)) {
                System.out.println("HAPPY");
            } else {
                System.out.println("SAD");
            }
        }

        scanner.close();
    }

    static boolean isChefHappy(String S) {
        int n = S.length();

        for (int i = 0; i < n - 2; i++) {
            char char1 = S.charAt(i);
            char char2 = S.charAt(i + 1);
            char char3 = S.charAt(i + 2);

            if (isVowel(char1) && isVowel(char2) && isVowel(char3)) {
                return true; // Chef is happy
            }
        }

        return false; // Chef is sad
    }

    static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
