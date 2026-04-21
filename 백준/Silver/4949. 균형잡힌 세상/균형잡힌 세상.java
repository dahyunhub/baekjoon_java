import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Character> deque = new ArrayDeque<>();
		
		while (true) {
			deque.clear();
			
			String str = br.readLine();

			if (".".equals(str)) {
				break;
			}

			String answer = "yes";
			
			for (char ch : str.toCharArray()) {
				if (ch == '(' || ch == '[') {
					deque.offerFirst(ch);
					
				} else if (ch == ')') {
					
					if (deque.isEmpty() || deque.peek() != '(') {
						answer = "no";
						break;
					} else {
						deque.poll();
					}
					
				} else if (ch == ']') {
					if (deque.isEmpty() || deque.peek() != '[') {
						answer = "no";
						break;
					} else {
						deque.poll();
					}
				}
			}
			
			if (!deque.isEmpty()) {
				answer = "no";
			}
			
			System.out.println(answer);
		}
	}
}
