interface InterFaceExample
{
    int val = 10;
    void show();
}
public class Interface implements InterFaceExample
{
    public void show()
    {
        System.out.println("Coding Ninjas");
    }

    public static void main(String args[])
    {
        Interface t = new Interface();
        t.show();
        System.out.println(val);
    }
}