
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		boolean[][] height = new boolean[N + 1][N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());

			int low = Integer.parseInt(st.nextToken());
			int high = Integer.parseInt(st.nextToken());

			height[low][high] = true;

		}

		for (int k = 1; k <= N; k++) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (height[i][k] && height[k][j]) {
						height[i][j] = true;
					}
				}
			}
		}

		// 자기 키순서를 알 수 있는 학생이 총 몇명인지
		int ans = 0;

		for (int i = 1; i <= N; i++) {
			// i는 각각의 학생을 의미 - 그래서 cnt=0으로 초기화해야한다.
			// 현재 보고 있는 한 학생이 몇명과 키 비교가 가능한지 
			int cnt = 0;

			for (int j = 1; j <= N; j++) {
				if (i == j) {
					continue;
				}

				// i가 j보다 작거나, j가 i보다 작으면
				// 둘 사이의 키 관계를 알 수 있음
				// 상대적인 키 관계를 알 수 있는지만 확인하면 되기 때문에 둘 중 하나만 알면 충분하다.
				// i는 j보다 작다 또는 j는 i보다 작다
				// 만약 &&인 경우 i가 j보다 작으면서 j가 i보다 작다..?? -> 말이 안된다...
				
				if (height[i][j] || height[j][i]) {
					cnt++;
				}

				// 왜 cnt == N-1일까?
				// 학생은 총 N명인데, 자기 자신을 제외한 학생수는 N-1이기 때문에
				// 6번 학생이 5명의 학생과의 키 순서 관계를 알 수 있으면 정확한 순서를 알 수 있다. 
				if (cnt == N-1) {
					ans++;
				}
				
			}
			
			
		}
		System.out.println(ans);

	}
}
