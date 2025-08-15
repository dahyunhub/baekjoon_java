package bronze;

import java.util.Scanner;

public class No25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		int tmp = 0;
		
		for (int i = 0; i < n; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (x >= 1 && x <= 1000000000 && 
					n >= 1 && n <= 100 && 
					a >= 1 && a <= 1000000 &&
					b >= 1 && b <= 10) {
				tmp += a*b;
			}
		}
		if (x == tmp) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		sc.close();
	}
}