import java.util.*;
public class Divisor
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		int ele;
		for(int i=0; i<t; i++)
		{
    		int n = read.nextInt();
    		ArrayList<Integer> a = new ArrayList<Integer>();
    		int j=1;
            while(j<=n){
                // check if n is divisible by each i
                if(n%j == 0){
                    //append each i to the ArrayListlist which meets this condition
                    a.add(j);
                }
                j++;
            }
            for(int k=0; k<a.size(); k++){
                System.out.print(a.get(k) + " ");
            }
            System.out.print("\n");
		}
	}
}