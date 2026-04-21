
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int originalNum = sc.nextInt();
		int currentNum = originalNum;
		int sum = 0;
		int newSum = 0;
		int cycle = 0;

		while (true) {
			int a = currentNum / 10;
			int b = currentNum % 10;

			sum = a + b;

			newSum = b * 10 + sum % 10;
			++cycle;

			currentNum = newSum;

			if (currentNum == originalNum) {
				break;
			}
		}
		System.out.println(cycle);
	}
}
