
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static boolean dfsVisited[];
    static boolean bfsVisited[];
    static List<Integer> list[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        dfsVisited = new boolean[N + 1];
        bfsVisited = new boolean[N + 1];

        list = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {

            st = new StringTokenizer(br.readLine());

            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            list[left].add(right);
            list[right].add(left);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(list[i]);
        }

        dfs(V);
        System.out.println();
        bfs(V);
    }

    static void dfs(int v) {

        dfsVisited[v] = true;
        System.out.print(v + " ");

        for (int next : list[v]) {
            if (!dfsVisited[next]) {
                dfs(next);
            }
        }
    }

    static void bfs(int start) {

        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(start);
        bfsVisited[start] = true;

        while (!queue.isEmpty()) {

            int now = queue.poll();
            System.out.print(now + " ");

            for (int next : list[now]) {

                if (!bfsVisited[next]) {
                    bfsVisited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }
}