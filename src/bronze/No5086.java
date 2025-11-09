package bronze;

import java.util.Scanner;

public class No5086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a == 0 && b == 0) {
				return;
				// 입력만 끝낼 때는 break 사용
			} else if (b % a == 0) {
				System.out.println("factor");
			} else if (a % b == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}
	}
}
