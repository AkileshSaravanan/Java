//Java for loop program
import java.util.Scanner;
public class PrintTenNo {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i<= n; i++) 
        {
            System.out.println(i);
        }
    }
}