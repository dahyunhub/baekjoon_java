import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<Integer>[] list;
	static int[] ans;

	static int N;

	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		// 배열안에 리스트 있는 말로 인접리스트....
		list = new ArrayList[N + 1];
		for (int i = 0; i <= N; i++) {
			list[i] = new ArrayList<>();
		}

		ans = new int[N + 1];

		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());

			list[left].add(right);
			list[right].add(left);
		} // 입력

		for (int i = 0; i < list.length; i++) {
			Collections.sort(list[i]);
		}

		cnt = 1;
		dfs(R);

		for (int i = 1; i < ans.length; i++) {
			sb.append(ans[i]).append("\n");
		}

		System.out.println(sb.toString());
	}

	public static void dfs(int node) {
		ans[node] = cnt++;
		// 모든 list를 오름차순으로 정렬

		// 이건 배열이 아니라 배열 안에 있는 list 사이즈 만큼 for문 돌리기
		for (int i = 0; i < list[node].size(); i++) {
			int a = list[node].get(i);

			if (ans[a] == 0) {
				dfs(a);
			}
		}

	}

}
