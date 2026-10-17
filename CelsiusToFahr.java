/*
Input:
Celsius = 37

Output:
Fahrenheit = 98.6

Explanation:
The formula used is:
F = (C × 9 / 5) + 32
The Celsius value is converted into Fahrenheit using this formula
*/

public class CelsiusToFahr
{
	public static void main(String[] args)
	{
		double Celsius = Double.parseDouble(args [0]);
		System.out.println("Enter the Celsius=");
		
		double Fahr = (Celsius*9/5)+32;
		System.out.println("This is the celsius=" + Fahr);
	}
}
