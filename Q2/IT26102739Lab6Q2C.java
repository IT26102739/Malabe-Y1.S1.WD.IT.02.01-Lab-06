import java.util.Scanner;

public class IT26102739Lab6Q2C
{
	public static void main(String[]args)
	{
		int count = 1;
		int sum = 0;
		double avg = 0;
		String numbers = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 10 numbers: ");
		
		while(count <= 10){
			System.out.print(" Enter number " + count + ": ");
			int num = input.nextInt();
			
			numbers += num + " "; 
			sum += num;
			count++;
		}
		//To print all the  entered numbers
		System.out.println("\nThe numbers you entered are: ");
		System.out.println(numbers);
		
		//To print sum & average
		avg = sum / 10;
		System.out.println("Sum of the numbers: " + sum);
		System.out.println("Average of the numbers: " + avg);
	}
	
}