/*
Problem Statement
When a particular range is given to Kyle, he writes down all the values within that range which consists of unique digits. 
For example, if the range 10-30 is given, he writes down all the values except 11 and 22 since their digits are repeated. However, when large ranges are given, he finds it difficult to identify the numbers. Help him by writing a code that prints all the values in the range that satisfy the given condition.

Input format :
The input consists of the range values x and y.

Output format :
The output displays the values which have unique digits in the range as shown in the sample test case.

Code constraints :
0 <= x, y <= 1000

Sample test cases :
Input 1 :
10 30

Output 1 :
10 12 13 14 15 16 17 18 19 20 21 23 24 25 26 27 28 29 30 
 */

import java.io.*;
import java.util.*;
public class Ex3
{
    static void printUnique(int l,int r)
    {
        for(int i=l;i<=r;i++)
        {
            int num = i;
            boolean visited[] = new boolean[10];
            
            while(num!=0)
            {
                if(visited[num%10])
                {
                    break;
                }
                visited[num%10]=true;
                num=num/10;
            }
            if(num==0)
            {
                System.out.print(i+ " ");
            }
            
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int l=s.nextInt();
        int r = s.nextInt();
        printUnique(l,r);
    }
}