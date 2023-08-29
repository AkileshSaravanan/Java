import java.util.Scanner;
public class EvenOdd
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Noumber: ");
        int num = s.nextInt();     
        if(num % 2 == 0)
        {
            System.out.println(num +" is Even");
        }
        else
        {
        System.out.println(num + " is Odd");
        }
    }
}