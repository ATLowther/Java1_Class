//Austin Lowther 2130268
package lowther3and4;

public class ProgramTwo {

	public static void main(String[] args) {
		//Generates two random integers between 50-100, inclusive
		int num1 = (int)(50 + Math.random() * 50 + 1);
		int num2 = (int)(50 + Math.random() * 50 + 1);
		
		//Prints out the two numbers
		System.out.println(num1);
		System.out.println(num2);
		
		/*
		 * Prints the difference between the two variables by ordering
		 * the larger number to be first in the equation, or remaining in 
		 * the same order if they are of the same value.
		 */
		if (num2 > num1)
			System.out.println(num2 + " - " + num1 + " = " + (num2 - num1));
		else
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		

	}

}
