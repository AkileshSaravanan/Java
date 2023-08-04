//Print Floyd’s Triangle in java Program
import java.util.Scanner;
public class FloyidsTriangle 
{
   public static void main(String args[])
   {
      int n;
      int k = 1;
      System.out.println("Enter the number of lines you need in the FloyidsTriangle");
      Scanner s = new Scanner(System.in);
      n = s.nextInt();
      for(int i = 1; i <= n; i++) 
      {
         for(int j=1;j <= i; j++)
         {
            System.out.print(" "+ k++);
         }
         System.out.println();
      }
   }
}