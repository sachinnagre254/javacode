/*
Input:
Principal = 2000
Rate = 10
Time = 2

Output:
Compound Interest = 420

Explanation:
Compound Interest is calculated using the formula:
CI = P(1 + R/100)^T ? P
After calculation, the compound interest is 420
*/

public class CompoundInterest
{
	public static void main(String[] args)
	{
		int Principal = Integer.parseInt(args [0]);
	
		
		
		int Rate = Integer.parseInt(args [1]);

		
		int Time = Integer.parseInt(args [2]);

	
	
        int CompoundInterest= (Principal* Rate* Time)/100;

		System.out.println("The CompoundInterest is =" + CompoundInterest );
	}
}
