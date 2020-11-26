import java.util.Scanner;
public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a string of odd length digits: ");
		
		String word = kb.next();
		int[] numbers = new int[word.length()];
		int i, k;
		
		for(i = 0; i < word.length(); i++) {
			numbers[i] = (word.charAt(i) - 48);
		}
		
		
		for(i = 0; i < word.length(); i++) {
			int numAt = numbers[i];
			if (i == word.length()/2) {
				System.out.println("   " + numbers[i] + "   ");
			}
			
			
		}
		
		

	}

}
