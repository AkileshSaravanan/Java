import java.util.*;

public class ArrayList
{
	public static void main (String[] args)
	{
	    // Create an ArrayList
		ArrayList<String> code = new ArrayList<>();
		
		// Add elements
		code.add("chef");
        code.add("chefina");
        System.out.println("ArrayList with 2 Strings: " + code);
        
        // Access element
        System.out.println("First element of the ArrayList: " + code.get(0));
        
        // Remove element
        code.remove(0);
        System.out.println("First element removed: " + code);
        
        // Change element
        code.set(0, "code");
        System.out.println("First element changed to: " + code.get(0));
        
        // size of the ArrayList
        System.out.print("Size of/number of elements in the ArrayList: " + code.size());
	}
}

/*
 * Output
ArrayList with 2 Strings: [chef, chefina]
First element of the ArrayList: chef
First element removed: [chefina]
First element changed to: code
Size of/number of elements in the ArrayList: 1
 */