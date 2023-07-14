import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class CountWords {
   static int  countWords(String input)
    {
         if (input == null || input.isEmpty()) {
            return 0;
        }

        // Split the input string by whitespace to get an array of words
        String []words = input.split(" ");

        // Return the length of the words array, which represents the count of words
        return words.length;
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int output = countWords(input);
        System.out.println(output);
		
	}
}
