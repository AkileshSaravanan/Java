import java.util.*;
public class FindMiddle {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        int middle = list.get(list.size()/2);
        System.out.println(middle);
    }
}

/*
 * Output
 15
 */