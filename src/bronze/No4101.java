package bronze;

import java.util.Scanner;

public class No4101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a == 0 && b == 0) {
				break;
			}
			
			System.out.println(a > b ? "Yes":"No");
		}
	}
}
