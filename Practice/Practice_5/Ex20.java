/*
Chef and his girlfriend go on a date. Chef took X dollars with him, and was quite sure that this would be enough to pay the bill. 
At the end, the waiter brought a bill of Y dollars. 
Print "YES" if Chef has enough money to pay the bill, or "NO" if he has to borrow from his girlfriend and leave a bad impression on her.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of a single line of input, containing two space-separated integers X and Y.
Output Format
For each test case, output on a new line "YES" if Chef has enough money to pay the bill and "NO" otherwise.
You may print each character of the string in either uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

Constraints
1≤T≤100
1≤X,Y≤100

Sample 1:
Input
4
1 1
1 2
2 1
50 100

Output
YES
NO
YES
NO
*/

import java.util.Scanner;
class code
{
    int t,x,y;
    void printAge()
    {
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
            x=sc.nextInt();
            y=sc.nextInt();
            if(x>=y){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        
    }
    }
}
public class Ex20{
    public static void main (String args[]){
        code c=new code();
        c.printAge();
    }
}