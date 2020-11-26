// --------------------------------------
// Assignment 3 
// Written by: Briac Cordelle 40167269
// For COMP 248 EC - Fall 2020
// --------------------------------------

//This program solves the following problem:
//"A school has 100 lockers and 100 students. All lockers are closed on the first day of school.
//The first student, opens every locker. The second student, starting with the second locker, 
//closes every other locker. The third student, starting with the third locker, changes every
//third locker. This continues until the hundredth student changes the hundredth locker." 

public class Lockers {
	
	public static void main(String[] args) {
		//welcome message
		System.out.println("This program solves the 100 lockers and 100 students riddle!");
		System.out.println("\"A school has 100 lockers and 100 students. All lockers are closed on the first day of school."
				+ " \nThe first student, opens every locker. The second student, starting with the second locker,"
				+ "\ncloses every other locker. The third student, starting with the third locker, changes every "
				+ "\nthird locker. This continues until the hundredth student changes the hundredth locker.\"");
		
		System.out.println("\nThis program asks the question, which lockers are open at the end?\n\n");
		
		
		//initializing the array to 101 so that we can use 1-100 rather than 0-99		
		int locker[] = new int[101];	
		//this for loop changes the values in the array locker
		//the first loop goes from 1-100 to go through all the indexes of the array
		for(double student = 1.0; student < 101; student++) {
			//this loop changes the value of index*student to be the multiples of 
			//1, 2, 3, 4...etc
			//this is then used to increment those numbers in the array
			//in the end, all the open lockers will be incremented to an odd number
			for(int index = 1; index < 101/student; index++) {
				locker[(int) (index*student)]++;
				
			}
		}
		//for loop that goes through every element in locker[]
		//this will tell us which lockers are open and which are closed
		//the lockers that are open should be on odd numbers
		for(int i = 1; i < 101; i++) {			
			if(locker[i] % 2 == 0) {
				//System.out.println("Locker " + i + " is closed.");

			}else {
				System.out.println("Locker " + i + " is open.");
			}
		}
		
		System.out.println("\n\nThanks for using this program!");
	}

}