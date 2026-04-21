import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N >= 4 && N <= 1000 && N % 4 == 0) {
			for (int i = 0; i < N / 4; ++i) {
				System.out.print("long ");
			}
			System.out.print("int");
		}
	}
}