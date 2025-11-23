package bronze;

import java.util.Scanner;

public class No1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int original = sc.nextInt();
		int current = original;
		int cycleLen = 0;

		while (true) {
			int a = current / 10;
			int b = current % 10;

			int digitsSum = a + b;
			int newSum = b * 10 + digitsSum % 10;

			++cycleLen;
			current = newSum;

			if (current == original) {
				break;
			}
		}
		System.out.println(cycleLen);
	}
}
