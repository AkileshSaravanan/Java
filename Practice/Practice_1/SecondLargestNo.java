import java.util.Scanner;
public class SecondLargestNo {
    public static void main(String args[]){
       int temp, size;
       Scanner s = new Scanner(System.in);
       int t = s.nextInt();
       int array[] = new int[t];
        for(int i=0;i<t;i++)
        {
            array[i]=s.nextInt();
        }
       size = array.length;
       for(int i = 0; i<size; i++ ){
          for(int j = i+1; j<size; j++){
 
             if(array[i]>array[j]){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
             }
          }
       }
       System.out.println("second largest number is:: "+array[size-2]);
    }
 }