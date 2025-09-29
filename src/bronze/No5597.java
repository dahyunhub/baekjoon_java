package bronze;

import java.util.Scanner;

public class No5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] students = new int[30];
		for (int i = 0; i < students.length; ++i) {
			students[i] = i + 1;
		}

		int submittedCount = 28;

		for (int i = 0; i < submittedCount; ++i) {
			int p = sc.nextInt();

			for (int j = 0; j < students.length; ++j) {
				if (p == students[j]) {
					students[j] = 0;
					break;
				}
			}
		}
		for (int i = 0; i < students.length; ++i) {
			if (students[i] != 0) {
				System.out.println(students[i]);
			}
		}
	}
}
