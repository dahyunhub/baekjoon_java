package bronze;

import java.util.Scanner;

public class No10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];

		for (int num = 0; num < n; ++num) {
			arr[num] = num + 1;
		}

		for (int count = 0; count < m; ++count) {
			int i = sc.nextInt();
			int j = sc.nextInt();

			int iIndex = i - 1;
			int jIndex = j - 1;

			int tmp = arr[iIndex];
			arr[iIndex] = arr[jIndex];
			arr[jIndex] = tmp;
		}

		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}
}
