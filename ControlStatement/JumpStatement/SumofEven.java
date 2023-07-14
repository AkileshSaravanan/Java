import java.util.* ;
import java.io.*; 
public class SumofEven {
	public static long evenSumTillN(int n) {
		// Write your code here.
		return (long)(n/2)*(n/2+1);
	}
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenSumTillN(n);
    }
}