package bronze;

import java.util.Scanner;

public class No4470 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		String[] lines = new String[n];

		for (int i = 0; i < n; ++i) {
			lines[i] = sc.nextLine();
		}

		for (int i = 0; i < n; ++i) {
			System.out.printf("%d. %s\n", i + 1, lines[i]);

		}
	}
}
