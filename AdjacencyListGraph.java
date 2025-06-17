import java.util.*;

public class AdjacencyListGraph {
    private Map<Integer, List<Integer>> adjList;

    public AdjacencyListGraph() {
        adjList = new HashMap<>();
    }

    public void addVertex(int v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(int v, int w) {
        adjList.get(v).add(w);
        adjList.get(w).add(v); // For undirected graph
    }

    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (Integer neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyListGraph graph = new AdjacencyListGraph();
        graph.addVertex(0); // A
        graph.addVertex(1); // B
        graph.addVertex(2); // C
        graph.addVertex(3); // D

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);

        graph.printGraph();
    }
}
