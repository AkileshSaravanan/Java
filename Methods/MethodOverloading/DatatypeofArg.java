public class DatatypeofArg
{
    public static int add(int num1,int num2)
    {
        return num1+num2;
    }
    public static double add(double num1,double num2, double num3)
    {
        return num1+num2+num3;
    }
    public static void main(String args[])
    {
        int sumTwo = DatatypeofArg.add(10,20);
        double sumThree = DatatypeofArg.add(10,20,30);
        System.out.println(sumTwo);
        System.out.println(sumThree);
    }
}