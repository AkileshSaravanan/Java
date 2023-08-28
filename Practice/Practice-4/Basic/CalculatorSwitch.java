import java.util.Scanner;
public class CalculatorSwitch
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the First No: ");
        double a = s.nextDouble();
        System.out.print("Enter the Second No: ");
        double b = s.nextDouble();
        System.out.println("Enter an operator (+,-,*,/): ");
        char oper = s.next().charAt(0);
        double c;
        switch (oper) {
            case '+':
                c = a + b;
                break;
            
            case '-':
                c = a - b;
                break;
            
            case '*':
                c = a * b;
                break;

            case '/':
                c = a / b;
                break;
        
            default:
                System.out.println("You have entered wrong operator");
                break;
        }
        System.out.println(a + " " + oper + " " + b + "= " + c);
    }
}