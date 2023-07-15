import java.util.* ;
import java.io.*; 
class Square {
	int length;
	Square(){
		this.length = 10;
	}
    public Square(int length){
        this.length = length;
    }
    public void printArea(){
        System.out.println(length*length);
    }
}
class SquareClass {
	
	public static void main(String args[]) {
		
		int length = 7;
  	 	Square s1 = new Square();
   		Square s2 = new Square(length);
   		s1.printArea();
   		s2.printArea();
	}
}
	