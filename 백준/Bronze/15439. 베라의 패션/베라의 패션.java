
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int N; // 상의, 하의가 N개의 색이 있을때
	static int cnt; // 조합의 개수
	static int[] arr; // 각각의 조합
	static boolean[] visited;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[2];
		visited = new boolean[N + 1];
		cnt = 0;

		permu(0);
		System.out.println(cnt);

	}

	public static void permu(int depth) {

		// 기저조건
		if (depth == 2) {
			cnt++;
			return;
		}

		// 재귀
		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = i;
				permu(depth + 1);
				visited[i] = false;

			}
		}
	}
}
