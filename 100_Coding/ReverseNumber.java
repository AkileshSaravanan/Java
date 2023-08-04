//Print Reverse number in java program
import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int reverse = 0;
        while(n != 0)
        {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        System.out.println("The reverse of a number is: "+ reverse);
    }
}