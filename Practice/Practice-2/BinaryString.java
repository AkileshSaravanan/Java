// Update the '_' in the code below to solve this problem
import java.util.Scanner;
public class BinaryString
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		String a = read.next();
    		String b = read.next();
    		
    		// variables to store the count of '1's in A & B and count of indices where a.charAt(l)=b.charAt(l)
            int a_count = 0;        
            int b_count = 0;        
            int common = 0;
            
            //Count '1s' in a
            for(int j=0; j<a.length(); j++){
    		    if(a.charAt(j) == '1'){
    		        a_count = a_count +1;
    		    }
    		}
    		// Count '1s' in b
    		for(int k=0; k<b.length(); k++){
    		    if(b.charAt(k) == '1'){
    		        b_count = b_count + 1;
    		    }
    		}
    		
    		// count of indices where a.charAt(l) = b.charAt(l)
    		int l=0;
    		int n = a.length();
    		while(l<n){
    		    if(a.charAt(l) == b.charAt(l)){
    		        common = common + 1;
    		    }
    		    l++;
    		}
    		System.out.println(a_count + " " + b_count + " " + common);
		}
	}
}