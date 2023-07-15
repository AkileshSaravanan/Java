interface Interface1
{
    default void show()
    {
        System.out.println("Default Interface1");
    }
}
interface Interface2
{
    default void show()
    {
        System.out.println("Default Interface2");
    }
}
public class MultipleInheritance implements Interface1,Interface2
{
    public void show()
    {
        Interface1.super.show();
        Interface2.super.show();
    }
    public static void main(String args[])
    {
        MultipleInheritance obj = new MultipleInheritance();
        obj.show();
    }
}