//Austin Lowther 2130268
package lowther7and11;

import java.util.ArrayList;

/* Create an ArrayList of strings to store the names of celebrities or athletes. 
 * Add five names to the list. Process the list with a for loop and the 
 * get() method to display the names, one name per line. Pass the list to 
 * a void method. Inside the method, Insert another name at index 2 and 
 * remove the name at index 4. Use a foreach loop to display the arraylist again, 
 * all names on one line separated by asterisks. After the method call in main, 
 * create an iterator for the arraylist and use it to display the list one 
 * more time.
 */
public class ProgramThree 
{

	public static void main(String[] args) 
	{
		//Construct ArrayList and add 5 values
		ArrayList<String> celebrityNames = new ArrayList<>();
		celebrityNames.add("Lionel Messi");
		celebrityNames.add("Drake");
		celebrityNames.add("Adele");
		celebrityNames.add("Dwayne Johnson");
		celebrityNames.add("Beyonce");
		
		//Print all values in the list
		System.out.println("Here is the list");
		for(int i = 0; i < celebrityNames.size(); i++)
			System.out.println(celebrityNames.get(i));
		
		//Pass ArrayList to changeUp method and print values again after
		//changes are made.
		changeUp(celebrityNames);
		System.out.println("\nUsing an iterator, here is the list");
		for(int i = 0; i < celebrityNames.size(); i++)
			System.out.println(celebrityNames.get(i));
		
		ArrayList<Integer> counts = new ArrayList<>();
		counts.add(10);
		counts.add(new Integer(8));

	}
	
	//inserts a value into the ArrayList at index two and removes value
	//at index 4. For each through the Array List printing each value.
	public static void changeUp(ArrayList names)
	{
		names.add(2, "Taylor Swift");
		names.remove(4);
		System.out.println("Here is the new list");
		for(Object s: names)
			System.out.print("* " + s + " ");
	}
	

	
	

}
