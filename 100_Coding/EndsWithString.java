//How to string with with specific char in java Program
import java.util.Scanner;
public class EndsWithString
{
    public static void main(String args[])
    {
        String s1 = "Hi,Hello Welcome!";
        System.out.println(s1.endsWith("!"));
        System.out.println(s1.endsWith("come"));
        System.out.println(s1.endsWith("Welcome!"));
        System.out.println(s1.endsWith("come!"));
    }
}