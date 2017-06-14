//Austin Lowther 2130268
package lowther9and10;

/*
 * Write a Java program that prompts the user to enter a password that matches a specific pattern. Your program must approve the user's entry.. Here is the pattern, in this order:

	1 or more upper case letters
	two lower case letters
	1 or 2 digits
	zero or 1 upper case letters
	any two of this group @#$%^&
 */

import java.util.Scanner;

public class PasswordMatch {

	public static void main(String[] args) {
		
		//Takes user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String password = input.nextLine();
		input.close();
		
		//Prints if password is valid or not.
		if(isValidPassword(password))
			System.out.println("Congratulations, this is a valid password.");
		else
			System.out.println("Sorry, this is an invalid password.");
		
	}
	
	//regex test for proper pattern
	public static boolean isValidPassword(String password)
	{
		if(password.matches("(^[A-Z]{1,}[a-z]{2}\\d{1,2}[A-Z]?[@#\\$%\\^&]{2}$)"))
			return true;
		return false;
	}

}


