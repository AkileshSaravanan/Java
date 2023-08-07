//How to create constructor overloading in java Program
public class ConstOverload
{ 
    String name;
    ConstOverload() 
    {
        System.out.println("Constructor method called.");
    }
    ConstOverload(String t) 
    { 
        name = t;
    }
    public static void main(String[] args) 
    { 
        ConstOverload cpp = new ConstOverload(); 
        ConstOverload java = new ConstOverload("Java");
        cpp.setName("C++");
        java.getName(); 
        cpp.getName();
    }
    void setName(String t) 
    { 
        name = t;
    }
    void getName() 
    {
        System.out.println("Language name: " + name);
    }
}