// Reverse a String in java
import java.util.Scanner;
public class ReverseString
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str1 = s.nextLine();
        String rev = " ";
        for(int i = str1.length()-1;i>=0;i--)
        {
            rev = rev + str1.charAt(i);
        }
        System.out.println("Reverse a String is :"+ rev);
    }
}