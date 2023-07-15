/**With Different number of Arguments
class MethodOverloadingExample
{
    public int multiply(int num1, int num2)
    {
        return num1* num2;
    }
    public int multiply(int num1, int num2, int num3)
    {
        return num1*num2*num3;
    }
}
public class MethodOverloading
{
    public static void main(String args[])
    {
        MethodOverloadingExample obj = new MethodOverloadingExample();
        int ProdofTwo = obj.multiply(10,20);
        int ProdofThree = obj.multiply(10,20,30);
        System.out.println(ProdofTwo);
        System.out.println(ProdofThree);
    }
}
**/
 
//With different types of arguments

class MethodOverloadingExample
{
    public int multiply(int num1, int num2)
    {
        return num1* num2;
    }
    public double multiply(double num1, double num2)
    {
        return num1*num2;
    }
}
public class MethodOverloading
{
    public static void main(String args[])
    {
        MethodOverloadingExample obj = new MethodOverloadingExample();
        int ProdofTwo = obj.multiply(10,20);
        double ProdofThree = obj.multiply(10.0,20.0);
        System.out.println(ProdofTwo);
        System.out.println(ProdofThree);
    }
}