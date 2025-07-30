package bronze;

import java.util.Scanner;

public class No2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int prizeMoney = 0;

		if (a == b && b == c) {
			prizeMoney = 10000 + a * 1000;
		} else if (a == b || a == c) {
			prizeMoney = 1000 + a * 100;
		} else if (b == c) {
			prizeMoney = 1000 + b * 100;
		} else {
			prizeMoney = Math.max(a, Math.max(b, c)) * 100;
		}
		System.out.println(prizeMoney);

		sc.close();
	}
}
