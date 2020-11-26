import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String input = kb.next();
		String word = input.toUpperCase();
		System.out.print("\n");
		String empty = "";
		for(int i = 0; i <= word.length() - 1; i++) {
			if (i % 3 == 0) {
				System.out.print(word.charAt(i));
				
			}
		}
		
		System.out.println();
		word = word.toLowerCase();
		for(int i = word.length() - 1; i >= 0; i--) {
			char reverseChar = word.charAt(i);
			String reverseWord = empty + reverseChar;
			System.out.print(reverseWord);
			
		}
		
		
		System.out.print("\n" + input);
		kb.close();
		

		
			
	}

}
