import java.util.* ;
import java.io.*; 
class Quadrantofcoordinate {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if (x > 0 && y > 0) 
		{
			System.out.println("1st Quadrant");
        } 
		else if (x < 0 && y > 0) 
		{
			System.out.println("2nd Quadrant");
        } 
		else if (x < 0 && y < 0) 
		{
			System.out.println("3rd Quadrant");
        } 
		else if (x > 0 && y < 0)
		{
			System.out.println("4th Quadrant");
        }  
		else if (x == 0 && y != 0) 
		{
			System.out.println("y axis");
        } 
		else if (x != 0 && y == 0) 
		{
			System.out.println("x axis");
        }
		else 
		{
			System.out.println("Origin");
        }
	}
}