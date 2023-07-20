import java.util.*;
public class Removeno {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
       // Add elements to the ArrayList
        numbers.add(12);
        numbers.add(25);
        numbers.add(34);
        numbers.add(46);
        // Remove element equal to 25
        for (int i = 0; i<numbers.size(); i++) {
            if (numbers.get(i) == 25) {
                numbers.remove(i);
                break;
            }
        } 
        System.out.println(numbers);
    }
}

/*
 * Output
  [12, 34, 46]
 */