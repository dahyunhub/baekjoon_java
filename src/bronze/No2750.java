package bronze;

import java.util.Scanner;

public class No2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length - 1; ++i) {
			int min = arr[i];
			int minIndex = i;

			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}

		for (int number : arr) {
			System.out.println(number);
		}

	}
}
