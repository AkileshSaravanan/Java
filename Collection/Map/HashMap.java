import java.util.*;
class HashMap
{
	public static void main (String[] args)
	{
        HashMap <String, Integer> phoneNumbers = new HashMap <String, Integer>();
        
        phoneNumbers.put("Alice", 123456789);
        phoneNumbers.put("Bob", 987654321);
        
        int aliceNumber = phoneNumbers.get("Alice");
        System.out.println(aliceNumber);
	}
}

/*  OUTPUT
123456789
*/