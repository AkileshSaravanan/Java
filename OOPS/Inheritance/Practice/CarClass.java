import java.io.*;
import java.util.* ;
import java.util.*;
class Car {
    int noOfGear;
    String color;
    Car(int g,String c)
    {        
        noOfGear=g;
        color=c;  
    }

}
class RaceCar extends Car {
    int maxSpeed;
    RaceCar(int g,String c,int m)
    {
        super(g,c); 
        maxSpeed=m;   
    }     
    void printCarInfo()
    {     
        System.out.println("noOfGear: "+noOfGear);        
        System.out.println("color: "+color);            
        System.out.println("maxSpeed: "+maxSpeed);        
    }    
}
class CarClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int noOfGear = sc.nextInt();
        sc.nextLine();
        String color = sc.nextLine();
        int maxSpeed = sc.nextInt();
        RaceCar raceCar = new RaceCar(noOfGear, color, maxSpeed);
        raceCar.printCarInfo();
    }
}