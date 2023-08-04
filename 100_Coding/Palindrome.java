// Palindrome in java
import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str1 = s.nextLine();
        String rev = "";
        for(int i = str1.length()-1;i>=0;i--)
        {
            rev = rev + str1.charAt(i);
        }
        System.out.println(rev);
    if(str1.equals(rev))
    {
        System.out.println(str1 + " is a palindrome");

    }
    else
    {
        System.out.println(str1 + " is not a palindrome");
    }
}
}