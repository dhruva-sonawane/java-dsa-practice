import java.util.List;

public class DetectCycleDirected {
    public static boolean hasCycle(List<List<Integer>> graph, int node, boolean[] visited, boolean[] path) {
        visited[node] = true;
        path[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor] && hasCycle(graph, neighbor, visited, path)) return true;
            if (path[neighbor]) return true;
        }

        path[node] = false;
        return false;
    }
}
