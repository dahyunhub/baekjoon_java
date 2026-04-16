
import java.util.Scanner;

public class Main {

	static int fiboCount = 0;
	static int dpCount = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		fib(N);
		fibonacci(N);

		System.out.println(fiboCount + " " + dpCount);
	}

	static int fib(int n) {
		if (n == 1 || n == 2) {
			fiboCount++;
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}

	static int fibonacci(int n) {
		int[] f = new int[n + 1];

		f[1] = 1;
		f[2] = 1;

		int count = 0;

		for (int i = 3; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
			dpCount++;
		}

		return f[n];

	}
}
