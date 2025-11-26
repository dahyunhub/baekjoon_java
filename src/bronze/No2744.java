package bronze;

import java.util.Scanner;

public class No2744 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word = sc.next();

		for (int i = 0; i < word.length(); ++i) {
			char ch = word.charAt(i);

			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else {
				ch = Character.toUpperCase(ch);
			}
			System.out.print(ch);
		}
		sc.close();
	}
}
