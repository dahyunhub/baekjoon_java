
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<int[]> deque = new ArrayDeque();
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			int move = Integer.parseInt(st.nextToken());
			deque.offer(new int[] { i, move }); // i번째에 3, -1 같은 이동수를 함께 넣는다.
		}

		// 반복문을 돌겠지 모든 풍선이 터질때까지
		while (!deque.isEmpty()) {
			// 맨 앞을 먼저 터트릴거야,
			// 근데 맨앞의 숫자가 적힌 만큼 이동해서 다음 풍선을 터트릴거야
			int next = deque.peek()[1];

			int move = Math.abs(next);

			sb.append(deque.peek()[0] + 1 + " ");
			deque.poll(); // 현재 풍선은 터트리기

			if (deque.isEmpty()) {
				break;
			}
			
			// 양수인경우
			if (next > 0) {
				for (int i = 0; i < move - 1; ++i) {
					// 다음걸 뒤에 넣고, 삭제하기
					deque.offer(deque.poll());
				}

				// 음수인경우
			} else if (next < 0) {
				for (int i = 0; i < move; ++i) {
					deque.offerFirst(deque.pollLast());
				}
			}

			// 0인 경우는 움직임이 없어서 가만히 있으면 저절로 다음걸로 넘어가겠지

		}
		System.out.println(sb.toString());
	}
}
