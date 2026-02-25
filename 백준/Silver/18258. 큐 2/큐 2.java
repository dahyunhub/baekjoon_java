import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Deque<Integer> deque = new ArrayDeque<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb= new StringBuilder();
		
		for (int i = 0 ; i < N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			
			if ("push".equals(str)) {
				deque.offerFirst(Integer.parseInt(st.nextToken()));
				
			} else if ("pop".equals(str)) {
				if (!deque.isEmpty()) {
					sb.append(deque.pollLast()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
				
			} else if ("size".equals(str)) {
				sb.append(deque.size()).append("\n");
				
			} else if ("empty".equals(str)) {
				if (deque.isEmpty()) {
					sb.append(1).append("\n");
					
				} else {
					sb.append(0).append("\n");
				}
				
			} else if ("front".equals(str)) {
				if (!deque.isEmpty()) {
					
					sb.append(deque.peekLast()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
				
			} else { // back
				if (!deque.isEmpty()) {
					sb.append(deque.peekFirst()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
			}
			
		}
		System.out.print(sb);
	
	}
	
}
