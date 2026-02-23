
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static Deque<Integer> deque = new ArrayDeque<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine().trim());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			// 앞에서 1인 경우
			int num = Integer.parseInt(st.nextToken());
			
			if (num == 1) {
				one(Integer.parseInt(st.nextToken()));
			} else if (num == 2) {
				System.out.println(two());
			} else if (num == 3) {
				System.out.println(three());
			} else if (num == 4) {
				System.out.println(four());
			} else if (num == 5) {
				System.out.println(five());
			}
		}
	}

	public static void one(int i) {
		deque.push(i);
	}
	
	public static int two () {
		if (deque.isEmpty()) {
			return -1;
		} else {
			return deque.pop();
		}
	}
	
	public static int three () {
		if (deque.isEmpty()) {
			return 0;
		} else {
			return deque.size();
		}
	}
	
	public static int four() {
		if (deque.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int five() {
		if (!deque.isEmpty()) {
			return deque.peek();
		} else {
			return -1;
		}
	}
}
