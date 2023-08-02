//How to convert Fahrenheit to Celsius Program in java
import java.util.Scanner;
public class FahernhitToCelsius
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter temperatue in Fahrenheit");
        float temperature= s.nextFloat();
        temperature = ((temperature - 32)*5/9);
        System.out.println("Temperature in Ceslsius :" + temperature);
    }
}