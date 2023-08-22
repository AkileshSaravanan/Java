//How to create LinkedHashMap program in java
import java.util.*;
class LinkedHashMapInterface
{
    public static void main(String args[])
    {
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>(); 
        hm.put(100,"Rajendra");
        hm.put(101,"Vijay");
        hm.put(102,"Technolamror");
        for(Map.Entry m:hm.entrySet())
        { 
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}