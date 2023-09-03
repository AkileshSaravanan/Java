public class ConstructorParameter {
    int modelYear;
    String modelName;
  
    public ConstructorParameter (int year, String name) {
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
      ConstructorParameter myCar = new ConstructorParameter(1969, "Mustang");
      System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
  }