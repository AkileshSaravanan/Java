//How to create LinkedList program in java
import java.util.*;
public class LinkedList
{
    public static void main(String args[])
    {
        Linkedal<String> al=new Linkedal<String>();
        al.add("RMSA");//Adding object in LinkedList 
        al.add("RMS");
        al.add("RM"); 
        al.add("KNR");
        Iterator<String> itr=al.iterator(); 
        while(itr.hasNext())
        { 
            System.out.println(itr.next());
        }
    }
}