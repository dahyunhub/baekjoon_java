import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int V;
    static int E;
    static int[] p; // 부모노드번호를 넣을 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        p = new int[V + 1];

        for (int i = 1; i <= V; i++) {
            p[i] = i;
        }

        Edge[] edges = new Edge[E];

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());

            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            edges[i] = new Edge(from, to, cost);
        }

        Arrays.sort(edges);
        // 가중치 순으로 정렬

        int ans =0;

        // 여기서 union하고, findSet하고...
        for (int i = 0, pick = 0; i < E && pick < V - 1; i++) {
            int from = findSet(edges[i].from);
            int to = findSet(edges[i].to);

            if (from != to) {
                p[from] = to;
                pick++;
                ans += edges[i].cost;
            }

        }

        System.out.println(ans);

    }

    private static void union(int from, int to) {
        int pf = findSet(from);
        int pt = findSet(to);
        if (pf != pt) {
            p[pf] = pt;
        }
    }

    private static int findSet(int x) {
        if (p[x] != x) {
            return p[x] = findSet(p[x]);
        }
        return p[x];
    }


}

class Edge implements Comparable<Edge> {
    int from;
    int to;
    int cost;

    public Edge(int from, int to, int cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

