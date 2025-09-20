package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10951 {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

			String line;
			
			while ((line = br.readLine()) != null) {

				String[] nums = line.split(" ");
				int a = Integer.parseInt(nums[0]);
				int b = Integer.parseInt(nums[1]);

				System.out.println(a + b);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
