//Print Multiplication table Program in java
import java.util.Scanner;
public class MultiplicationTable
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter hte number:");
        int n = s.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n + "x" + i + "=" + (n*i));
        }
    }
}