import java.util.*;

public class TopologicalSort {
    public static List<Integer> sort(List<List<Integer>> graph) {
        int n = graph.size();
        int[] indegree = new int[n];
        for (int i = 0; i < n; i++)
            for (int v : graph.get(i))
                indegree[v]++;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++)
            if (indegree[i] == 0) queue.offer(i);

        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);
            for (int v : graph.get(node)) {
                if (--indegree[v] == 0) queue.offer(v);
            }
        }
        return result;
    }
}
