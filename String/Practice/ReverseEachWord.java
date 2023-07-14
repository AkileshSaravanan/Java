import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class ReverseEachWord {

    static String reverseEachWord(String input)
    {
          StringBuilder sb = new StringBuilder();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder(words[i]);
            reversedWord.reverse();
            sb.append(reversedWord);
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();       
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseEachWord(input);
        System.out.println(ans);
    }
}