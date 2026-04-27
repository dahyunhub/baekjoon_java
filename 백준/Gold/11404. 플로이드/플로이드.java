
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int INF = 100_000_000;

		int[][] dist = new int[n+1][n+1];

		
		for (int i = 1; i <= n; i++) {
			for (int j = 1 ; j <= n; j++) {
				if (i == j) dist[i][j] = 0;
				else dist[i][j] = INF;
				
			}
		}
		
		// 버스 정보입력
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			// 같은 출발지-도착지 버스가 여러 개 있을 수도 있어서 최소 비용 저장
			dist[start][end] = Math.min(dist[start][end], cost);
		}
		
		
		
		for (int k = 1; k <=n ; k++) {
			for (int i =1; i <=n ;i++) {
				for (int j = 1; j <=n; j++) {
					
					if (dist[i][k] != INF && dist[k][j] != INF) {
						dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (dist[i][j] == INF) sb.append(0).append(" ");
				else sb.append(dist[i][j]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
