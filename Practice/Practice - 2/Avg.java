import java.util.Scanner;
public class Avg
{
	public static void main (String[] args)
	{
	    Scanner read = new Scanner(System.in);
	    int t = read.nextInt();
	    for(int i=0; i<t; i++){
	        int a = read.nextInt();
	        int c = read.nextInt();
	        // Use your sub-components below this line to solve the problem
	        if(((a%2==0) && (c%2==0)) || ((a%2!=0) && (c%2!=0)))
	        {
	            System.out.println((a+c)/2);
	        }
	        else
	        {
	            System.out.println(-1);
	        }
	        

	        
	    }
	}
}
