//Austin Lowther 2130268
package lowther7and11;

/* Declare an array to hold eight integers. 
 * Use a for loop to add eight random integers, all in the range 
 * from 50 to 100, inclusive, to this array. Duplicates are okay. 
 * Next, pass the array to a method that sorts the array and 
 * returns another array containing only the largest and 
 * smallest elements in the original array. Print these two values in main. 
 * Then use a foreach loop to display all elements of the sorted array on 
 * one line separated by a single space. This latter loop should also 
 * count the odd and even numbers in the array and determine the 
 * sum of all elements in the array.
 */

public class ProgramOne 
{

	public static void main(String[] args) 
	{
		//Declares an array to hold 8 ints and randomly generates a value for
		//each from 50-100
		int[] randInt = new int[8];
		for(int i = 0; i < randInt.length; i++)
		{
			randInt[i] = (int)(50 + Math.random() * 51);
		}	
		
		/* Declare an array to hold the array returned from the sort method
		 * Print out the two values and then the entire sorted array.
		 */
		int[] bigAndSmall = sort(randInt);
		System.out.println("The lowest element is " + bigAndSmall[0]);
		System.out.println("The highest element is " + bigAndSmall[1]);
		System.out.println("Here is the array");
		
		//Declare counters for number of evens, odds and sum of all numbers
		//Loop through to give value to the counters
		int evens = 0;
		int odds = 0;
		int sum = 0;	
		for (int e: randInt)
		{
			System.out.print(e + " ");
			if (e % 2 == 0)
				evens++;
			else
				odds++;
			sum += e;
		}
		
		
		//Print out total number of evens, odds and the sum of the numbers.
		System.out.println("\nEvens: " + evens + ", odds: " + odds);
		System.out.println("Total: " + sum);
			
	}
	
	//Sorts an array of ints in ascending order. Returns an array of 2 ints
	//holding the largest and smallest values from the entire array
	public static int[] sort(int[] randInts)
	{
		int small = randInts[0];
		int largest = randInts[0];
		for (int i = 0; i < randInts.length; i++)
		{
			if (randInts[i] < small)
				small = randInts[i];
			if (randInts[i] > largest)
				largest = randInts[i];
		}
		for (int i = 0; i < randInts.length; i++)
		{
			for (int j = i + 1; j < randInts.length; j++)
			{
				if (randInts[i] > randInts[j])
				{
					int temp = randInts[i];
					randInts[i] = randInts[j];
					randInts[j] = temp;
				}
			}
		}
		int[] bigAndSmall = {small, largest};
		return bigAndSmall;		
		
	}

}
