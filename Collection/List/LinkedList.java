import java.util.*;
public class LinkedList
{
	public static void main (String[] args)
	{
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("Finish Report");
        myList.addFirst("Call Client");
        myList.addLast("Send Email");
        System.out.println(myList);
        
        String Element = myList.remove();
        System.out.println(Element);
        myList.addFirst("Call Client");
        

        String firstElement = myList.removeFirst();
        System.out.println(firstElement);
        
        
        String lastElement = myList.removeLast();
        
        myList.set(0, "Send Email"); // "Call Client" is replaced with "Send Email"
        
        System.out.println(myList);

	}
}
