package bronze;

import java.util.Scanner;

public class No1259 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			boolean isPalindrome = true;
			String nums = sc.next();

			if (nums.equals("0")) {
				break;
			}

			for (int i = 0; i < nums.length() / 2; ++i) {
				if (nums.charAt(i) != nums.charAt(nums.length() - i - 1)) {
					isPalindrome = false;
					break;
				}
			}

			if (isPalindrome) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
