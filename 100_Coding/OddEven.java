//How to check Odd and Even Number in java.
import java.util.Scanner;
public class OddEven
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = s.nextInt();
        if(number%2 == 0)
        {
            System.out.println(number + " is a Even");
        }
        else
        {
            System.out.println(number +" is a Odd");
        }
    }
}