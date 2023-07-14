import java.io.*;
import java.util.*;
public class ArrayFunction
{
    public static void print(int[] arr)
    {
        for (int i=0;i<5;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int [] arr = {1,2,3,4,5};
        print(arr);
    }
}