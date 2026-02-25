
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new ArrayDeque<>();

		for (int i = 1; i <= N; i++) {
			deque.offer(i);
		}

		int answer = 0;
		while (true) {

			if (deque.size() == 1) {
				answer = deque.peek();
				break;
			}
			deque.poll(); // 맨 위 삭제

			int next = deque.peek(); // 두번째 있는 값 변수에 담아두기
			deque.poll(); // 두번째 값도 삭제
			deque.offer(next); // 아까 담아놓은 변수 마지막에 추가
		}
		System.out.println(answer);
	}
}
