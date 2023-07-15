import java.util.* ;
import java.io.*; 
class Grandfather
{
    String gfname;
    public Grandfather(String n)
	{
        this.gfname = n;
    }
}
class Father extends Grandfather
{
    String fname;
    public Father(String f,String s3)
	{
        super(s3);
        this.fname = f;
    }
}
class Son extends Father
{
    String sname;
    public Son(String s1,String s2,String s3)
	{
        super(s2,s3);
        this.sname = s1;
    }
    public void printName()
	{
        System.out.println("sonname: "+sname);
        System.out.println("fathername: "+fname);
        System.out.println("grandfather: "+gfname);
    }
}
class Multilevel{
    public static void main(String args[]) {
        Son s = new Son("Saurabh","Ramesh","Suresh");
        s.printName();
    }
}