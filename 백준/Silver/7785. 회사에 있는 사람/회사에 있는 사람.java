import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int accessRecords = sc.nextInt();
		sc.nextLine();

		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < accessRecords; ++i) {
			String[] str = sc.nextLine().split(" ");

			if (str[1].equals("enter")) {
				set.add(str[0]);
			} else if (str[1].equals("leave")) {
				set.remove(str[0]);
			}

		}
		ArrayList<String> arr = new ArrayList<>(set);
		Collections.sort(arr, Collections.reverseOrder());

		for (String emp : arr)
			System.out.println(emp);
	}
}
