package bronze;

import java.util.Scanner;

public class No1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gradeCount = sc.nextInt();

		double[] grades = new double[gradeCount];
		double maxGrade = 0;

		for (int i = 0; i < gradeCount; ++i) {
			grades[i] = sc.nextDouble();

			if (grades[i] > maxGrade) {
				maxGrade = grades[i];
			}
		}
		double avgSum = 0;

		for (int i = 0; i < grades.length; ++i) {
			avgSum += grades[i] / maxGrade * 100;
		}
		
		System.out.println(avgSum / gradeCount);
	}
}
