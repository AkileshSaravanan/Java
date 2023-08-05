//How to Mulltiply two matrix in java Program
import java.util.Scanner;
public class MultiplyTwoMatrix
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int first[][] = new int [10][10];
        int second[][] = new int [10][10];
        int mul[][] = new int [10][10];
        System.out.println("Enter the no of rows and columns of First Matrix:");
        int m = s.nextInt();
        int n = s.nextInt();                
        System.out.println("Enter Elements of First Matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                first[i][j] = s.nextInt(); 
            }
        }
        System.out.println("Enter the no of rows and columns of second Matrix:");
        int p = s.nextInt();
        int q = s.nextInt();
        System.out.println("Enter Elements of Second Matrix");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
            {
                second[i][j] = s.nextInt(); 
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<q;k++)
                {
                    mul[i][j] += first[i][k] * second [k][j];
                }                 
            }
        }
        System.out.println("The Multiplication of Two Matrix is :");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<q;j++)
            {
                System.out.print(mul[i][j]+"\t"); 
            }
            System.out.println();
        }
    }
}