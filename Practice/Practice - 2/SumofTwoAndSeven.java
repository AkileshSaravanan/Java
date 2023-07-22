import java.util.Scanner;
public class SumofTwoAndSeven
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int n = read.nextInt();
    		 if(n==1 || n==3 || n==5){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }    		
		}
	}
}