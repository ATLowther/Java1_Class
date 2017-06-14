//Austin Lowther 2130268
package lowther1and2;

import java.util.Scanner;

public class ProgramThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Creates a new Scanner instance
		
		/* Takes user input and stores it as a double */
		System.out.print("Enter a weight in kilograms: "); 
		double weightInKilos = input.nextDouble();
		input.close();
		
		// Converts Kilos to Pounds and then prints the result.
		double weightInPounds = weightInKilos * 2.20462;
		System.out.println("Your weight in pounds is: " + weightInPounds);
		
		boolean odd = 12 % 2 == 0;
		System.out.println(odd);
		if (odd)
			System.out.print("odd");
		else
			System.out.print("even");
		

	
	}

}
