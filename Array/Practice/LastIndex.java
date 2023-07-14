import java.util.Scanner;
public class LastIndex 
{
    public static int findLastOccurrence(int arr[], int x)
     {
        for (int i = arr.length - 1; i >= 0; i--) 
        {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1; 
	}
     public static void main(String args[]) 
     {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int index = findLastOccurrence(arr, x);
        System.out.println(index);
    }
}