//How to read data from text file using java program
import java.io.FileInputStream;
public class ReadData 
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream fin=new FileInputStream("E:\\Java\\100_Coding\\Java\\100_Coding\\Hello.txt");
            int i=fin.read(); 
            System.out.print((char)i);
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}