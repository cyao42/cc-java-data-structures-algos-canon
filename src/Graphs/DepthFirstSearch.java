package Graphs;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class DepthFirstSearch {
    public static void depthFirstTraversal(Vertex start, ArrayList<Vertex> visitedVertices){
        System.out.println(start.getData());
        for (Edge e: start.getEdges()) {
            Vertex neighbor = e.getEnd();
            if (!visitedVertices.contains(neighbor)){
                visitedVertices.add(neighbor);
                depthFirstTraversal(neighbor, visitedVertices);
            }
        }
    }


}
