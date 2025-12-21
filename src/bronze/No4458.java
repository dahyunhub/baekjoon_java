package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class No4458 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; ++i) {
			String str = br.readLine();
			char[] ch = str.toCharArray();

			ch[0] = Character.toUpperCase(ch[0]);

			System.out.println(ch);
		}
	}
}
