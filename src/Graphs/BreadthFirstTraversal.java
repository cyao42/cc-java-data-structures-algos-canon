package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class BFS {


    public static void breadthFirstTraversal(Vertex start) {
        ArrayList<Vertex> visitedVertices = new ArrayList<Vertex>();
        visitedVertices.add(start);

        Queue<Vertex> visitQueue = new LinkedList<>();
        visitQueue.add(start);
        while (!visitQueue.isEmpty()) {
            Object current = visitQueue.remove();
            System.out.println(((Vertex) current).getData());
            for(Edge e : ((Vertex) current).getEdges()) {
                Vertex neighbor = e.getEnd();
                if(!visitedVertices.contains(neighbor)) {
                    visitedVertices.add(neighbor);
                    visitQueue.add(neighbor);
                }
            }
        }
    }


    public static void main(String[] args) {
        Graph graph = new Graph(false, false);
        Vertex a = graph.addVertex("a");
        Vertex b = graph.addVertex("b");
        Vertex c = graph.addVertex("c");
        Vertex d = graph.addVertex("d");
        Vertex e = graph.addVertex("e");
        Vertex f = graph.addVertex("f");
        graph.addEdge(a, c, 0);
        graph.addEdge(a, e, 0);
        graph.addEdge(b, a, 0);
        graph.addEdge(b, c, 0);
        graph.addEdge(c, d, 0);
        graph.addEdge(c, e, 0);
        graph.addEdge(d, e, 0);
        graph.addEdge(e, f, 0);
        graph.addEdge(f, e, 0);
        breadthFirstTraversal(a);
    }
}