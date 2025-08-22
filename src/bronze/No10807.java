package bronze;

import java.util.Scanner;

public class No10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] nums = new int[n];
		
		if (n >= 1 && n <= 100) {
			for (int i = 0; i < n; ++i) {
				nums[i] = sc.nextInt();
			}
			int v = sc.nextInt();
			int vCount = 0;
			if (v >= -100 && v <= 100) {
				for (int i = 0; i < nums.length; ++i) {
					if (v == nums[i]) {
						++vCount;
					}
				}
			}
			System.out.println(vCount);
		}
		sc.close();
	}
}

