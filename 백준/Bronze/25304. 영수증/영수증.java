import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		
		int tmp = 0;
		
		for (int i = 0; i < N; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (X >= 1 && X <= 1000000000 && 
					N >= 1 && N <= 100 && 
					a >= 1 && a <= 1000000 &&
					b >= 1 && b <= 10) {
				tmp += a*b;
			}
		}
		if (X == tmp) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}