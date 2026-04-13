
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		System.out.println(factorial(N));
	}

	static long factorial(int n) {
		// 종료

		if (n == 0 || n == 1) {
			return 1;
		}

		// 재귀
		return n * factorial(n - 1);
	}
}
