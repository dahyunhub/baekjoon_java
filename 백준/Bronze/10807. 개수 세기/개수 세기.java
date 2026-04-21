import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] nums = new int[N];
		
		if (N >= 1 && N <= 100) {
			for (int i = 0; i < N; ++i) {
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
	}
}
