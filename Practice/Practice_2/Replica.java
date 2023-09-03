import java.util.Scanner;
public class Replica
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		String s = read.next();
    		String a = "";
    		
    		// Write the code below this line to generate String A
    		for(int j=0;j<s.length();j++)
    		{
    		    a = a + s.charAt(j);
    		}
    		
    		String b = "";
    		// Write the code below this line to generate String B
    		for(int k = 0; k<s.length();k++)
    		{
    		    b = a.charAt(k)+b;
    		}
    		System.out.println(a);
    		System.out.println(b);
		}
	}
}