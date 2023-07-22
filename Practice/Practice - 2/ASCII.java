import java.util.*;
public class ASCII
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
		    String a= read.next();
		    for(int j=0; j<a.length(); j++){
		        // To find ASCII value, store the character in an integer variable.
		        int ascii = a.charAt(j);
		        System.out.print(ascii + " ");
		    }
		    System.out.print("\n");
		}
	}
}