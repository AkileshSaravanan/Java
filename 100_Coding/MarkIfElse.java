//If Else
import java.util.Scanner;
public class MarkIfElse
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int marks = s.nextInt();
        int passingmarks = 40;
        if(marks > passingmarks)
        {
            System.out.println("You are Passed");
        }
        else
        {
            System.out.println("Unfortunately you are not passed!");
        }
    }
}