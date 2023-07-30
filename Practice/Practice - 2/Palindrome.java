import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = "";
	int count=0;
        for(int i=a.length()-1;i>=0;i--)
        {
            b = b + Character.toString(a.charAt(i));
        }
        System.out.println(b);
        for(int i=0;i<a.length();i++){
		if(a.charAt(i)==b.charAt(i)){
			count=count+1;
		}
	}
	if(count==a.length()){
		System.out.println("It is a palindrome");
	}
	else{
		System.out.println("It is not a palindrome");
	}
    }
}