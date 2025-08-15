package bronze;

import java.util.Scanner;

public class No25314 {
		public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n >= 4 && n <= 1000 && n % 4 == 0) {
			for (int i = 0; i < n / 4; ++i) {
				System.out.print("long ");
			}
			System.out.print("int");
		}
		sc.close();
	}
}