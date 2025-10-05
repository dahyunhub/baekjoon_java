package bronze;

import java.util.Scanner;

public class No10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		for (int i = 'a'; i <= 'z'; ++i) {
			boolean isAlphabet = false;

			for (int j = 0; j < s.length(); ++j) {
				if (s.charAt(j) == i) {
					isAlphabet = true;
					break;
				}
			}
			if (isAlphabet) {
				System.out.print(s.indexOf(i) + " ");
			} else {
				System.out.print(-1 + " ");
			}
		}
		sc.close();
	}
}