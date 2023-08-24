import java.util.Scanner;
public class NumericalCharacter
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
		    // Treat A as a string instead of an integer
		    String a = read.next();
		    int flag = 0;
		    
            for(int j=0; j<a.length(); j++){
                // If any '0' or '5' is found in the string A - then set flag as 1 and exit the loop
    		    if(a.charAt(j) == '0' || a.charAt(j) == '5'){
    		        flag = 1;
    		        break;
    		    }
    		}
  		    if(flag == 1 ){
  		        System.out.println("Yes");
  		    }
  		    else{
  		        System.out.println("No");
  		    }
		}
	}
}