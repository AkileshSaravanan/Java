import java.util.Scanner;
public class AddTwoNo
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the First No: ");
        int a = s.nextInt();
        System.out.print("Enter the Second No: ");
        int b = s.nextInt();
        int c = a + b;
        System.out.println("The Addition of Two No:"+c);
    }
}