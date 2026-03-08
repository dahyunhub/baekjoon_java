
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static Deque<Integer> queue;

	static int N;
	static List<Integer>[] arr;
	static boolean[] visited;
	static int[] order;
	static int orderNum;

	public static void main(String[] args) throws IOException {

		queue = new ArrayDeque<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		arr = new ArrayList[N + 1];
		visited = new boolean[N + 1];
		order = new int[N + 1];

		for (int i = 1; i < arr.length; i++) {
			arr[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());

			arr[left].add(right);
			arr[right].add(left);
		} // 인접 리스트에 값 다 넣음

		for (int i = 1; i < arr.length; i++) {
			Collections.sort(arr[i]);
		}

		orderNum = 1;

		bfs(R);

		for (int i = 1; i < order.length; i++) {
			sb.append(order[i]).append("\n");
		}

		System.out.println(sb.toString());

	}

	public static void bfs(int node) {

		queue.offer(node);
		visited[node] = true;

		order[node] = orderNum++;

		while (!queue.isEmpty()) {
			int now = queue.poll();

			for (int i = 0; i < arr[now].size(); i++) {
				int n = arr[now].get(i);
				if (!visited[n]) {
					visited[n]= true;
					order[n] = orderNum++;
					queue.offer(n);
				}
			}
		}
	}
}
