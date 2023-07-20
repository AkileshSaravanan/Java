import java.util.*;
public class TreeMap
{
	public static void main (String[] args)
	{
        Map<String, Integer> grades = new TreeMap<>();
        
        grades.put("Alice", 90);
        grades.put("Charlie", 80);
        grades.put("Bob", 70);
        
        int aliceGrade = grades.get("Alice");
        System.out.println(aliceGrade);
        // Notice how the map is sorted
        System.out.println(grades);
	}
}

/*
 * OUTPUT
 * 90
{Alice=90, Bob=70, Charlie=80}
 */