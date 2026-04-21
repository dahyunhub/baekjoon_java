import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static int[][] map;
	static int[] selected; // 몇번째 치킨집을 골랐는지를 저장하는 배열

	static List<int[]> chickens; // 치킨집 좌표를저장할 리스
	static List<int[]> houses;

	static int minDist; // 도시의 치킨 거리 최솟값

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken()); // 하나의 조합에서 뽑을 치킨 가게 개

		selected = new int[M];

		map = new int[N + 1][N + 1];

		chickens = new ArrayList<>();
		houses = new ArrayList<>();

		minDist = Integer.MAX_VALUE;

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());

				if (map[i][j] == 1) { // 집인 경우
					houses.add(new int[] { i, j }); // 집의 좌표를 리스트에 저장
				}
				if (map[i][j] == 2) { // 치킨집인경우
					chickens.add(new int[] { i, j }); // 치킨집의 좌표를 리스트에 저장, 인덱스는 0부터
				}
			}
		} // 입력

		combination(0, 0);
		System.out.println(minDist);

	}

	public static void combination(int start, int depth) {
		// M개만큼 치킨집을 골랐을 경우 return
		if (depth == M) {
			// 치킨집을 골랐으면 이제 집 하나씩 모든 치킨집을 돌아야한다!
			int cityDist = 0;

			for (int[] house : houses) {
				int hr = house[0];
				int hc = house[1];

				// 집에서 제일 가까운 치킨집까지의 거리
				int houseMin = Integer.MAX_VALUE;

				for (int i = 0; i < M; i++) {
					int cr = chickens.get(selected[i])[0];
					int cc = chickens.get(selected[i])[1];

					int dist = Math.abs(hr - cr) + Math.abs(hc - cc);
					houseMin = Math.min(houseMin, dist);
				}
				// 최소 거리들을 다 더한다.
				cityDist += houseMin;
			}
			minDist = Math.min(minDist, cityDist);
			return;
		}

		// 재귀 : 치킨집 개수만큼 확인 해야하기 때문에 M이 아니라 chickens.size만
		for (int i = start; i < chickens.size(); i++) {
			selected[depth] = i;

			combination(i + 1, depth + 1);

			// 다른 조합도 찾아보기 위한 백트래
		}
	}
}
