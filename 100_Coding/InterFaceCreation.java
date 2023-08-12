//How to create Interface in java Program
interface Info {
    static final String language = "Java";
    public void display();
    }
class InterFaceCreation implements Info {
        public static void main(String []args) 
        { 
            InterFaceCreation obj = new InterFaceCreation(); 
            obj.display();
        }
    public void display() 
    { 
        System.out.println(language + " is awesome");
    }
}