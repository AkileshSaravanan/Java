class Animal
{
    public void eat()
    {
        System.out.println("Eating");
    }
}
class Dog extends Animal
{
    public void bark()
    {
        System.out.println("Barking");
    }
}
class BabyDog extends Dog
{
    public void weep()
    {
        System.out.println("Weeping");
    }
}
public class Multilevel
{
    public static void main(String args[])
    {
        BabyDog obj = new BabyDog();
        obj.eat();
        obj.bark();
        obj.weep();
    }
}