//---------------------------------------------
// Assignment 1
// Written by: Briac Cordelle 40167269
// For COMP 248 EC(6141) Fall 2020
//---------------------------------------------
//This program takes the name of the user and the city where the user is located
//It also changes the capitalization of the name of the city where the user is located





import java.util.*;
public class ChatBot {

	public static void main(String[] args) {
		System.out.println("Hello there, I am a chat bot named Chad.");
		System.out.println("----------------------------------------");
		
		Scanner mykeyboard = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = mykeyboard.next();
		
		System.out.println("Hello " + name.toUpperCase() + ", your name has " + name.length() + " characters.");
		System.out.println("Where are you? (City name with minimum 3 letters)");
		String place = mykeyboard.next();
		place = place.toLowerCase();
		int length = place.length();
		
		if ((length % 2) == 0) {  
			//this if statement checks if the city has an odd or an even number of letters
			//this is to know whether one letter should be capitalized or two
			int middle = (length)/2; 
			String UpperCase = place.substring(middle - 1, middle + 1).toUpperCase();
			String beginning = place.substring(0, middle - 1);
			String end = place.substring(middle + 1, length);
			System.out.println("With the middle letters in upper case: " + beginning + UpperCase + end);
			
		} else {
			
			int middle = (length/2);
			String UpperCase = place.substring(middle, middle + 1).toUpperCase();
			String beginning = place.substring(0, middle);
			String end = place.substring(middle + 1, length);
			System.out.println("With the middle letter in upper case: " + beginning + UpperCase + end);
			
		}
		
		String UpperCase = place.substring(1, 2).toUpperCase();
		String beginning = place.substring(0, 1);
		String end = place.substring(2, length);
		System.out.println("With the second letter in upper case: " + beginning + UpperCase + end);
		
		UpperCase = place.substring(length - 2, length - 1).toUpperCase();
		beginning = place.substring(0, length - 2);
		end = place.substring(length - 1, length);
		System.out.println("With the second to last letter in upper case: " + beginning + UpperCase + end);
		
		System.out.println("I am done. Goodbye.");
		mykeyboard.close();
		
		
	}

}
