package lowther5;

import java.util.Scanner;

public class ProgramThree {
	/* Generate a math quiz multiplying two random 1 digit integers.
	 * Allow the user to continue for as long as they would like, and display
	 * a tally of total questions correct out of total questions answered when 
	 * they choose not to continue any longer.
	 */

	public static void main(String[] args) 
	{
		//Declare Scanner instance, variable for while loop and counter variables
		Scanner input = new Scanner(System.in);
		String again = "y";
		again = again.toUpperCase();
		int count = 0;
		int correct = 0;
		
		
		while (again.equals("Y"))
		{
			int number1 = (int) (1 + Math.random() * 9); //1st random number
			int number2 = (int) (1 + Math.random() * 9); //2nd random number
			int result = number1 * number2; //Correct answer to the problem
			System.out.print("What is " + number1 + " * " + number2 + " ? ");
			int userPick = input.nextInt();			//Take next int input from user
			if (userPick == result) 
			{
				System.out.println("Correct. Nice work!");
				count++;
				correct++;
			}
			else
			{
				System.out.println("Incorrect. The product is " + result);
				count++;
			}
			System.out.print("Want more questions y or n ? ");
			again = input.next();
			again = again.toUpperCase();
			//Upon quitting, print out total correct out of total questions answered
			if (again.equals("N"))
			{
				System.out.println("You scored " + correct + " out of " + count);
			}
		}
	}
}
