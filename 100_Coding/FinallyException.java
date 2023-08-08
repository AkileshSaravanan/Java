//Advantage of Finally in Exception Handling java Program
public class FinallyException
{
    public static void main(String args[])
    {
        try
        {
            long data[] = new long[100000000];
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finall block will always executed");

        }
    }
}