package bronze;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class No1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word = sc.next();
		word = word.toUpperCase();

		HashMap<Character, Integer> mostUsedAlphabet = new HashMap<>();

		for (int i = 0; i < word.length(); ++i) {
			char ch = word.charAt(i);
			Integer count = mostUsedAlphabet.get(ch);

			if (count == null) {
				mostUsedAlphabet.put(ch, 1);
			} else {
				mostUsedAlphabet.put(ch, count + 1);
			}
		}

		int max = 0;
		char maxChar = '?';
		boolean isDuplicate = false;

		for (Map.Entry<Character, Integer> entry : mostUsedAlphabet.entrySet()) {
			char ch = entry.getKey();
			int count = entry.getValue();

			if (count > max) {
				max = count;
				maxChar = ch;
				isDuplicate = false;
			} else if (count == max) {
				isDuplicate = true;
			}
		}

		if (isDuplicate) {
			System.out.println("?");
		} else {
			System.out.println(maxChar);
		}
	}
}
