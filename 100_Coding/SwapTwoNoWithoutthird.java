//How to swap 2 no without using 3rd variable Program in java
import java.util.Scanner;
public class SwapTwoNoWithoutthird
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}