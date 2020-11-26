// ------------------------------------
// Assignment 2
// Written by: Briac Cordelle 40167269
// For COMP 248 EC - Fall 2020
// ------------------------------------

// This program takes in 5 numbers and treats them as quantities of food 
// It then calculates the price of this food and applies a discount depending on the price of the food (except for the seafood)
// It also calculates a number of points earned based on the amount of food bought (including seafood)
// And it tells the user the price and number of points earned from this purchase


import java.util.Scanner;
public class GroceryStore {

	public static void main(String[] args) {
		
		Scanner mykeyboard = new Scanner(System.in);
		
		System.out.println("------------------------------------------------------------");
		System.out.println("\t\tGrocery Shop Price Calculator");
		System.out.println("------------------------------------------------------------\n");
		
		System.out.print("Please enter the quantities for each item in the list: ");
		int fruit = mykeyboard.nextInt();
		int cheese = mykeyboard.nextInt();
		int dairy = mykeyboard.nextInt();
		int meat = mykeyboard.nextInt();
		int seafood = mykeyboard.nextInt();
		//get 5 integers from the user
		
		float price = (float) (26.99*fruit + 22.99*cheese + 13.99*dairy + 56.99*meat + 38.99*seafood); 

		System.out.println("Do you have a membership? (Y/N)");
		char membership = mykeyboard.next().charAt(0);
		//find the first character of whatever the user enters
		if (membership == 'N') {
			System.out.println("The total price is $" + price);
			//if the user doesn't have a membership the price is calculated without the discount or the points
			
		} else {
			price = (float) (price - 38.99*seafood);
			
			if (price < 250) {
				//the discounted price is calculated without the price of the seafood
				price = (float) (price*0.9 + 38.99*seafood);
				int points = Math.round(2*price);
				//however the points are calculated with the seafood price 
				//this is repeated for the three price ranges
				System.out.println("The total price is $" + price + ". You will receive " + points + " points.");
				
			} else if (price >= 250 && price <= 500) {
				price = (float) (price*0.85 + 38.99*seafood);
				int points = Math.round(2*price);
				System.out.println("The total price is $" + price + ". You will receive " + points + " points.");
				
			} else {
				price = (float) (price*0.8 + 38.99*seafood);
				int points = Math.round(3*price);
				System.out.println("The total price is $" + price + ". You will receive " + points + " points.");
				
			}
		}
		
		System.out.println("Thank you for shopping! See you next time!");
	
	}	

}
