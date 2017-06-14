//Austin Lowther 2130268
package lowther5;

public class ProgramOne {
	
	//Prints all numbers from 300 down to 200 that are divisible by 11 or 13, but not both.
	public static void main(String[] args) 
	{
		
		//declare variables to hold counters
		int count = 0;
		int total = 0;
		int integers = 0;
		
		//for loop from 300 down to 200.
		for (int num = 300; num >= 200; num--)
		{
			if((num % 11 == 0) ^ (num % 13 == 0)) //If divisible by 11 or 13, but not both.
			{
				count++;
				if ((count > 0) && (count % 5) == 0) //Starts a new line after the 5th integer
				{
					System.out.printf("%-8s\n", num);
					integers++;
					total += num;							
				}
				else
				{
					System.out.printf("%-8s", num);
					integers++;
					total += num;					
				}
			}
		}	
		//Print out total number of integers found and their sum.
		System.out.println("Found " + integers + " integers totaling " + total);

	}

}
