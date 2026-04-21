
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int majorCount = 20;

		double creditSum = 0; // 학점의 총합
		double majorSum = 0; // 전공평점

		double[] dou = new double[majorCount];
		// 전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.

		for (int i = 0; i < majorCount; ++i) {
			String subjectGrade = sc.nextLine();
			String[] subjectGradeInfo = subjectGrade.split(" ");

			if (subjectGradeInfo[2].equals("P")) {
				continue;
			}

			double credit = Double.parseDouble(subjectGradeInfo[1]);
			creditSum += credit;

			double subjectAvg = 0;

			switch (subjectGradeInfo[2]) {
			case "A+": {
				subjectAvg = 4.5;
				break;
			}
			case "A0": {
				subjectAvg = 4.0;
				break;
			}
			case "B+": {
				subjectAvg = 3.5;
				break;
			}
			case "B0": {
				subjectAvg = 3.0;
				break;
			}
			case "C+": {
				subjectAvg = 2.5;
				break;
			}
			case "C0": {
				subjectAvg = 2.0;
				break;
			}
			case "D+": {
				subjectAvg = 1.5;
				break;
			}
			case "D0": {
				subjectAvg = 1.0;
				break;
			}
			case "F": {
				subjectAvg = 0.0;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + subjectGradeInfo[2]);
			}

			dou[i] = credit * subjectAvg;
		}

		for (double d : dou) {
			majorSum += d;
		}
		System.out.printf("%.6f", majorSum / creditSum);

	}
}
