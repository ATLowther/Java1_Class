//Austin Lowther 2130268
package lowther3and4;

import java.util.Scanner;

public class ProgramOne {

	public static void main(String[] args) {
		//Creates new Scanner instance for input
		Scanner input = new Scanner(System.in);		
		
		//Takes user input and stores it in a variable		
		System.out.println("Enter a first name, middle name and surname: ");
		String fullName = input.nextLine();
		input.close();
		
		//trims trailing and leading white space. Grabs index for spaces between names.
		fullName = fullName.trim();
		int indexFirstName = fullName.indexOf(" ");
		int indexLastName = fullName.lastIndexOf(" ");
		
		//Breaks the full name into substrings for first, middle and last name
		String firstName = fullName.substring(0, indexFirstName);
		String middleName = fullName.substring(indexFirstName + 1, indexLastName);
		String lastName = fullName.substring(indexLastName + 1);
		
		/*
		 *Prints the length of the full name.
		 *the length of the middle name.
		 *the three initials of the name.
		 *the name in all upper case. 
		 */
		System.out.println("Length of your name is: " + fullName.length() + " characters");
		System.out.println("Length of your middle name: " + middleName.length() + " characters");
		System.out.println("Your initials are " + firstName.toUpperCase().charAt(0) + middleName.toUpperCase().charAt(0) + lastName.toUpperCase().charAt(0));
		System.out.println(fullName.toUpperCase());
		

		
		

	}

}
