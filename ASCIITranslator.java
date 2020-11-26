// ------------------------------------
// Assignment 2
// Written by: Briac Cordelle 40167269
// For COMP 248 EC - Fall 2020
// ------------------------------------
// Written by: Briac Cordelle 40167269
// For COMP 248 EC - Fall 2020
// ------------------------------------

//This program takes a char from the user and converts it into its ASCII integer value
//It also checks if that value is divisible by 2, 3, 5, 7 and tells the user



import java.util.Scanner;
public class ASCIITranslator {

	public static void main(String[] args) {
		
		Scanner mykeyboard = new Scanner(System.in);
		System.out.println("Please enter a letter from a to z: ");
		char character = mykeyboard.next().charAt(0); //this line is necessary because you can't scan a char
		
		int ascii = (int) character; //convert char to integer
		
		switch(ascii % 2) {  
		//ascii % 2 will either output 1 or 0
		//when it is 0, it means that it is even
		case 0:
			System.out.println("The ASCII number of " + character + " is even number " + ascii + ".");
			break;
			
		default:
			System.out.println("The ASCII number of " + character + " is odd number " + ascii);			
		}
		
		int i = 0; //this will be for the case where the char value is not a multiple of any 2/3/5/7
		
			if (ascii % 2 == 0) {
				System.out.println("It is a multiple of 2");
			
			} else {
				i++; 
				//each time the value is not divisible by one of these numbers it adds one to i 
			}
			
			if (ascii % 3 == 0) {
				System.out.println("It is a multiple of 3");
				
			} else {
				i++;
			}
			
			if (ascii % 5 == 0) {
				System.out.println("It is a multiple of 5");
			
			} else {
				i++;
			}
			
			if (ascii % 7 == 0) {
				System.out.println("It is a multiple of 7");
			
			} else {
				i++;
			}
			//if none of the multiples check out, i will be equal to 4
			if (i == 4) {
				System.out.println("It is not a multiple of 2, 3, 5 or 7");
			} 
			
		System.out.println("Goodbye!");
		//close the keyboard
		mykeyboard.close();
			
			
	}

}