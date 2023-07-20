import java.util.HashSet;
public class Hashset{
   public static void main(String[] args) {
      HashSet<String> marbles = new HashSet<String>();
      marbles.add("Red");
      marbles.add("Green");
      marbles.add("Blue"); 
      marbles.add("Red");
      System.out.println(marbles);
   }
}