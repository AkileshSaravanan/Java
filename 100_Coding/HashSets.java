//How to create Hashset program in java
import java.util.*;
class HashSets
{
    public static void main(String args[])
    {
    //Creating HashSet and adding elements 
    HashSet<String> set=new HashSet<String>(); 
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