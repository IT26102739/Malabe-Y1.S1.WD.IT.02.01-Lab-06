import java.util.Scanner;

public class IT26102739Lab6Q3
{
	public static void main(String[]args)
	{
		int count = 0;
		int number;
		int sqr = 0;
		double sumOfSqr = 0;
		double meanOfSqr;
		double rms = 0; // rms = Root Mean Square
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter positive integers(Terminate with -99): ");
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		//this loop continues until the user types -99.
		while(number != -99){
			//to check if the number entered is positive
			if(number > 0){
				sqr = number*number;
				sumOfSqr = sumOfSqr + sqr;	//Adding sqr to the running sumOfSqr
				count++; 					// increament of count by 1
			}
			else{
				System.out.println("Invalid input: Please enter a positive integer or -99 to terminate");
			}
			//Need to input again or else the loop will not continue.
			System.out.print("\nEnter a number: ");
			number = input.nextInt();
		}
		
		//If atleast one valid number was entered, then the RMS is calculated.
		if(count > 0){
			meanOfSqr = sumOfSqr / count;	
			rms = Math.sqrt(meanOfSqr);		
			System.out.println("The Root Mean Square(RMS): " + rms);
		}
		else{
			System.out.println("No valid numbers were entered");
		}
	}
}
				
				