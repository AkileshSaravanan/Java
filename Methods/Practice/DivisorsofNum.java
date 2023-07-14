import java.util.* ;
import java.io.*; 
import java.util.Scanner;
public class DivisorsofNum {
	public static void printDivisor(int n)
	{
		for (int i=1;i<=n;i++)
		{
			if(n%i == 0)
			{
				System.out.print(i+" ");
			}
		}
}
public static void main(String args[]) 
	{
		DivisorsofNum obj = new DivisorsofNum();
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		obj.printDivisor(n);
	}
}