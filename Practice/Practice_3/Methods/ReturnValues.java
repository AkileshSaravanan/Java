public class ReturnValues {
    static int myMethod(int x, int y) {
      return x + y;
    }
  
    public static void main(String[] args) {
      System.out.println(myMethod(5, 3));
      int z = myMethod(15, 3);
      System.out.println(z);
    }
  }