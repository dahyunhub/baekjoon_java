import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gradeCount = sc.nextInt();
		
		double[] grades = new double [gradeCount];
		double maxGrade = 0;
		
		for (int i = 0; i < gradeCount; ++i) {
			int grade = sc.nextInt();
			grades[i] = grade;
			
			if (grades[i] > maxGrade) {
				maxGrade = grades[i];
			}
		}
		
		double avgSum = 0;
		
		for (int i = 0; i < grades.length; ++i) {
			avgSum += grades[i] / maxGrade * 100;
		}
		
		System.out.print(avgSum/gradeCount);
	}
}
