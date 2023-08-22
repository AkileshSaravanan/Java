//How to create HashMap using map interface program in java
import java.util.*;
class HashMapInterface
{
    public static void main(String args[])
    { 
        Map<Integer,String> map=new HashMap<Integer,String>(); 
        map.put(100,"RMSA");
        map.put(101,"RMS");
        map.put(102,"RM"); 
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}