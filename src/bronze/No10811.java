package bronze;

import java.util.Scanner;

public class No10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] baskets = new int[n];

		for (int index = 0; index < n; ++index) {
			baskets[index] = index + 1;
		}

		for (int k = 0; k < m; ++k) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;

			while (i < j) {
				int tmp = baskets[i];
				baskets[i] = baskets[j];
				baskets[j] = tmp;
				i++;
				j--;
			}
		}
		for (int index = 0; index < n; ++index) {
			System.out.print(baskets[index] + " ");
		}
		sc.close();
	}
}
