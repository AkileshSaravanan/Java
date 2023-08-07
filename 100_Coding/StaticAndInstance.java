//Difference between Static and Instance method working in java Program
class StaticAndInstance {
    public static void main(String[] args) 
    { 
        display();
        StaticAndInstance t = new StaticAndInstance(); 
        t.show(); //calling using object
    }
    static void display() 
    { 
        System.out.println("Programming is amazing.");
    }
    void show()
    {
        System.out.println("Java is awesome.");
    }
}