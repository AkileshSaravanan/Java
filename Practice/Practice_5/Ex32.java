/*
You are provided two non-empty input strings (inp1 and inp2).
Your task is to return a new string that contains each char before and after every appearance of the inp2 string in the inp1 string. 
For example. If inputs are "abdXY223XYijk" and "XY", output should be "d23r".
*/
import java.util.Scanner;
public class Ex32
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        String s3 = BeforeAfter(s1,s2);
        System.out.println(s3);
    }
    public static String BeforeAfter(String str, String word)
    {
        String result = "";
        for(int i=0;i<str.length();i++)
        {
            if(word.length() == str.length())
            {
                return "";
            }
            else if(i + word.length() == str.length() && str.substring(i,i+word.length()).equals(word))
            {
                result += Character.toString(str.charAt(str.length() - word.length() -1));
                return result;
            }
            else if(i + word.length() < str.length() && str.substring(i,i+word.length()).equals(word))
            {
                if(i==0)
                {
                    
                }
                else
                {
                    result += Character.toString(str.charAt(i - 1));
                }
                result += Character.toString(str.charAt(i + word.length()));
            }
        }
        return result;
    }
}