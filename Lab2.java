import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = kb.next();
		
		System.out.print("Do you want to convert it? ");
		char answer = kb.next().charAt(0);
			
		if (answer == 'Y') {
			System.out.println("ABC" + word.substring(0, word.length() - 1) + "Z");
			kb.close();				
			
		} else if (answer == 'y') {
			System.out.println("ABC" + word.substring(0, word.length() - 1) + "Z");
			kb.close();
			
		} else {
			System.out.println(word);
			kb.close();
			
		}
	
		
		
	}

}
