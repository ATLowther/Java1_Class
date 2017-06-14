package lowther5;

public class ProgramTwo {

	/* Display a two column table with corresponding Fahrenheit and Celsius
	 * temperatures from -40F to 120F with each row increasing by 5 degrees 
	 * Fahrenheit
	 */
	
	public static void main(String[] args) 
	{
	/*	//Declare inital Fahrenheit temperature and column headers
		double temperatureFahrenheit = -40.0;
		String fahrenheit = "Fahrenheit";
		String celsius = "Celsius";
		System.out.printf("%-12s %-12s\n", fahrenheit, celsius);
		
		/* While loop converting Fahrenheit to Celcius, printing corresponding 
		 * temperatures and then increasing Fahrenheit by 5 
		 */
	/*	while (temperatureFahrenheit <= 120.0)
		{
			double fahrenheitToCelsius = (temperatureFahrenheit - 32) * (5.0/9);
			System.out.printf("%-12.1f %-12.1f\n", temperatureFahrenheit, fahrenheitToCelsius);
			temperatureFahrenheit += 5; 
		} */
		
		int x = 2;
		while (x <= 10)
		{
			++x;
			System.out.println(x);
		}

	}

}
