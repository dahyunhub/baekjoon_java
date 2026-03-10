import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int M;
	static int N;
	static int[][] field;

	// 상하좌우
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	static boolean[][] visited;
	static int cnt;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());

			field = new int[N][M];
			visited = new boolean[N][M];

			int K = Integer.parseInt(st.nextToken());
			cnt = 0;

			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				int y = Integer.parseInt(st.nextToken());
				int x = Integer.parseInt(st.nextToken());
				field[x][y] = 1;
			} // 배추심기

			for (int i = 0; i < N; i++) {
				for (int j =0; j < M; j++) {
					// 배추인 경우에만
					// 현재 배추가 확인하지 않은 배추일 때만 확인하기
					if (field[i][j] == 1 && !visited[i][j]) {
						bfs(i, j);
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
		}
	}

	// 방문표시를 visited[][]로 해야하나?
	static void bfs(int x, int y) {
		// x, y 좌표를 받아오면... 그 위치를 중심으로 델타탐색을 해서 근방에 있는 모든 배추 확인하기
		// 그리고 배추흰지렁이 cnt++ 하기

		visited[x][y] = true;
		// 이번 배추는 확인했습니다!~

		for (int d = 0; d < 4; d++) {
			int nr = x + dr[d];
			int nc = y + dc[d];

			// field 안에 들어가는지 확인하기
			if (nr < 0 || nc < 0 || nr >= N || nc >= M) {
				continue;
			}

			if (field[nr][nc] == 1 && !visited[nr][nc]) {
				bfs(nr, nc);
			}
		}
	}
}
