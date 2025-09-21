package bronze;

import java.util.Scanner;

public class No10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < a.length; ++i) {
			a[i] = sc.nextInt();

			if (a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}
		sc.close();
	}
}
