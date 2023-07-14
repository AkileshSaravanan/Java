import java.util.Scanner;
class AreaRect {
   public static void main (String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   int L = scanner.nextInt();
	   int B = scanner.nextInt();
	   int area = L*B;
	   System.out.println(area);
   }
}