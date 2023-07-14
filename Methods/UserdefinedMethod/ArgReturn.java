public class ArgReturn
{
    public static int SumofTwoNumbers(int a,int b)
    {
        int sum = a + b;
        return sum;      
    }
    public static void main(String args[])
    {
        int a = 10;
        int b = 20;
        System.out.println(SumofTwoNumbers(a,b));
    }
}
