import java.util.Scanner;
public class NoofWords
{    
    public static void main(String[] args)
    {        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");    
        String words = s.nextLine();
        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }
}