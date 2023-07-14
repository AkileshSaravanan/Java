import java.util.* ;
import java.io.*; 
class Totalsalary{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int basic = s.nextInt();
		char ch = s.next().charAt(0);
		float hra = ((float)20*basic/(float)100);
		float da = ((float)50*basic/(float)100);
		float pf = ((float)11*basic/(float)100);
		int allow;
		if(ch=='A')
		{
			allow=1700;
		}
		else if(ch=='B')
		{
			allow=1500;
		}
		else
		{
			allow=1300;
		}
		float total = basic + hra + da + allow - pf; 
		System.out.println(Math.round(total));		
	}
}