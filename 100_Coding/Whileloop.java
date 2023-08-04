//While loop Program in java
import java.util.Scanner;
public class Whileloop
{
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Input an Integer:");
        while((n=s.nextInt()) != 0)
        {
            System.out.println("Ypu Entered "+ n);
            System.out.println("Input an integer");
        }
        System.out.println("Out of loop");
    }
}