import java.util.*;
public class CharToString
{
    public static void main(String args[])
    {
        char ch = 'c';
        String st = Character.toString(ch);
        System.out.println("The String is : "+st);
        char [] chars = {'A','k','i','l','e','s','h'};
        String str1 = String.valueOf(ch);
        String str2 = new String(chars);
        System.out.println(str1);
        System.out.println(str2);
        String str3 = "This is great";
        char [] charArray = str3.toCharArray();
        System.out.println(Arrays.toString(charArray));
    }
}