/*
You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
Given, find the total number of full staircase rows that can be formed. n is a non-negative integer and fits
Write a program in C/C++/ Java:
within the range of a 32-bit signed integer.
Input: n = 8
The coins can form the following rows:
Output: 3.
*/
import java.util.Scanner;
public class StairCase
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int count = 0;
        for(int i =1;i<=n;i++)
        {
            sum = sum + i;
            if(sum>n)
            {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}