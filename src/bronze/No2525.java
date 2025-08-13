package bronze;

import java.util.Scanner;

public class No2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int minute = a * 60 + b;

		int endMinute = minute + c;
		int endHour = 0;

		if (endMinute / 60 > 0) {
			endHour = (endMinute / 60) % 24;
			endMinute = endMinute % 60;
		}
		System.out.println(endHour + " " + endMinute);
		sc.close();
	}
}
