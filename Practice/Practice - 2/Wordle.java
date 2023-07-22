import java.util.Scanner;
public class Wordle
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		for(int i=0; i<n; i++)
		{
    		String s = read.next();
    		String t = read.next();
    		String m = "";
    		int j = 0;
            while(j < s.length()){
                // If the i element in S and T are the same, then the i element in M is G
                if(s.charAt(j) == t.charAt(j)){
                    m = m + 'G';
                }
                // If the i element in S and T are not the same, then the i element in M is B
                else{
                    m = m + 'B';
                }
                j = j + 1 ;
            }
            System.out.println(m);

    		
		}
	}
}