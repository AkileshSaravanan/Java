import java.util.Scanner;
public class Factorial
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter the No of Factorial: ");
        int n = s.nextInt();
        for(int i =1;i<=n;i++)
        {
            fact = fact *i;
        }
        System.out.println("Factorial of "+ n +" is "+fact);
    }
}