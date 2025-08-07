package bronze;

import java.util.Scanner;

public class No11382 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		
		if (A >= 1 && A <= 1000000000000L &&
				B >= 1 && B <= 1000000000000L &&
				C >= 1 && C <= 1000000000000L) {
			System.out.println((long)(A + B + C));
		}
		sc.close();
	}
}