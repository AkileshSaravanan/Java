public class LabeledBreak
{
    public static void main(String args[])
    {
        boolean b = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before the break statement ");
                    if(b)
                    {
                        break second;
                    }
                    System.out.println("This would not be execute");
                }
            System.out.println("This would not be execute");
            }
        System.out.println("This is after the sceond block");
        }
    }
}