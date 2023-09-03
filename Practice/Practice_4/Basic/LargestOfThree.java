import java.util.Scanner;
public class LargestOfThree
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = s.nextInt(); 
        System.out.print("Enter the Second Number: ");
        int b = s.nextInt();  
        System.out.print("Enter the Third Number: ");
        int c = s.nextInt();
        int temp = a > b ? a : b;
        int result = c > temp ? c : temp;
        System.out.println("Largest Number is: "+ result);
    }
}