public class DoubleToString
{
    public static void main(String args[])
    {
        double d = 23.6;
        String s1  = Double.toString(d);
        String s2 = String.valueOf(d);
        System.out.println(s1);
        System.out.println(s2);
    }
}