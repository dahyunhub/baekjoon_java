package sliver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class No7785 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int recordCount = sc.nextInt();
		sc.nextLine();
		
		HashSet<String> presentEmployees = new HashSet<>();

		for (int i = 0; i < recordCount; ++i) {
			String[] parts = sc.nextLine().split(" ");

			if (parts[1].equals("enter")) {
				presentEmployees.add(parts[0]);
			} else if (parts[1].equals("leave")) {
				presentEmployees.remove(parts[0]);
			}
		}
		
		ArrayList<String> employeeList = new ArrayList<>(presentEmployees);
		Collections.sort(employeeList, Collections.reverseOrder());

		for (String name : employeeList)
			System.out.println(name);
	}
}
