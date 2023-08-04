//Java program to compare two strings
import java.util.Scanner;
public class CompareToString
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First String:");
        String s1 = s.nextLine();
        System.out.println("Enter the Second String:");
        String s2 = s.nextLine();
        if(s1.compareTo(s2) > 0 )
        {
            System.out.println("First String is greater than second string");
        }
        else if(s1.compareTo(s2)<0)
        {
            System.out.println("First String is smaller than second string");
        }
        else
        {
            System.out.println("Both are Equal");
        }
    }
}