//Grading using MarkNestedIfElse
import java.util.Scanner;
public class MarkNestedIfElse
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int marksobtained, passingmarks;
        System.out.println("Enter the marks:");
        marksobtained = s.nextInt();
        char grade;
        passingmarks = 40;
        if(marksobtained >= passingmarks)
        {
            if(marksobtained > 90)
            {
                    grade = 'A';
            }
            else if (marksobtained > 80)
            {
                grade = 'B';
            }
            else if(marksobtained  > 70)
            {
                grade = 'C';
            }
            else if(marksobtained > 60)
            {
                grade = 'D';
            }
            else
            {
                grade = 'E';           
                
            }
            System.out.println("The grade is : "+grade);
        }
        else
        {
            grade = 'F';
            System.out.println("He Got Failed and Grade is : "+grade);
        }
    }
}