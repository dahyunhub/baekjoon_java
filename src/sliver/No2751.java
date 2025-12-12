package sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class No2751 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>(n);

		for (int i = 0; i < n; ++i) {
			arr.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(arr);

		for (int num : arr) {
			sb.append(num).append('\n');
		}
		System.out.print(sb.toString());
	}
}
