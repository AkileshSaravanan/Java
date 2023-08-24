import java.util.Scanner;
public class Flipcards
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int n = read.nextInt();
    		int x = read.nextInt();
    		// Update your code below this line to solve the problem
    		int option1 = x;
    	    int option2 = n-x;
    	    System.out.println(Math.min(option1, option2));
    		

    		
		}
	}
}