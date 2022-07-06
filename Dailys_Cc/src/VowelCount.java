import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Type some words: ");
		String word = scanner.nextLine();

		int count = 0;
		word = word.toLowerCase();

		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u') {
				count++;

			}
		}
		System.out.println(count);

	}

}
