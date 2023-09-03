import java.util.Scanner;
public class Movie2x
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int x = read.nextInt();
	    int y = read.nextInt();
	    System.out.println((x-y)+(y/2));	   
	}
}