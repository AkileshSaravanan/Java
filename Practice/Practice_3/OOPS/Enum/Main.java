/*
Enums
An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. 
Note that they should be in uppercase letters:

enum Level {
    LOW,
    MEDIUM,
    HIGH
  }
  
  public class Main { 
    public static void main(String[] args) { 
      Level myVar = Level.MEDIUM; 
      System.out.println(myVar); 
    } 
  }
  
/*Enum Inside a Class 
public class Main {
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar);
  }
}
*/

/*Enum in a Switch Statement 
enum Level {
  LOW,
  MEDIUM,
  HIGH
}

public class Main {
  public static void main(String[] args) {
    Level myVar = Level.MEDIUM;

    switch(myVar) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
         System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }
  }
}

*/

/*Loop Through an Enum */
public class Main {
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {
for (Level myVar : Level.values()) {
  System.out.println(myVar);
}
  }
}