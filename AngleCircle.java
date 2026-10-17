/*
Input:
Angle1 = 50
Angle2 = 60

Output:
Third Angle = 70

Explanation:
The sum of all angles in a triangle is 180°.
Third Angle = 180 ? (Angle1 + Angle2).
*/

public class AngleCircle
{
	public static void main(String[] args)
	{
		int angle1 = Integer.parseInt(args [0]);
		int angle2 = Integer.parseInt(args [1]);
		System.out.println("Enter the angle1=");
		System.out.println("Enter the angle2=");
		
		int Thirdangle = 180-(angle1 + angle2);
		System.out.println("The Third angle is =" + Thirdangle);
	}
}