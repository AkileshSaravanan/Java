import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class CountPrime {
	   String isPrime(int p)
	   {
        int count=0;
        for(int i=2;i<p;i++){
            if(p%i==0){
                count++;
            }
        }
        if(count==0){
            return "True";
        }
        else{
            return "False";
        }
    }
    int totalPrime(int s, int e){
        int c=0;
        CountPrime oq= new CountPrime();
        for(int i=s;i<=e;i++){
            if(oq.isPrime(i)=="True"){
                c++;
            }
        }
        return c;
    }
 }
public class TotalPrime {
	public static void main(String args[]) {	
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}