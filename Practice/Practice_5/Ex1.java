/*
Problem Statement
    Preethi was fond of programming. One day she attended a hackathon where she came across a question. 
    She was given to solve a question using functions, but as she is not much aware of the usage of functions she was unable to solve it. 
    help her write the program. The question is as follows: Write a function that accepts 3 positive integers l, u, and x as its arguments. 
    You are required to calculate the number of occurrences of a digit x in the digits of numbers lying in the range between l and u both inclusive and return the same. 
Example
Input:
2
13
3

Output:
2

Explanation:
The number of occurrences of digit 3 in the digits of numbers lying in the range [2, 13], both inclusive, is 2, i.e., (3, 13), hence 2 is returned.

Input format :
The input consists of the three integers l, u, and x in separate lines

Output format :
The output displays the number of occurrences of a digit x in the digits of numbers lying in the range between l and u.
 */


import java.util.*;
public class Ex1
{
    static int countDigitOccurrences(int l, int u, int x)
    {
        int rem, count = 0;
        for(int i = l; i <= u; i++)
        {
            int temp = i;
            while(temp != 0 )
            {
                if(temp % 10 == x)
                    count++;
                temp = temp / 10;
            }
        }
        return count;
    }
        public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int u = sc.nextInt();
        int x = sc.nextInt();
        System.out.print(countDigitOccurrences(l, u, x));
    }
}
