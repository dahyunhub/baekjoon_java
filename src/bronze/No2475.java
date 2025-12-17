package bronze;

import java.util.Scanner;

public class No2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumOfSquares = 0;

		for (int i = 0; i < 5; ++i) {
			int number = sc.nextInt();
			sumOfSquares += number * number;
		}
		
		int verificationDigit = sumOfSquares % 10;
		System.out.println(verificationDigit);
	}
}
