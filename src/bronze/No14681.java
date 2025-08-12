package bronze;

import java.util.Scanner;

public class No14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		char quadrant = '0';

		if (x >= -1000 && x <= 1000 && x != 0 && y >= -1000 && y <= 1000 && y != 0) {
			if (x > 0 && y > 0) {
				quadrant = '1';
			} else if (x < 0 && y > 0) {
				quadrant = '2';
			} else if (x < 0 && y < 0) {
				quadrant = '3';
			} else if (x > 0 && y < 0) {
				quadrant = '4';
			}
			System.out.printf("%c", quadrant);
		}
		sc.close();

	}
}
