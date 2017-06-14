//Austin Lowther 2130268
package lowther6;

import java.util.Scanner;

/* Takes input to toss a coin x number of times, generates random number
 * to determine whether the coin landed on heads or tails. 
 * Prints total number of tosses and total results for each side. 
 */

public class ProgramTwo 
{

	public static void main(String[] args) 
	{		
		//Takes user input for number of times to toss coin, declares counters
		Scanner input = new Scanner(System.in);
		System.out.print("How many times should I toss the coin? ");
		int numOfTosses = input.nextInt();
		int numOfTails = 0;
		int numOfHeads = 0;		
		
		// loops through a number of times based on user input
		// counts number of times, heads and number of times, tails.
		for (int count = 0; count < numOfTosses; count++)
		{
			String toss = coinToss();
			if (toss.equals("heads"))
			{
				numOfHeads++;
			}
			else
			{
				numOfTails++;
			}
		}
		System.out.println("Results of " + numOfTosses + " tosses.\n" +
							"Heads: " + numOfHeads + ", " + "tails: " + numOfTails);

	}
	
	//Generates random number and determines heads or tails
	public static String coinToss()
	{
		int number = (int)(Math.random() * 10);
		if (number <= 4)
			return "heads";
		else
			return "tails";		
	}
	
	

}
