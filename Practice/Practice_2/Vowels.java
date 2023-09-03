import java.util.Scanner;
public class Vowels
{
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for(int i=0; i<t; i++)
        {
            String s = read.next();
            int j = 0;
            int flag = 0;
            while(j < (s.length() - 2)){
                if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u'){
                    if(s.charAt(j+1)=='a' || s.charAt(j+1)=='e' || s.charAt(j+1)=='i' || s.charAt(j+1)=='o' || s.charAt(j+1)=='u'){
                        if(s.charAt(j+2)=='a' || s.charAt(j+2)=='e' || s.charAt(j+2)=='i' || s.charAt(j+2)=='o' || s.charAt(j+2)=='u'){
                            flag = 1;
                            break;
                        }
                    }
                }
                j++;
            }
            if(flag == 1){
                System.out.println("Happy");
            }
            else{
                System.out.println("Sad");
            }
        }
    }
}