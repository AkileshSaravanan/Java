class Parent
{
    public void show()
    {
        System.out.println("Inside Parent Class");
    }
}
class subclass1 extends Parent
{
    public void show()
    {
        System.out.println("Inside subclass1");
    }
}
class subclass2 extends Parent
{
    public void show()
    {
        System.out.println("Inside subclass2");
    }
}

public class MethodOverriding
{
    public static void main(String args[])
    {
        Parent p;

        p= new subclass1();
        p.show();

        p=new subclass2();
        p.show();
    }
}