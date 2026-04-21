import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int M;
	static int[] arr;
	static int[] tmp;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken()); // ex 1,2,3,4
		M = Integer.parseInt(st.nextToken()); // 몇개를 선택할 건지
	
		tmp = new int[M];
		
		combin(0, 1);
	}
	
	public static void combin(int depth, int idx) {
		
		if (depth == M) {
			for (int i = 0 ; i < M; i++) {
				System.out.print(tmp[i] + " ");
			}
			System.out.println();
			return;
		}
		
		
		for (int i = idx ; i <= N; i++) {
			tmp[depth] = i;
			
			combin(depth + 1, i + 1);
			
		}
	}
}
