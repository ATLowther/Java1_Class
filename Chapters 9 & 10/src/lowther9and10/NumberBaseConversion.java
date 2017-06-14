//Austin Lowther 2130268
package lowther9and10;

/*
 * Prompt the user to enter a string containing a hexadecimal number.
Use class Integer to parse the input to a base-10 integer variable and display it.
Convert this base-10 variable to a string holding an equivalent number in binary.
Print this binary equivalent.
Use class Integer to convert the binary string back to base-10 and display it.
 */

import java.util.Scanner;

public class NumberBaseConversion {

	public static void main(String[] args) {
		
		//Takes user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hexadecimal number: ");
		String hex = input.nextLine();
		
		//Prints out different conversions
		System.out.println("Hex in decimal: " + hexStringToInteger(hex));
		System.out.println("Hex in binary: " + decimalToBinaryString(hexStringToInteger(hex)));
		System.out.println("Hex back in decimal: " + binaryStringToDecimal(decimalToBinaryString(hexStringToInteger(hex))));
		
		StringBuilder sb = new StringBuilder().append("Hey Java");
		System.out.println(sb.capacity() - sb.length());
	}

	
	public static Integer hexStringToInteger(String hex)
	{
		return Integer.parseInt(hex, 16);
	}
	
	public static String decimalToBinaryString(Integer decimal)
	{
		return Integer.toBinaryString(decimal);
	}
	
	public static Integer binaryStringToDecimal(String binary)
	{
		return Integer.parseInt(binary, 2);
	}
}
