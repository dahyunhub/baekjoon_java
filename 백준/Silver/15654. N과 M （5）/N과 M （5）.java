
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;

	static int[] arr;
	static int[] tmp;

	static boolean[] visited;

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N];
		visited = new boolean[N];
		tmp = new int[M];

		StringTokenizer stList = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(stList.nextToken());
		}

		Arrays.sort(arr);

		permutation(0);
		System.out.println(sb);
	}

	public static void permutation(int depth) {
		// 종료조건
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(tmp[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		// 재귀
		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				tmp[depth] = arr[i];

				permutation(depth + 1);
				visited[i] = false;
			}
		}
	}
}
