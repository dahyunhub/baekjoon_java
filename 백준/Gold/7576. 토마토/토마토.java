
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	// 토마토
	static int M;
	static int N;
	static int[][] box;

	// 상하좌우
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		Deque<int[]> deque = new ArrayDeque<>();

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		box = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				// 우선은 토마토를 찾아야지
				if (box[i][j] == 1) {
					deque.offer(new int[] { i, j });
				}
			}
		}

		while (!deque.isEmpty()) {
			int[] cur = deque.poll();

			for (int d = 0; d < 4; d++) {
				int nr = cur[0] + dr[d];
				int nc = cur[1] + dc[d];

				// 범위 확인
				if (nr < 0 || nc < 0 || nr >= N || nc >= M || box[nr][nc] != 0) {
					continue;
				}

				box[nr][nc] = box[cur[0]][cur[1]] + 1;
				deque.offer(new int[] { nr, nc });

			}
		}

		int mx = 0;

		boolean flag = false;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {

				// 여기서 만약에 0을 안 거르고 넘어가면
				// 아직 다 익지 않은 상태에서 날짜를 갱신한다.
				if (box[i][j] == 0) {
					mx = 0;
					flag = true;
					break;
				}
				mx = Math.max(mx, box[i][j]);
			}
			if (flag)
				break;
		}

		if (flag) {
			System.out.println(-1);
		} else {
			System.out.println(mx - 1);
		}
	}
}
