
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution {
	static boolean[] visited;
	static int N;
	static int M;
	static int[] tmp = new int[2];
	static int sum;

	static Map<Integer, Integer> map;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; ++tc) {
			StringBuilder sb = new StringBuilder();
			StringTokenizer st = new StringTokenizer(br.readLine());

			// 1번세트 - 여기서 2개
			N = Integer.parseInt(st.nextToken());

			// 2번세트 - 여기서 1개
			M = Integer.parseInt(st.nextToken());

			map = new HashMap<>();

			combinSum(0, 1);

			int maxCnt = 0;
			int answer = 0;
			// 내가 하고 싶은건...
			// map 전체를 반복문 돌면서
			// 가장 value 값이 가장 큰 걸 찾고 싶어,
			// 찾으면 그걸 sb에 넣어, 마지막에 한 번 출력 끝

			List<Integer> list = new LinkedList<>();

			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				int key = entry.getKey();
				int value = entry.getValue();

				if (value > maxCnt) {
					maxCnt = value;
					list = new LinkedList<>();
					list.add(key);

				} else if (value == maxCnt) {
					list.add(key);
				}
			}

			for (int n : list) {
				sb.append(n + " ");
			}

			System.out.printf("#%d %s\n", tc, sb.toString());

		} // tc
	}

	// 1번 카드 세트에서 각각의 조합의 합을 뽑아낸다.
	public static void combinSum(int depth, int start) {
		// 종료 (나온 두개의 값을 더한 값을 리턴한다.)
		if (depth == tmp.length) {
			sum = 0;
			for (int n : tmp) {
				sum += n;
			}

			for (int i = 1; i <= M; i++) {
				int total = sum + i;

				// 이미 map에 있는 최종합일 경우
				if (map.containsKey(total)) {
					map.put(total, map.get(total) + 1);

					// map에 없는 최종합일 경우
				} else {
					map.put(total, 1);
				}
			}
			return;
		}

		// 재귀
		for (int i = start; i <= N; i++) {
			tmp[depth] = i;
			combinSum(depth + 1, i + 1);
		}

	}

}
