import java.util.*;
public class PigLatin {

	public static void main(String[] args) {
		
		Scanner mykeyboard = new Scanner(System.in);
		System.out.print("Input a word to convert: ");
		String str = mykeyboard.next();
		
		String piglatin = "";
		
		char x = str.charAt(0);
		if(x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U' || x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
			
			piglatin = str + "ay";
			
			} else {
				
				piglatin = str.substring(1, str.length()) + str.charAt(0) + "ay";
				
			}
				
	
		System.out.println(piglatin);
			
		
		
		
		
		
		
		
	}

}
