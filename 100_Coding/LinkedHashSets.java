////How to create LinkedHashset program in java
import java.util.*;
class LinkedHashSets
{
    public static void main(String args[])
    {
    //Creating HashSet and adding elements 
    LinkedHashSet<String> set=new LinkedHashSet<String>(); 
    set.add("RMSA");
    set.add("RMS");
    set.add("RM"); 
    set.add("KNR");
    //Traversing elements 
    Iterator<String> itr=set.iterator(); 
    while(itr.hasNext())
    { 
        System.out.println(itr.next());
    }
    }
}