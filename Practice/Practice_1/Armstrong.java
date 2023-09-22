import java.util.Scanner;
public class Armstrong 
{
    public static void main(String[] args) {
        int num, digit, sum = 0,temp;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System. in );
        num = sc.nextInt();
        temp = num;
        while (temp!= 0)
        {
            digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        if(num == sum)
            System.out.println(num+ " is an Armstrong number");
        else
            System.out.println(num+ " is not an Armstrong number");
    }
}
