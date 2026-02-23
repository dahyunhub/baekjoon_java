
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Deque<Integer> deque = new ArrayDeque<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());

		for (int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());

			if (!deque.isEmpty() && num == 0) {
				deque.poll();
			} else {
				deque.offerFirst(num);
			}
		}

		int sum = 0;
		for (int i : deque) {
			sum += i;
		}

		System.out.println(sum);
	}
}
