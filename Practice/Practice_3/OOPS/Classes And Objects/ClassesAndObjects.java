public class ClassesAndObjects {
    int x = 5;
  
    public static void main(String[] args) {
      ClassesAndObjects myObj = new ClassesAndObjects();
      ClassesAndObjects myObj1 = new ClassesAndObjects();
      System.out.println(myObj.x);
      System.out.println(myObj1.x);
    }
  }