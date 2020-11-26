// ------------------------------------
// Assignment 2
// Written by: Briac Cordelle 40167269
// For COMP 248 EC - Fall 2020
// ------------------------------------

// This program takes in a sentence and rearranges certain parts of it (thus 'translating' the sentences)
// It also checks if the user inputs "q" to quit the program
// It can 'translate' multiple sentences 

import java.util.Scanner;
public class MiniTranslator {

	public static void main(String[] args) {
		//initialize mykeyboard
		Scanner mykeyboard = new Scanner(System.in);
		//welcome message
		System.out.println("----------------------------------------------------------------------");
		System.out.println("\t\tWelcome to the Mini Translator");
		System.out.println("----------------------------------------------------------------------\n");
		//this will be the condition for the while loop
		String yn = "y";
		//this is so that it can be changed later
		String inputS = "Please enter the input sentence (enter q to quit):";
		//equalsIgnoreCase() checks if the two strings are equivalent
		//since yn is currently "y", this is True
		while(yn.equalsIgnoreCase("y")) {

			//prompt the user
			System.out.println(inputS);
			String name = mykeyboard.next();
			//checks if the user wants to quit the program
			if (name == "q") {
				
				System.out.println("Thanks for using this translator program.");	
				mykeyboard.close();
				System.exit(0);
				
			} 

			//assigns variables to each part of the sentence
			//this program can only take in sentences formatted in this way:
			//"name" "came to" "city," "country" "year."

			String empty = mykeyboard.next();
			String empty1 = mykeyboard.next();
			String city = mykeyboard.next();
			String country = mykeyboard.next();
			String empty2 = mykeyboard.next();
			String year = mykeyboard.next();

			//removing the comma from the city 
			int cityLength = city.length();
			city = city.substring(0, cityLength - 1);

			//removing the dot from the year, converting it to an integer and turning it into time spent 
			int yearLength = year.length();
			year = year.substring(0, yearLength - 1);
			int time = 2020 - Integer.parseInt(year);

			//the 'translated' sentence
			System.out.println(name + " has stayed in " + city + " for " + time + " years. " + city + " is in " + country + ".");

			//ask the user if he/she would like to input another sentence
			System.out.println("Would you like to input another sentence? (y/n)");

			//checks input and makes it lowercase
			//in case user inputs uppercase
			yn = mykeyboard.next().toLowerCase();

			//changing the prompt sentence
			inputS = "Please enter another input sentence (enter q to quit):";
			
			}
		
		//if the user inputs "n", this will run 
		System.out.println("Thanks for using this translator program.");	
		mykeyboard.close();
		System.exit(0);
		
	}

} 


