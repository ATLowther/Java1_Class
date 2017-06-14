//Austin Lowther 2130268
package lowther6;

/* Runs a loop from 1-10 seconds, displaying the total distance an Object will 
 * have fallen at each one second interval. The distance will be dispalyed
 * in both Meters and Feet. 
 */

public class ProgramOne 
{
	
	public static void main(String[] args) 
	{
		//Defines and prints column headers for display table
		String stringSec = "SEC";
		String stringMeters = "METERS";
		String stringFeet = "FEET";
		System.out.printf("%-4s %7s %7s\n", stringSec, stringMeters, stringFeet);
		
		/* Loops through 10 times, passing seconds to distance and passing meters
		 * to meterToFeet, then printing each number on that row.
		 */
		for (int sec = 1; sec <= 10; sec++)
		{
			double meters = distance(sec);
			double feet = metersToFeet(meters);
			System.out.printf("%-4d %7.1f %7.1f\n", sec, meters, feet);
		}
	}
	
	//Returns distance based upon number of seconds
	public static double distance(double seconds)
	{
		return (1.0/2) * (9.8 * Math.pow(seconds, 2));
	}
	
	//Returns number of feet converted from meters
	public static double metersToFeet(double meters)
	{
		return meters * 3.28084;
	}

}
