import java.io.*;
import java.util.*;
public class MaxMin
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= s.nextInt();
        }
        int max = arr[0], min = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("Maximum Value="+max);
        System.out.println("Minimum Value="+min);
    }
}