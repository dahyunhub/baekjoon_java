package bronze;

import java.io.IOException;
import java.util.Scanner;

public class No2420 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long m = sc.nextLong();

		System.out.println(Math.abs(n - m));

	}
}
