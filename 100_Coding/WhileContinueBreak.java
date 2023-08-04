//While loop using break and continue Program in java
import java.util.Scanner;
public class WhileContinueBreak
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n;
        while(true)
        {
            System.out.println("Input an integer");
            n = s.nextInt();
            if(n!=0)
            {
                System.out.println("You entered"+n);
                continue;
            }
            else
            {
                break;
            }
        }

    }
}