//Print prime no Program in java
import java.util.*;
public class PrimeNumber
{    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = s.nextInt();        
        if(n == 1) 
        {
            System.out.println(n +" is not Prime Number");
            return;
        }
        for(int i=2;i<n;i++) {
            if(n % i == 0) {
                System.out.println(n +" is not Prime Number");
                return;
            }
        }
        System.out.println(n +" is a Prime Number");
    }
}