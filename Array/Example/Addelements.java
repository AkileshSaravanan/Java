import java.io.*;
import java.util.*;
public class Addelements
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int [] arr1 = new int[m];
        int [] arr2 = new int[n];
        for(int i=0;i<m;i++)
        {
            arr1[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]=s.nextInt();
        }
        int res = 0;
        for(int i=0;i<arr1.length;i++)
        {
            res += arr1[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            res += arr2[i];
        }
        System.out.println(res);
    }
}