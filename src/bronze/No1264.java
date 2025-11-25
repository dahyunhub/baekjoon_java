package bronze;

import java.util.Scanner;

public class No1264 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String sentence = sc.nextLine();

			if (sentence.equals("#")) {
				break;
			}

			String lower = sentence.toLowerCase();
			int vowelCount = 0;

			for (int i = 0; i < lower.length(); ++i) {
				char ch = lower.charAt(i);

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					++vowelCount;
				}
			}
			System.out.println(vowelCount);
		}
		sc.close();
	}
}
