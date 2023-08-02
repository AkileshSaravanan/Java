//How to swap 2 no using 3rd variable Program in java
import java.util.Scanner;
public class SwapTwoNo
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("After Swapping a is "+ a + " and b is " + b);
    }
}