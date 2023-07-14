import java.util.*;
class Factorial { 
    public static void main(String args[]) {
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0)
		{
        System.out.println("Error");
        }
		else
		{
            for( int i=1 ; i<=num; i++ )
			{
                factorial*=i;
            }
        System.out.println(factorial);
        }
    }
}