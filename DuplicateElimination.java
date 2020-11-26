// --------------------------------------
// Assignment 3
// Written by: Briac Cordelle 40167269
// For COMP 248 EC - Fall 2020
// --------------------------------------

//This program takes in 10 inputs from the user, makes sure that they are within the range
//[10, 100] and then it removes any duplicates in those 10 integers.

import java.util.Scanner;

public class DuplicateElimination {

	public static void main(String[] args) {
		//welcome message
		System.out.println("Hello! Welcome to the duplicate elimination program!");
		System.out.println("This programs asks for 10 values in [10, 100] and removes any duplicates given.");
		System.out.println("Enjoy!\n");
		
		//initialize scanner
		Scanner kb = new Scanner(System.in);
		//initialize an array and a few variables
		int duplicates[] = new int[10];
		int i, x, k;
		//fill array with -1
		for(i = 0; i < 10; i++) {
			duplicates[i] = -1;
		}
		
		System.out.println("Please input a value in [10, 100]");
		//since we need 10 values, we are iterating this loop 10 times
		//we use [1, 10] because that way we can also use the variable i in the 
		//user prompt line
		for(i = 1; i <= 10; i++) {
			//prompt user (this will run 10 times) 
			System.out.print("Value " + i + ": ");
			x = kb.nextInt();
			duplicates[i - 1] = x;
			//check input validity
			if(x < 10 || x > 100) {
				System.out.print("Wrong input, please input a value in [10, 100]: ");
				x = kb.nextInt();
				//replace wrong value
				duplicates[i - 1] = x;
			
			}
		}
		
		System.out.println("The unique values are: ");
		//we need to go through the array once more and check for duplicates
		for(i = 0; i < 10; i++) {
			//for every iteration of i, this loop will compare that index of duplicates to
			//every other index of duplicates and remove any that have the same value
			for(k = 9; k > i; k--) {
				if(duplicates[i] == duplicates[k]) {
					duplicates[k] = -1;
				}
			}
			//this if/else is to only print the unique values 
			if (duplicates[i] == -1) {
				
			}else {
				System.out.print(duplicates[i] + " ");
			}
		}
		//close scanner
		kb.close();
		System.out.println("\n\nThanks for using this program!");

	}

}
