
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String sentence = sc.nextLine();
			
			String lowerSentence = sentence.toLowerCase();
			int vowelCount = 0;

			if (sentence.equals("#")) {
				break;
			}

			for (int i = 0; i < lowerSentence.length(); ++i) {
				if (lowerSentence.charAt(i) == 'a' || lowerSentence.charAt(i) == 'e' || lowerSentence.charAt(i) == 'i' || lowerSentence.charAt(i) == 'o'
						|| lowerSentence.charAt(i) == 'u') {
					++vowelCount;
				}
			}
			System.out.println(vowelCount);
		}
	}
}
