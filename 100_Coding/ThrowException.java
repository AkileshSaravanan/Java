//How to throw exception in java Program
import java.util.Scanner;
public class ThrowException
{
    static void validate(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("not valid");
        }
        else
        {
            System.out.println("Welcome to vote For Nation");
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        validate(age);
        System.out.println("You are Elgible to Vote");
    }
}