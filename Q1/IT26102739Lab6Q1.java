import java.util.Scanner;

public class IT26102739Lab6Q1
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		
		int square = number * number;
		System.out.println(" Square value of " + number + " is : " + square);
		
		double squareRoot = Math.sqrt(number);
		System.out.println(" Square Root value of " + number + " is : " + squareRoot);
	}
}
		
		