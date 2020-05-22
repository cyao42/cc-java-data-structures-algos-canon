package tests;


import Graphs.Graph;
import Graphs.Vertex;
import org.junit.Test;

import java.util.Dictionary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static Dijkstra.Dijkstra.*;

public class DijkstraTest {
    @Test
    public void testDijkstra() {

        Graph testGraph = new Graph(true, true);
        Vertex a = testGraph.addVertex("A");
        Vertex b = testGraph.addVertex("B");
        Vertex c = testGraph.addVertex("C");
        Vertex d = testGraph.addVertex("D");
        Vertex e = testGraph.addVertex("E");
        Vertex f = testGraph.addVertex("F");
        Vertex g = testGraph.addVertex("G");

        testGraph.addEdge(a, c, 100);
        testGraph.addEdge(a, b, 3);
        testGraph.addEdge(a, d, 4);
        testGraph.addEdge(d, c, 3);
        testGraph.addEdge(d, e, 8);
        testGraph.addEdge(e, b, -2);
        testGraph.addEdge(e, f, 10);
        testGraph.addEdge(b, g, 9);
        testGraph.addEdge(e, g, -50);

        Dictionary[] results = dijkstra(testGraph, a);
        Dictionary<String, Integer> distances = results[0];
        Dictionary<String, Vertex> previous = results[1];
        Integer distToG = distances.get("G");
        Integer expected = -38;
        System.out.println(distToG);

        assertEquals("The distance to vertex G should be -38", distToG, expected);

        String gPrevious = previous.get("G").getData();
        String expectedPrevious = "E";
        assertEquals("G's previous node should be E", gPrevious, expectedPrevious);
        //assertEquals("");
    }

}
