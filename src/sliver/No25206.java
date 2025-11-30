package sliver;

import java.util.Scanner;

public class No25206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int COURSE_COUNT = 20;

		double totalCredits = 0.0;
		double totalWeightedGrades = 0.0;

		for (int i = 0; i < COURSE_COUNT; ++i) {
			String[] parts = sc.nextLine().split(" ");

			if (parts[2].equals("P")) {
				continue;
			}

			double courseCredit = Double.parseDouble(parts[1]);
			totalCredits += courseCredit;

			double gradePoint = switch (parts[2]) {
			case "A+" -> 4.5;
			case "A0" -> 4.0;
			case "B+" -> 3.5;
			case "B0" -> 3.0;
			case "C+" -> 2.5;
			case "C0" -> 2.0;
			case "D+" -> 1.5;
			case "D0" -> 1.0;
			case "F" -> 0.0;
			default -> throw new IllegalArgumentException("Unexpected value: " + parts[2]);
			};

			totalWeightedGrades += courseCredit * gradePoint;
		}
		System.out.printf("%.6f", totalWeightedGrades / totalCredits);
	}
}
