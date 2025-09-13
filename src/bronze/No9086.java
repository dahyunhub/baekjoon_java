package bronze;

import java.util.Scanner;

public class No9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < t; ++i) {
			String str = sc.nextLine();

			if (str.length() > 0) {
				System.out.println("" + str.charAt(0) + str.charAt(str.length() - 1));
			}
		}
		sc.close();
	}
}
