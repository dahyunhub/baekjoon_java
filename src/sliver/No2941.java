package sliver;

import java.util.Scanner;

public class No2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		for (String c : croatia) {
			s = s.replace(c, "*");
		}
		System.out.println(s.length());
	}
}
