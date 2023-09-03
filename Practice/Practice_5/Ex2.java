/*
Problem Statement
Excel columns are labeled in alphabetical order. i.e. – A, B, C,…AA, BB, CC,…BA, BB, BC,…AAA, AAB, AAC,….AAZ and so on. 
The column index is 1 based i.e. A is represented by 1, B is represented by 2, AA is represented as 27, AB by 28, and so on.
You are required to write a function that accepts an integer n as its argument and returns a string representing the corresponding column label n.

Note: Ensure that the returned string is in the upper case.

Example
Input:
956

Output:
AJT

Input format :
The input consists of an integer, n.

Output format :
The output displays the Excel Column Value of the corresponding integer.
*/


import java.util.Scanner;
public class Ex2
{
    private static void printString(int colNum)
    {
        StringBuilder colNam = new StringBuilder();
        while(colNum > 0)
        {
            int rem = colNum % 26;
            if (rem == 0)
            {
                colNam.append("Z");
                colNum = (colNum / 26) - 1;
            }
            else
            {
                colNam.append((char)((rem-1)+'A'));
                colNum = colNum / 26;
                
            }
        }
        System.out.println(colNam.reverse());
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        printString(a);
    }
}