import java.util.* ;
import java.io.*; 
class Person {
    // Complete the class
    private String name;
    private int age;
    public Person(String name, int age){
        this.name= name;
        this.age= age;
    }
    //Getter and setter methods.
    public void setValue(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getValue(String name){
        return this.name;
    }
    public int getValue(int age){
        return this.age;
    }
}
class PrintNameAge {
    public static void main(String args[]) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        Person pt= new Person(name, age);
        pt.setValue(name, age);
        System.out.println("The name of the person is "+pt.getValue(name)+" and the age is "+ pt.getValue(age)+".");
    }
}