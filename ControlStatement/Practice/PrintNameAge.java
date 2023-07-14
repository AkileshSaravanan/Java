import java.util.Scanner;
public class PrintNameAge {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		int age = s.nextInt();
		System.out.print("The name of the person is "+ name + " and the age is "+ age+".");		
	}
}