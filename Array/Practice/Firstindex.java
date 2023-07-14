import java.util.Scanner;
public class FirstIndex {
    public static void main(String args[]) {  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        int element = sc.nextInt();
        int result = -1;
        for(int i=0;i<n;i++){
            if(array[i] == element){
                result = i;
                break;
            }
        }
        System.out.print(result);
    }
}