
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static int N;

	static List<Integer>[] arr;
	static int[] order;
	static boolean[] visited;

	static int orderNum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		// 0번 인덱스는 비워두기!
		arr = new ArrayList[N + 1];
		visited = new boolean[N + 1];
		order = new int[N + 1];

		// list 자리 만들기
		for (int i = 1; i <= N; i++) {
			arr[i] = new ArrayList<>();
		}

		// 간선의 개수 M만큼 인접리스트에 값넣기
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());

			arr[left].add(right);
			arr[right].add(left);
		}

		// 내림차순 정렬
		for (int i = 1; i <= N; i++) {
			Collections.sort(arr[i], Collections.reverseOrder());
		}

		// orderNum을 1로 초기화
		orderNum = 1;

		dfs(R);

		for (int i = 1; i <= N; i++) {
			sb.append(order[i]).append("\n");
		}

		System.out.println(sb.toString());
	}

	public static void dfs(int node) {
		// 방문했다~
		visited[node] = true;
		order[node] = orderNum++;

		for (int i = 0; i < arr[node].size(); i++) {
			int n = arr[node].get(i);
			if (!visited[n]) {
				dfs(n);
			}
		}
	}
}
