import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int[] tmp;
	static boolean visited[];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		tmp = new int[M];
		visited = new boolean[N + 1];
		
		permutation(0);
		
	}

	public static void permutation(int depth) {
		// 종료
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(tmp[i] + " ");
			}
			System.out.println();
			return;
		}
		
		// 재귀
		for (int i = 1; i <= N; i++) {
			if (!visited[i]) { // 아직 안넣은 경우(false)에만
				visited[i] = true;
				tmp[depth] = i;
				
				permutation(depth + 1);
				visited[i] = false;
			}
		}
	}
}
