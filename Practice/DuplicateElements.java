import java.util.ArrayList;
import java.util.HashSet;
public class DuplicateElements
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        HashSet<String> set = new HashSet<>(list);
        System.out.println(set);
    }
}