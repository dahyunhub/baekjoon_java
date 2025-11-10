package bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class No2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		ArrayList<Integer> factors = new ArrayList<>();

		for (int i = 1; i <= n; ++i) {
			if (n % i == 0) {
				factors.add(i);
			}
		}

		if (k > factors.size()) {
			System.out.println(0);
		} else {
			System.out.println(factors.get(k - 1));
		}
	}
}
