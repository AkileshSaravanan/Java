import java.util.* ;
import java.io.*; 
class SI {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int pi = s.nextInt();
		float r = s.nextFloat();
		int t = s.nextInt();
		int si = ((int)(pi * r * t)/100);
		System.out.println(si);
	}
}