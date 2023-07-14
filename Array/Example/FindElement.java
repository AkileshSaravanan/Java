import java.io.*;
import java.util.*;
public class FindElement
{
    static int search(int[] arr,int n,int x)
    {
        int i;
        for(i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                return i;
            }
        }
    return -1;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int x = s.nextInt();
        int res = search(arr,arr.length,x);
        if(res == -1)
        {
            System.out.println("Element is not present in array");
        }
        else
        {
            System.out.println("Element is present in array at index " + res);
        }
    }
}