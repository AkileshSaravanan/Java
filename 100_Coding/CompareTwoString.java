//How to compare 2 string in java Program
import java.util.Scanner;
public class CompareTwoString
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First String:");
        String s1 = s.nextLine();
        System.out.println("Enter the Second String:");
        String s2 = s.nextLine();
        System.out.println("Enter the Third String:");
        String s3 = s.nextLine();
        System.out.println("Enter the Fourth String:");
        String s4 = s.nextLine();
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
    }
}