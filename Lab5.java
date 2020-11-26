//this program asks the user for a string of digits and formats them in this way (input = 123):
//1
//1	     2
//1      2      3
//1      2 
//1
//


import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a string of digits: ");
		String digits = kb.next();
		System.out.println();
			
		int i, j;
		
		for(i = 0; i < digits.length(); i++) {			
			for(j = 0; j <= i; j++) {
				System.out.print(digits.charAt(j) + "\t");
				
			}
			System.out.println();
			
		}
		
		for(i = digits.length(); i >= 0; i--) {			
			for(j = 0; j < i - 1 ; j++) {
				System.out.print(digits.charAt(j) + "\t");
				
			}
			if (i == 0) {
				break;
			}
			
			System.out.println();
			
		}
			
		
	}

}
