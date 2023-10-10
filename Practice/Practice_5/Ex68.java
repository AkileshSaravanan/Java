/*
You can also have multiple outputs together in a single print statement.
They are joined together using the "+" operator.

So, for example,

System.out.print(2);
System.out.print("\n");
System.out.print(3);
and

System.out.print(2 + "\n" + 3);
are equivalent.

Task
Write a program which does the following

Output: 3 + 4
Output: 2 + 1 in a separate line using the syntax suggested above.
*/
public class Ex68
{
	public static void main (String[] args)
	{
		System.out.print((3 + 4) + "\n" + (2 + 1));
	}
}