//How to get IP address from site URL using java program
import java.io.*; 
import java.net.*; 
public class GetIP
{
    public static void main(String[] args)
    {
        try
        {
            InetAddress ip=InetAddress.getByName("www.linkedin.com");
            System.out.println("Host Name: "+ip.getHostName()); 
            System.out.println("IP Address: "+ip.getHostAddress());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}