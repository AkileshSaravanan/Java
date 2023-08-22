//How to create TreeSet program in java
import java.util.*;
class TreeSets
{
    public static void main(String args[])
    {
    //Creating TreeSet and adding elements 
    TreeSet<String> set=new TreeSet<String>(); 
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