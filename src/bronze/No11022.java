package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11022 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int t = Integer.parseInt(br.readLine());

			int a, b;

			for (int i = 1; i <= t; ++i) {
				String[] nums = br.readLine().split(" ");
				a = Integer.parseInt(nums[0]);
				b = Integer.parseInt(nums[1]);

				System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, a + b);
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
