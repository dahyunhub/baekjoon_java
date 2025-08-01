package bronze;

import java.util.Scanner;

public class No2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();

		int newH = 0;
		int newM = 0;

		if (H >= 0 && H <= 23 && M >= 0 && M <= 59) {
			newM = M - 45;

			if (newM < 0) {
				newH = H - 1;
				newM = 60 + newM;
				if (newH < 0) {
					newH = 24 + newH;
				}
			} else {
				newH = H;
			}

			System.out.print(newH + " " + newM);
			sc.close();
		}
	}
}
