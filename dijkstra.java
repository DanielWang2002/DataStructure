import java.util.*;

public class Dijkstra {
    // 儲存邻接矩阵
    private static int[][] graph;
    // 儲存每個點到起點的最短距離
    private static int[] dist;
    // 儲存每個點是否已經遍歷過
    private static boolean[] visited;

    public static void dijkstra(int start) {
        // 初始化 dist 數組
        dist = new int[graph.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        // 初始化 visited 數組
        visited = new boolean[graph.length];

        // 使用優先順序隊列來實現最短路徑的搜尋
        PriorityQueue<Integer> queue = new PriorityQueue<>((i, j) -> dist[i] - dist[j]);
        queue.offer(start);

        while (!queue.isEmpty()) {
            int u = queue.poll();
            visited[u] = true;

            for (int v = 0; v < graph.length; v++) {
                if (graph[u][v] != 0 && !visited[v]) {
                    int newDist = dist[u] + graph[u][v];
                    if (newDist < dist[v]) {
                        dist[v] = newDist;
                        queue.offer(v);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        graph = new int[][] {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        dijkstra(0);
        System.out.println(Arrays.toString(dist));
    }
}
