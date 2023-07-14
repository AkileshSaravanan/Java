public class Nestedif
{
    public static void main(String args[])
    {
        int a=20;
        if(a==20)
        {
            if(a<25)
            {
                System.out.println("a is smaller than 25");
            }
            if(a<22)
            {
                System.out.println("a is smaller than 22 too");
            }
            else
            {
                System.out.println("a is greater than 25");    
            }
        }

    }
}