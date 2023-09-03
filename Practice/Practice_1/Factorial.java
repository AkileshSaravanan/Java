/*import java.util.*;
public class Factorial
{
     public static void main(String []args)
     {       
        Scanner sc=new Scanner(System.in);       
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of the number: "+fact); 
     }  
}
*/

//using recursively
import java.util.Scanner;
public class Factorial
{
    public static int findFactorial(int num)
    {
        if(num==0)
        return 1;
        else if(num==1)
        return 1;
        else
        return num*findFactorial(num-1);        
    }  
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();   
        if(num>=0) 
        {
          
           int factorial=findFactorial(num);
           System.out.println("The factorial of the entered number is :"+factorial);
        }        
        else
        {
            System.out.println("Factorial not possible.");
            System.out.println("Please enter valid input.");
        } 
    }
   

}