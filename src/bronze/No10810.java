package bronze;

import java.util.Scanner;

public class No10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int num = 1; num <= m; ++num) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();

			int index = i;
			
			while (index <= j) {
				arr[index] = k;
				++index;
			}
			System.out.println(arr[i]);
		}
		
	}
}
