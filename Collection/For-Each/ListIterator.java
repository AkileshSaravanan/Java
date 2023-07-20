import java.util.*;
public class ListIterator
{
	public static void main (String[] args)
	{
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        
        ListIterator<String> iterator = myList.listIterator();
        
        while(iterator.hasNext()) {
            String fruit = iterator.next();
            if(fruit.equals("Banana")) {
                iterator.remove();
            }
            if(fruit.equals("Orange")) {
                iterator.add("Grapefruit");
            }
            if(fruit.equals("Apple")) {
                iterator.set("Pear");
            }
        }
        
        while(iterator.hasPrevious()) {
            String fruit = iterator.previous();
            System.out.println(fruit);
        }
        
        iterator.add("Mango");
        
        System.out.println(myList);
	}
}

/*
 * Output
Grapefruit
Orange
Pear
[Mango, Pear, Orange, Grapefruit]
 */