/*
Input:
Length = 10
Breadth = 5

Output:
Area = 50

Explanation:
The area of a rectangle is calculated using the formula:
Area = Length × Breadth
So, 10 × 5 = 50.
*/

public class AreaCircleProgram
{
	public static void main(String [] args)
	{
		int l = Integer.parseInt(args[0]);
	int  b = Integer.parseInt(args[1]);
		
		System.out.println("The Area is "+ (l*b));
	}
}
