package bronze;

import java.util.Scanner;

public class No2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		StringBuilder reverseA = new StringBuilder();
		StringBuilder reverseB = new StringBuilder();

		for (int i = 0; i < a.length(); ++i) {
			reverseA.append(a.charAt(a.length() - 1 - i));
		}
		for (int i = 0; i < b.length(); ++i) {
			reverseB.append(b.charAt(b.length() - 1 - i));
		}
		System.out.println(Math.max(Integer.parseInt(reverseA.toString()), Integer.parseInt(reverseB.toString())));
	}
}
