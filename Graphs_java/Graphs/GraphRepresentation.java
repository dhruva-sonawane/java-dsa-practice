import java.util.ArrayList;

public class GraphRepresentation {
    public static ArrayList<ArrayList<Integer>> createGraph(int vertices) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        return graph;
    }
}
