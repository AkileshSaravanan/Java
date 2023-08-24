import java.util.Arrays;
import java.util.Scanner;

public class FindingMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        
        int k = input.nextInt();
        Arrays.sort(arr);
        
        int temp[] = new int[k];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        
        for(int i = 0; i < k; i++) {
            temp[i] = arr[i];
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.print(max - min);
        
        input.close();
    }
}
