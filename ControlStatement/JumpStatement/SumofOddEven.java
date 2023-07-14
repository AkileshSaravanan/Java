import java.lang.*;
import java.util.*;
class SumofOddEven {    
    public static void main(String args[]) 
	{        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        while(number>0)
		{
            int digit = number%10;
            if(digit%2==0)
			{
                evenSum+=digit;
            }else
			{
                oddSum+=digit;
            }
            number = number/10;
        }
        System.out.print(evenSum+"\t"+oddSum+"\n");
    }
}