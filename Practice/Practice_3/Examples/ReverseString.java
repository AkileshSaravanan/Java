/*public class ReverseString{
    public static void main(String[] args) {
      //Scanner s = new Scanner(System.in);
      String originalStr = "Hello";
      String reversedStr = "";
      System.out.println("Original string: " + originalStr);    
      for (int i = 0; i < originalStr.length(); i++) {
        reversedStr = originalStr.charAt(i) + reversedStr;
      }
      System.out.println("Reversed string: "+ reversedStr);
    }
  }
*/
import java.util.Scanner;
class ReverseString{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the String:");
    String s=in.nextLine();
    for(int i=s.length()-1;i>=0;i--){
      System.out.print(s.charAt(i));
    }
  }
}