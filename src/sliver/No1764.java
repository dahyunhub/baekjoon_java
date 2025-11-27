package sliver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class No1764 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int unheardCount = sc.nextInt();
		int unseenCount = sc.nextInt();

		HashSet<String> unheard = new HashSet<>();
		for (int i = 0; i < unheardCount; ++i) {
			unheard.add(sc.next());
		}

		ArrayList<String> result = new ArrayList<>();
		for (int i = 0; i < unseenCount; ++i) {
			String name = sc.next();

			if (unheard.contains(name)) {
				result.add(name);
			}
		}
		Collections.sort(result);

		System.out.println(result.size());
		for (String name : result) {
			System.out.println(name);
		}
	}
}
