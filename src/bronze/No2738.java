package bronze;

import java.util.Scanner;

public class No2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				b[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				System.out.print(a[i][j] + b[i][j] + " ");
			}
			System.out.println();
		}
		// 2차원 배열값 출력하기
		// System.out.println(Arrays.deepToString(a)); 
		// System.out.println(Arrays.deepToString(b)); 
	}
}
