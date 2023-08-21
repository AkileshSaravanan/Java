//Create ArrayList program in java
import java.util.*; 
class ArryaLists
{
    public static void main(String args[]){
    ArrayList<String> list=new ArrayList<String>();//Creating arraylist 
    list.add("RMSA");//Adding object in arraylist 
    list.add("RMS");
    list.add("RM");
    list.add("KNR");
    //Traversing list through Iterator 
    Iterator itr=list.iterator(); 
    while(itr.hasNext())
    { 
        System.out.println(itr.next());
    }
    }
}