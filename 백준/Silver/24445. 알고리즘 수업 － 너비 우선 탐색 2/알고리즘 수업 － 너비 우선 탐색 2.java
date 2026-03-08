
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
	static boolean[] visited;
	static int N;
	static List<Integer>[] list;

	static int[] orders;
	static int order = 1;
	static Deque<Integer> deque;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		deque = new ArrayDeque<>();

		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		visited = new boolean[N + 1];
		orders = new int[N + 1];

		list = new ArrayList[N + 1];

		for (int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());

			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());

			list[left].add(right);
			list[right].add(left);
		}

		// 내림차순
		for (int i = 1; i <= N; i++) {
			list[i].sort(Collections.reverseOrder());
		}

		bfs(R);
		for (int i = 1; i < orders.length; i++) {
			System.out.println(orders[i]);
		}

	}

	public static void bfs(int start) {
		// 덱에 넣고,
		deque.offer(start);
		visited[start] = true;

		orders[start] = order++;
		// 덱에 넣은 숫자의 인덱스 만큼 리스트 for문 돌고

		while (!deque.isEmpty()) {
			int now = deque.poll();

			for (int i = 0; i < list[now].size(); i++) {
				int n = list[now].get(i);
				
				if (!visited[n]) {
					visited[n] = true;
					orders[n] = order++;
					deque.offer(n);
				}
			}
		}
	}
}
