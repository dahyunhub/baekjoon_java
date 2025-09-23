package bronze;

import java.util.Scanner;

public class No2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];

		arr[0] = sc.nextInt();
		int max = arr[0];
		int index = 0;
		
		for (int i = 1; i < arr.length; ++i) {
			arr[i] = sc.nextInt();

			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index + 1);
		sc.close();
	}
}
