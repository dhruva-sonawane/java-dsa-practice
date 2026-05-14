import java.util.*;

public class ShortestPathUnweighted {
    public static int[] shortestPath(List<List<Integer>> graph, int source) {
        int[] dist = new int[graph.size()];
        Arrays.fill(dist, -1);
        Queue<Integer> queue = new LinkedList<>();
        dist[source] = 0;
        queue.offer(source);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : graph.get(node)) {
                if (dist[neighbor] == -1) {
                    dist[neighbor] = dist[node] + 1;
                    queue.offer(neighbor);
                }
            }
        }
        return dist;
    }
}
