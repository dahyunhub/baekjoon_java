package bronze;

import java.util.Scanner;

public class No2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int mltpl = a * b * c;
		int[] count = new int[10];

		String result = Integer.toString(mltpl);

		for (int i = 0; i < result.length(); ++i) {
			count[result.charAt(i) - '0']++;
		}
		
		for (int i = 0; i < 10; ++i) {
			System.out.println(count[i]);
		}

		sc.close();
	}
}
