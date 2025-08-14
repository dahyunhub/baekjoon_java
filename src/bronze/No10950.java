package bronze;

import java.util.Scanner;

public class No10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int answer[] = new int[T];
		int input = 0;

		for (int i = 0; i < T; ++i) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			if (A > 0 && B < 10) {
				++input;
				answer[i] = A + B;

				if (input != T) {
					continue;
				}
			}
			for (int j = 0; j < T; ++j) {
				System.out.println(answer[j]);
			}
		}
		sc.close();
	}
}
