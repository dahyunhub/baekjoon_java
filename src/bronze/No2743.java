package bronze;

import java.util.Scanner;

public class No2743 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		if (str.length() <= 100) {
			int charCount = str.length();
			System.out.println(charCount);
		}
	}
}

