import java.util.Scanner;
public class SimpleInterset
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal Amount: ");
        int p =  s.nextInt();
        System.out.print("Enter the rate of interset: ");
        int  r = s.nextInt();
        System.out.print("Enter the No of years: ");
        int t = s.nextInt();
        int SI = (p * t * r) / 100;
        System.out.println("Simple Interset amount " + p + " of " + r +" of interset " + t +" years is : "+SI);
    }
}