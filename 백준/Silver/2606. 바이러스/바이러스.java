
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static int computerCnt;

	static List<Integer>[] arr;
	static boolean[] visited;
	
	// 1에 의해 감염된 컴퓨터의 수
	static int infected;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		computerCnt = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[computerCnt + 1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = new ArrayList<>();
		}
		
		visited = new boolean[computerCnt + 1];
		
		for (int i = 0 ; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());
			
			arr[left].add(right);
			arr[right].add(left);
			
		}
		
		dfs(1);
		
		System.out.println(infected);
		
	}
	
	public static void dfs(int start) {

		// 처음 들어왔을 때는 1이다.
		// 감염된 컴퓨터를 셀 때에는 1은 제외하기 때문에
		// 여기서 +1을 해주는 건 아닌 것 같아...
		visited[start] = true;
		
		for (int i = 0; i < arr[start].size(); i++) {
			int n = arr[start].get(i);
			
			if (!visited[n]) {
				++infected;
				dfs(n);
			}
		}
	}
	
}
