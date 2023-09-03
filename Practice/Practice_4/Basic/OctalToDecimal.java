import java.util.Scanner;
public class OctalToDecimal
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String octal = s.nextLine();
        int decimal = Integer.parseInt(octal,8);
        System.out.println("Converted decimal number of "+ octal + " is : "+decimal);
    }
}