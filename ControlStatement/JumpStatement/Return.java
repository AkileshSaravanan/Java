public class Return
{
    public static int findSum(int num1, int num2)
    {
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[])
    {
        Return obj = new Return();
        System.out.println(obj.findSum(10,20));
    }
}