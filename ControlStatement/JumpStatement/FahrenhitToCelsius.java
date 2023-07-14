import java.util.* ;
import java.io.*; 
class FahrenhitToCelsius {   
    public static void main(String args[]) {     
        Scanner sc=new Scanner(System.in);
        double S=sc.nextDouble();
        double E=sc.nextDouble();
        double W=sc.nextDouble();
        double C;
        for(double i=S;i<=E;i+=W){
            C=(((i-32)*5)/9);
            System.out.println((int)i+"\t"+(int)+C);
        }
    }
}