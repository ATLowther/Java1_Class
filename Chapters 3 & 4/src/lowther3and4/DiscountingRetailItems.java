//Austin Lowther 2130268
package lowther3and4;

import java.util.Scanner;

public class ProgramThree {

	public static void main(String[] args) {
		//new Scanner instance
		Scanner input = new Scanner(System.in);
		
		//Takes user input for desired number of t-shirts to order
		System.out.print("How many t-shirts would you like? ");
		double tshirtCount = input.nextDouble();
		input.close();
		
		//Defines cost per shirt, total cost of shirts, and default shipping cost
		double costPerTshirt = 24.95;
		double tshirtCost = costPerTshirt * tshirtCount;
		double shippingCost = 10.00;
		
		//Adds and prints discounted price per shirt and discounted shipping cost dependent upon total shirts ordered.		
		if (tshirtCount > 0 && tshirtCount <= 2)
		{
			System.out.printf("Your cost for the shirts is $%.2f, cost for shipping is %.2f and total cost is %.2f.", tshirtCost, shippingCost, tshirtCost + shippingCost);
		}			
		else if (tshirtCount >= 3 && tshirtCount <= 5)
		{
			shippingCost *= .8;
			tshirtCost *= .9;
			System.out.printf("Your cost for the shirts is $%.2f, cost for shipping is %.2f and total cost is %.2f.", tshirtCost, shippingCost, tshirtCost + shippingCost);
		}
		else if (tshirtCount >= 6 && tshirtCount <= 10)
		{
			shippingCost *= .5;
			tshirtCost *= .8;
			System.out.printf("Your cost for the shirts is $%.2f, cost for shipping is %.2f and total cost is %.2f.", tshirtCost, shippingCost, tshirtCost + shippingCost);
		}
		else if (tshirtCount >= 11)
		{
			shippingCost = 0;
			tshirtCost *= .7;
			System.out.printf("Your cost for the shirts is $%.2f, cost for shipping is %.2f and total cost is %.2f.", tshirtCost, shippingCost, tshirtCost + shippingCost);
		}

	}

}
