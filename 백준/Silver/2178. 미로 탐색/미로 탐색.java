
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	// 상하좌우
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	static int N, M;
	static int[][] map;
	static boolean[][] visited;

	static int cnt;
	static int minCnt;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		visited = new boolean[N][M];

		minCnt = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}

		Deque<int[]> q = new ArrayDeque<>();

		q.offer(new int[] { 0, 0 });
		visited[0][0] = true;

		while (!q.isEmpty()) {
			int cur[] = q.poll();

			for (int i = 0; i < 4; i++) {
				int nr = cur[0] + dr[i];
				int nc = cur[1] + dc[i];

				if (nr < 0 || nc < 0 || nr >= N || nc >= M) {
					continue;
				}

				if (map[nr][nc] == 0 || visited[nr][nc]) {
					continue;
				}

				visited[nr][nc] = true;
				map[nr][nc] = map[cur[0]][cur[1]] + 1;
				q.offer(new int[] { nr, nc });
			}
		}

		// 0,0 에서 N-1, M-1로 가야한다..
		System.out.println(map[N - 1][M - 1]);
	}
}
