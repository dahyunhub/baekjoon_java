package bronze;

import java.util.Scanner;

public class No5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String dial[] = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
		
		int n = 0;
		int totalTime = 0;

		for (int i = 0; i < word.length(); ++i) {
			for (int j = 0; j < dial.length; ++j) {
				if (dial[j].contains(String.valueOf(word.charAt(i)))) {
					n = (j + 2) + 1;
					totalTime += n;
				}
			}
		}
		System.out.println(totalTime);
		sc.close();
	}
}
