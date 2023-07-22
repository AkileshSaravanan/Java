import java.util.Scanner;
public class Keplers
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int t1 = read.nextInt();
    		int t2 = read.nextInt();
    		int r1 = read.nextInt();
    		int r2 = read.nextInt();
    		
            double constant1 = (Math.pow(t1, 2))*(Math.pow(r2, 3));
            double constant2 = (Math.pow(t2, 2))*(Math.pow(r1, 3));
            
            if(constant1 == constant2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
		}
	}
}