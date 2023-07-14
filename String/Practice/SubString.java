import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class SubString {
	
    static void printSubstrings(String input) {
         for (int i = 0; i < input.length(); i++) 
         {        
            String subStr="";
            for (int j = i; j < input.length(); j++)
             {            
                 subStr += input.charAt(j);            
                 System.out.print(subStr +"\n");        
            }    
        }         
    }  
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printSubstrings(input);
	}
}
