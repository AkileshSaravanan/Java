import java.util.*;
public class Iterator
{
	public static void main (String[] args)
	{
        ArrayList<String> names = new ArrayList<String>();
        
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        
        Iterator<String> iterator = names.iterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}
}

/*
 * Output
John
Jane
Bob
 */