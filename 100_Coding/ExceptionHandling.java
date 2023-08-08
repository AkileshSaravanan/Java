//Exception Handling java Program
import java.util.Scanner;
public class ExceptionHandling
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        try {
            int result = a / b;
            System.out.println("Result : "+result);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Exception caught: Division by zero.");
        }
    }
}