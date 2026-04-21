

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		String result = "";

		for (int i = 0; i <= t; ++i) {
			String str = sc.nextLine();

			result = "";
			if (str.length() > 0) {
				result += str.charAt(0);
				result += str.charAt(str.length() - 1);
				System.out.println(result);

			}
		}
	}
}
