
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int M = sc.nextInt();

		for (int i = 0; i < M; i++) {
			int target = sc.nextInt();

			if (binarySearch(arr, target)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}

	static boolean binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid] == target) {
				return true;
			} else if (arr[mid] > target) { // 중간값이 타겟값보다 클 경우
				right = mid - 1;

			} else { // 중간값이 타겟값보다 작은 경우
				left = mid + 1;
			}
		}
		return false;
	}
}
