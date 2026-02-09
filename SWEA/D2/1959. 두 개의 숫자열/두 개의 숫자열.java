
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] arrA = new int[N];
			int[] arrB = new int[M];
			
			for (int i = 0 ; i < N ; i++) {
				arrA[i] = sc.nextInt();
			} // arrA 입력

			for (int i = 0 ; i < M ; i++) {
				arrB[i] = sc.nextInt();
			} // arrB 입력
			
			int maxSum = Integer.MIN_VALUE; // 최댓값을 담을 변수
			
			// 더 긴 배열을 기준으로 반복문 돌리기
			// N이 더 긴 배열인 경우
			if (N > M) {
				for (int i = 0 ; i <= N - M; i++) {
					// 마주보는 숫자들의 곱을 더한 값을 넣을 변수 초기화
					int sum = 0;
					
					for (int j = 0; j < M ; j++) {
						// arrA의 자릿수는 j에 맞춰 움직인다.
						// arrB는 0,1,2 반복
						sum += arrA[i+j] * arrB[j];
					}
					maxSum = Math.max(maxSum, sum);
				}
				
			// M이 더 긴 배열인 경우
			} else {
				for (int i = 0 ; i <= M - N ; i++) {
					int sum = 0;
					
					for (int j = 0; j < N; j++) {
						sum += arrB[i+j] * arrA[j];
					}
					maxSum = Math.max(maxSum, sum);
				}
			}
			
			System.out.printf("#%d %d\n", tc, maxSum);
		} // tc
	}
}
