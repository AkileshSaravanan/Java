//Find factorial for given no Program in Java
import java.util.Scanner;
public class Factorial
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int fact = 1;
        if(n == 0)
        {
            System.out.println(1);
        }
        else if(n < 0)
        {
            System.out.println("Number should be non-negative");
        }
        else
        {
            for(int i=1; i<=n;i++)
            {
                fact= fact * i;
            }
            System.out.println("Factorial of a "+ n + " is "+fact);
        }
    }
}