import java.util.Scanner;
public class NoofOccurence 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");    
        String str = s.nextLine();
        char ch = 'o';
        int cnt = 0;
        for ( int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                cnt++;
        }
        System.out.println("Occurrences of "+ch+" are " +cnt);
    }
}
