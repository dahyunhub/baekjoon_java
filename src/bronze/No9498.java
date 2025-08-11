package bronze;

import java.util.Scanner;

public class No9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testScore = sc.nextInt();

		if (testScore >= 0 && testScore <= 100) {
			if (testScore < 60) {
				System.out.println("F");
			} else if (testScore >= 90 && testScore <= 100) {
				System.out.println("A");
			} else if (testScore >= 80 && testScore <= 89) {
				System.out.println("B");
			} else if (testScore >= 70 && testScore <= 79) {
				System.out.println("C");
			} else if (testScore >= 60 && testScore <= 69) {
				System.out.println("D");
			}
		}
		sc.close();
	}
}
