import java.util.Scanner;
public class StringEmptyNull {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str1 = s.nextLine();
        String str2 = "";
        String str3 = null;
        boolean b;
        b = (str1 == null || str1.length() == 0);
        System.out.println("String 1 is null or empty? " + b);

        b = (str2 == null || str2.length() == 0);
        System.out.println("String 2 is null or empty? " + b);

        b = (str3 == null || str3.length() == 0);
        System.out.println("String 3 is null or empty? " + b);
    }
}