class Parent
{
    public static void show()
    {
        System.out.println("Insidie parent class");
    }
}
class Child extends Parent
{
    public static void show()
    {
        System.out.println("Insidie subclass");
    }
}
public class MethodHiding
{
    public static void main(String args[])
    {
        Parent p = new Parent();
        p.show();
        Parent c = new Parent();
        c.show();
    }
}