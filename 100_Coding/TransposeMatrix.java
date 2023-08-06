//How to get transpose of matrix in java Program
//How to Mulltiply two matrix in java Program
import java.util.Scanner;
public class TransposeMatrix
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of rows and columns of Matrix:");
        int m = s.nextInt();
        int n = s.nextInt(); 
        int origi[][] = new int [m][n];
        int transp[][] = new int [m][n];                       
        System.out.println("Enter Elements of Matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                origi[i][j] = s.nextInt(); 
            }
        }
        System.out.println("\n----Original Matrix----");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(origi[i][j]+ "\t");
            }
        System.out.println();
        }        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                transp[j][i] = origi[i][j];                
            }
        }
        System.out.println("\n----Transpose of Matrix----");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(transp[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}