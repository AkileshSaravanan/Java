import java.util.*;
public class MultiCatch{
    public static void main(String[] args) {
        try {
            // Some code that might throw an exception
            String str = null;
            System.out.println(str.length());
        }
        catch (NumberFormatException e) {
            System.out.println("A number format exception occurred: " + e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println("A null pointer exception occurred: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}