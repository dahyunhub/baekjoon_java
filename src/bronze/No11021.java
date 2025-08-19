package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No11021 {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			int t = Integer.parseInt(br.readLine());
			int a, b;
			
			for (int i = 1; i <= t; ++i) {
				String[] nums = br.readLine().split(" ");
				a = Integer.parseInt(nums[0]);
				b = Integer.parseInt(nums[1]);
				
				System.out.printf("Case #%d: %d\n", i, a + b);
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
