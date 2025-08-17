package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No15552 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) 
		{
			int t = Integer.parseInt(br.readLine());
			String line;
			int a;
			int b;

			for (int i = 0; i < t; ++i) {
				line = br.readLine();

				String[] nums = line.split(" ");
				a = Integer.parseInt(nums[0]);
				b = Integer.parseInt(nums[1]);

				bw.write((a + b) + "\n");
			}
			bw.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}