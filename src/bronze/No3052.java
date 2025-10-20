package bronze;

import java.util.HashSet;
import java.util.Scanner;

public class No3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] nums = new int[10];
		HashSet<Integer> rest = new HashSet<>();

		for (int i = 0; i < nums.length; ++i) {
			nums[i] = sc.nextInt();
			rest.add(nums[i] % 42);
		}
		System.out.println(rest.size());
	}
}
