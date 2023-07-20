import java.util.*;

public class Practice
{
	public static void main (String[] args)
	{
        Map<String, Double> map = new TreeMap<>();
        
        map.put("Bob", 6.0);
        map.put("Charlie", 5.9);
        map.put("Alice", 5.6);
        
        map.remove("Charlie");
        
        System.out.println(map);
	}
}

/*
 * Output
 * {Alice=5.6, Bob=6.0}
 */