package bronze;

import java.util.Scanner;

public class No2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < t; ++i) {
			int r = sc.nextInt();
			String s = sc.next();

			for (int j = 0; j < s.length(); ++j) {
				sb.append(String.valueOf(s.charAt(j)).repeat(r));
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
