public class Max
{
    public static int max(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public static void main(String args[])
    {
        int a = 10;
        int b = 20;
        int maximum = max(a,b);
        System.out.println(maximum);
    }

}