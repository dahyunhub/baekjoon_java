
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[] p;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		p = new int[n+1]; // 각각의 값이 바라보는 부모값
		
		for (int i = 0 ; i <= n; i++) {
			makeSet(i);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0 ; i < m; i++) {
			st= new StringTokenizer(br.readLine());
			
			int type = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			
				
			if (type == 1) {
				if (findSet(a) == findSet(b)) {
					sb.append("YES").append("\n");
				} else {
					sb.append("NO").append("\n");
				}
			} else {
				union(a, b);
			}
			
		}
		
		System.out.println(sb.toString());
	}

	// a가 속한 집합의 대표와 b가 속한 집합의 대표를 합친다.
	public static void union(int x, int y) {
		p[findSet(x)] = findSet(y);
	}

	public static int findSet(int x) {
		if (p[x] != x) {
			p[x] = findSet(p[x]);
		}

		return p[x];
	}

	public static void makeSet(int x) {
		p[x] = x;
	}

}
