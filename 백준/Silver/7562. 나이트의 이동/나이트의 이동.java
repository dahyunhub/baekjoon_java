
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	// 나이트가 갈 수 있는 범위의 델타배열
	static int[] dr = { -1, -2, -2, -1, 1, 2, 2, 1 };
	static int[] dc = { -2, -1, 1, 2, 2, 1, -1, -2 };

	static int I;
	static int[][] map;
	static int cr, cc, disR, disC;

	static int minCnt;
	static boolean[][] visited;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			I = Integer.parseInt(br.readLine());

			map = new int[I][I];
			visited = new boolean[I][I];

			StringTokenizer st = new StringTokenizer(br.readLine());
			cr = Integer.parseInt(st.nextToken()); // 현재 r위치
			cc = Integer.parseInt(st.nextToken()); // 현재 c위치

			st = new StringTokenizer(br.readLine());
			disR = Integer.parseInt(st.nextToken()); // 목적지 r위치
			disC = Integer.parseInt(st.nextToken()); // 목적지 c위치

			minCnt = 0;
			Deque<int[]> q = new ArrayDeque<>();

			q.offer(new int[] { cr, cc });
			visited[cr][cc] = true;
			map[cr][cc] = 0;

			while (!q.isEmpty()) {
				int[] cur = q.poll();

				if (cur[0] == disR && cur[1] == disC) {
					System.out.println(map[cur[0]][cur[1]]);
					break;
				}

				for (int i = 0; i < 8; i++) {
					int nr = cur[0] + dr[i];
					int nc = cur[1] + dc[i];

					if (nr < 0 || nc < 0 || nr >= I || nc >= I) {
						continue;
					}

					if (visited[nr][nc]) {
						continue;
					}

					map[nr][nc] = map[cur[0]][cur[1]] + 1;
					visited[nr][nc] = true;
					q.offer(new int[] { nr, nc });

//					if (nr == disR && nc == disC) {
//					} // 이거보단 현재상태가 도착지인지 확인하는게 더 좋다.
				}
			}
		} // tc
	}
}
