
public class Main {

	public static void main(String[] args) {
		String text = "The quick brown fox jumped over the lazy dogs";

		// WORD COUNT
		int spaceCount = 0;

		// Using a loop we can access each character of the String
		for (int i = 0; i < text.length(); i++) {
			// Extract 1 character
			String ch = text.substring(i, i + 1);
			// Check to see if that character is a space
			if (ch.equals(" ")) {
				spaceCount++;
			}
		}

		// Output the number of words
		System.out.println("There are " + (spaceCount + 1) + " words.");

		// REPLACE ALL SPACES WITH *
		String newString = "";

		for (int i = 0; i < text.length(); i++) {
			// Extract 1 character
			String ch = text.substring(i, i + 1);
			// Check to see if that character is a space
			if (ch.equals(" ")) {
				newString = newString + "*";
			} else {
				newString = newString + ch;
			}
		}

		System.out.println("After replacing characters: " + newString);

		
		//Understanding Check
		String newString2 = "";
		String text2 = "hello";
		for (int i = 0; i < text2.length(); i++) {
			String ch = text2.substring(i, i + 1);
			newString2 = ch + newString2;
		}
		//What does this code do?
		System.out.println(newString2);

	}

}
