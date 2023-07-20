import java.util.*;
public class RemoveFirstLast{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

        // Create a ListIterator
        ListIterator<String> iterator = list.listIterator();

        // Remove the first element
        if (iterator.hasNext()) {
            iterator.next(); // Move to the first element
            iterator.remove(); // Remove the first element
        }

        // Remove the last element
        if (iterator.hasNext()) {
            // Check if there is at least one more element in the list
            while (iterator.hasNext()) {
                iterator.next(); // Move the iterator to the next element
            }
            iterator.remove(); // Remove the last element
        }

        System.out.print("Updated list: ");
        for (String element : list) {
            System.out.print(element + " ");
        }
    }
}

/*
 * Output
Updated list: Banana Orange 
 */