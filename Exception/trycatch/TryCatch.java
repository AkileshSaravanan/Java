import java.util.*;
public class TryCatch
{
	public static void main (String[] args)
	{
        try {
            // Attempt a risky operation
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println(result);
        }
        
        catch (ArithmeticException e) {
            // Catch the exception and handle it
            System.out.println("Oops, an error occurred: " + e.getMessage());
        
        } 
        
        finally {
            // Execute code whether or not an exception was thrown
            System.out.println("This code will always execute!");
        }
	}
}