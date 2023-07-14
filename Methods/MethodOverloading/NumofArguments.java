public class NumofArguments
{
    public static int add(int num1,int num2)
    {
        return num1+num2;
    }
    public static int add(int num1,int num2, int num3)
    {
        return num1+num2+num3;
    }
    public static void main(String args[])
    {
        int sumTwo = NumofArguments.add(10,20);
        int sumThree = NumofArguments.add(10,20,30);
        System.out.println(sumTwo);
        System.out.println(sumThree);
    }
}