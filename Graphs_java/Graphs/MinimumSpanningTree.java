import java.util.*;

public class MinimumSpanningTree {
    static class Edge {
        int u, v, weight;
        Edge(int u, int v, int weight) {
            this.u = u; this.v = v; this.weight = weight;
        }
    }

    public static int kruskal(List<Edge> edges, int vertices) {
        edges.sort(Comparator.comparingInt(e -> e.weight));
        UnionFind uf = new UnionFind(vertices);
        int total = 0;

        for (Edge e : edges) {
            if (uf.find(e.u) != uf.find(e.v)) {
                uf.union(e.u, e.v);
                total += e.weight;
            }
        }
        return total;
    }
}
