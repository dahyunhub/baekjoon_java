
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int M;
	static int[] tmp;
	
	static StringBuilder sb= new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		tmp = new int[M];
		combin(0, 1);
		
		System.out.println(sb);
		
	}
	
	public static void combin(int depth, int idx) {
		// 종료조건
		if (depth == M) {
			for (int i = 0 ; i < M ; i++) {
				sb.append(tmp[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		// 재귀
		for (int i = idx ; i <= N; i++) {
			tmp[depth] = i;
			combin(depth + 1, i);
		}
	}
	
}
