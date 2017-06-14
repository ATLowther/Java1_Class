//Austin Lowther 2130268
package lowther7and11;

import java.util.Arrays;

/* Pass command line arguments to the main method and then display those numbers
 * and the sum of those numbers.
 */

public class ProgramTwo 
{

	public static void main(String[] args) 
	{
		//Displays the values in the 'args' array and then passes those
		//values to sumInts method, printing their sum.
		System.out.println("Passing " + Arrays.toString(args));		
		System.out.println("Sum is " + sumInts(args));

	}
	
	//Loop through a variable number of arguments and return the sum of those numbers
	public static int sumInts(String... ints)
	{
		int sum = 0;
		for(String e: ints)
			sum += Integer.parseInt(e);
		return sum;		
	}

}
