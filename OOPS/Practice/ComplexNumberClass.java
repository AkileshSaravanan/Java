import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class ComplexNumbers {
	    int a1,a2,b1,b2,a3,b3;
    public void Plus()
    {
        a3=a1+a2;
        b3=b1+b2;
    }
    public void Multiply()
    {
        a3=((a1*a2)+((-1)*b1*b2));
        b3=((a1*b2)+(b1*a2));
    }
    public void Print()
    {
        System.out.print(a3+" + i"+b3);
	}	
}
class ComplexNumberClass {	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int c=sc.nextInt();
        ComplexNumbers obj=new ComplexNumbers();
        obj.a1=x1;
        obj.b1=y1;
        obj.a2=x2;
        obj.b2=y2;
        if(c==1)
        {
            obj.Plus();
            obj.Print();
        }
        else if(c==2)
        {
            obj.Multiply();
            obj.Print();
        }  
	}
}
		