//How to create TreeMap program in java
import java.util.*;
class TreeMapInterface
{
    public static void main(String args[])
    {
        TreeMap<Integer,String> hm=new TreeMap<Integer,String>(); 
        hm.put(100,"RMSA");
        hm.put(102,"RMS");
        hm.put(101,"RM");
        hm.put(103,"KNR"); 
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}