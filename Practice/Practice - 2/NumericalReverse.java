import java.util.Scanner;
public class NumericalReverse
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		String a = read.next();
    		String b = read.next();
    		int j = 0;
    		int n = a.length();
    		// Flag is a very imporant tool in programming problems - you will come across various examples in later problems as well
    		int flag = 0;
    		
    		while(j<n){
    		    //Checking 'a' from left to right and 'b' from right to left
    		    if(a.charAt(j) == b.charAt(n-j-1)){
    		        j++;
    		    }
    		    else{
    		        // If specific character in 'a' and 'b' do not match, then they can't be reverse of each other
    		        flag = 1;
    		        break;
    		    }
    		}
    		if(flag == 1){
    		    System.out.println("NO");
    		}
    		else{
    		    System.out.println("YES");
    		}
		}
	}
}