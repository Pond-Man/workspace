import java.util.Scanner;

public class CallMeACalculator {

	public static void main(String[] args) {
		
		System.out.println("Welcome to your very own Java Calculator!");
		System.out.println("Please type in one the number corresponding to the following operations:");
		System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
		
		Scanner mykeyboard = new Scanner(System.in);
		
		int operation = mykeyboard.nextInt();
		
		System.out.println("You have chosen: " + operation);
		
		if (operation == 1) {
			
			System.out.println("Please enter two numbers that you would like to add, separated by at least one space:");
			int n1 = mykeyboard.nextInt();
			int n2 = mykeyboard.nextInt();
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			
		} else if (operation == 2)  {
			
			System.out.println("Please enter two numbers that you would like to subtract, separated by at least one space:");
			int n1 = mykeyboard.nextInt();
			int n2 = mykeyboard.nextInt();
			System.out.println(n1 + " -" + " " + n2 + " = " + (n1 - n2));
			
		} else if (operation == 3) {
			
			System.out.println("Please enter two numbers that you would like to multiply, separated by at least one space:");
			int n1 = mykeyboard.nextInt();
			int n2 = mykeyboard.nextInt();
			System.out.println(n1 + " X " + n2 + " = " + (n1 * n2));
			
		} else if (operation == 4) {
			
			System.out.println("Please enter two numbers that you would like to divide, separated by at least one space:");
			double n1 = mykeyboard.nextInt();
			double n2 = mykeyboard.nextInt();
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
			
		}
		
		
		

	}

}
