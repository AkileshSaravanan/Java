//Find Length, Concatenate and Replace String in Java Program
public class LenReplConcate
{
    public static void main(String args[])
    {
        int n;
        String s = "Java programming", t = "", u = "";
        System.out.println(s);
        // Find length of string
        n = s.length();
        System.out.println("Number of characters = " + n);
        // Replace characters in string
        t = s.replace("Java", "C++"); 
        System.out.println(s); 
        System.out.println(t);
        u = s.concat(" is fun"); 
        System.out.println(s); 
        System.out.println(u);
    }
}