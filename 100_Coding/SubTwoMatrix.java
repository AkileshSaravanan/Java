//How to sub two matrix in java Program
import java.util.Scanner;
public class SubTwoMatrix
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int m = s.nextInt();
        System.out.println("Enter the no of columns");
        int n = s.nextInt();
        int first[][] = new int [m][n];
        int second[][] = new int [m][n];
        int sub[][] = new int [m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                first[i][j] = s.nextInt(); 
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                second[i][j] = s.nextInt(); 
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                sub[i][j] = first[i][j] - second [i][j]; 
            }
        }
        System.out.println("The Sub of Two Matric is :");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(sub[i][j]+"\t"); 
            }
            System.out.println();
        }
    }
}