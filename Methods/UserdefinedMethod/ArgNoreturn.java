public class ArgNoreturn
{
    public static void checkEvenOdd(int num)
    {
        if(num%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    public static void main(String args[])
    {
        int num=24;
        checkEvenOdd(num);
    }
}
