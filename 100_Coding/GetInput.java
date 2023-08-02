//How to get Using input using Scanner Program in java
import java.util.Scanner;
public class GetInput
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Name");
        String ss = s.nextLine();
        System.out.println("Enter a number");
        int a = s.nextInt();
        System.out.println("Enter a percentage");
        float b = s.nextFloat();
        System.out.println("Enter a Name" + ss);
        System.out.println("Enter a number"+a);
        System.out.println("Enter a percentage"+b);
    }
}