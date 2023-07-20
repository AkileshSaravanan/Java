import java.util.*;

public class LinkedHashMap
{
	public static void main (String[] args)
	{
        Map<String, Integer> cart = new LinkedHashMap<>();
        
        cart.put("apple", 1);
        cart.put("orange", 2);
        cart.put("banana", 3);
        
        int orangeCount = cart.get("orange");
        
        System.out.println(orangeCount);
        System.out.println(cart);
	}
}

/*
 * Output
 * 2
{apple=1, orange=2, banana=3}
 */