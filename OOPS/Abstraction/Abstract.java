abstract class School
{
    public void show()
    {
        System.out.println("School Application");
    }
    abstract int getAdmissionFee();
}
class DAV extends School{
    int getAdmissionFee()
    {
        return 45000;
    }
}
class DPS extends School{
    int getAdmissionFee()
    {
        return 35000;
    }
}
class JNV extends School{
    int getAdmissionFee()
    {
        return 1000;
    }
}
public class Abstract
{
    public static void main(String args[])
    {
        School s; 
        s = new DAV();
        System.out.println("DAV Fee:"+s.getAdmissionFee());
        s = new DPS();
        System.out.println("DPS Fee:"+s.getAdmissionFee());
        s = new JNV();
        System.out.println("JNV Fee:"+s.getAdmissionFee());
    }
}

