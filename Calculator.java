//---------------------------------------------
// Assignment 1
// Written by: Briac Cordelle 40167269
// For COMP 248 EC(6141) Fall 2020
//---------------------------------------------
// This program takes in two digits and outputs the addition, subtraction, multiplication and division of them




import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner mykeyboard = new Scanner(System.in);
		System.out.println("\t\t\tWelcome to Call me a Calculator! \nPlease enter two digits, separated by a space and the second one cannot be zero: ");
		int n1 = mykeyboard.nextInt(); //take two digits
		int n2 = mykeyboard.nextInt();
		
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));  //addition
		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));  //subtraction
		System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));  //multiplication
		
		double d1 = n1; //for division the integers need to be converted to doubles 
		double d2 = n2; //this allows us to divide things like 5/3 and get an accurate answer
		System.out.println(d1 + " / " + d2 + " = " + (d1 / d2));  //division
		
		System.out.println("All done");
		mykeyboard.close();
		
	}

}
