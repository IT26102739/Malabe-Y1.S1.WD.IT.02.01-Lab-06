import java.util.Scanner;

public class IT26102739Lab6Q2B
{
	public static void main(String[]args)
	{
		int count = 1;
		String numbers = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 10 numbers: ");
		
		while(count <=10){
			System.out.print(" Enter number " + count + ": ");
			int num = input.nextInt();
			numbers += num + " "; 
			count++;
		}
	System.out.println("\nThe numbers you entered are: ");
	System.out.println(numbers);
	}
}