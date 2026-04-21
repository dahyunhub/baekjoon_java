
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

			String line;
			int a;
			int b;
			
			while ((line = br.readLine()) != null) {

				String[] nums = line.split(" ");
				a = Integer.parseInt(nums[0]);
				b = Integer.parseInt(nums[1]);

				System.out.println(a + b);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
