
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Deque<Character> deque = new ArrayDeque<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String answer = "YES";
			String str = br.readLine();

			char[] chArr = str.toCharArray();

			for (char ch : chArr) {
				if (ch == '(') {
					deque.offer(ch);
				} else if (ch == ')') {
					if (!deque.isEmpty() && deque.peek() == '(') {
						deque.poll();

					} else {
						answer = "NO";
						break;
					}
				} 
			}
			if (!deque.isEmpty()) {
				answer = "NO";
			}
			
			System.out.println(answer);
			deque.clear();
		}
	}
}
