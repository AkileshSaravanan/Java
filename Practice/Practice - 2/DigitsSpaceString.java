import java.util.Scanner;
public class DigitsSpaceString
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		String n = read.next();
    		// Loop through and print each character of the String
    		for(int j=0; j<n.length(); j++){
    		    System.out.print(n.charAt(j) + " ");
    		}
    		System.out.println();
		}
	}
}