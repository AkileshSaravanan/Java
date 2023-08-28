import java.util.Scanner;
public class MaximumOfTwo
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the First No: ");
        int a = s.nextInt();
        System.out.print("Enter the Second No: ");
        int b = s.nextInt();
        if(a>b)
        {
            System.out.println(a + " is greater than "+ b);
        }
        else
        {
            System.out.println(b + " is greater than "+ a);
        }
    }
}