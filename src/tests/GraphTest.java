package tests;

import static org.junit.Assert.assertEquals;

import Graphs.Vertex;
import SortingAlgorithms.BubbleSort;
import Graphs.Graph;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class GraphTest {

    @Test
    public void addVertexTest() {
        Graph g = new Graph(true, true);
        g.addVertex("A");
        g.addVertex("B");
        assertEquals("v1 should have 2 vertices", g.getVertices().size(), 2);
    }

    @Test
    public void removeVertexTest() {
        Graph g = new Graph(true, true);
        g.addVertex("A");
        Vertex v2 = g.addVertex("B");
        g.removeVertex(v2);
        assertEquals("g should have 1 vertex", g.getVertices().size(), 1);
    }

    @Test
    public void addEdgeTest() {
        Graph g = new Graph(true, true);
        Vertex v1 = g.addVertex("A");
        Vertex v2 = g.addVertex("B");
        g.addEdge(v1, v2, 100);
        assertEquals("v1 should have 1 edge", g.getVertexByValue("A").getEdges().size(), 1);
    }
    @Test
    public void addEdgeUndirected() {
        Graph g = new Graph(true, false);
        Vertex v1 = g.addVertex("A");
        Vertex v2 = g.addVertex("B");
        g.addEdge(v1, v2, 100);
        assertEquals("v1 should have 1 edge", g.getVertexByValue("A").getEdges().size(), 1);
        assertEquals("v2 should have 1 edge", g.getVertexByValue("B").getEdges().size(), 1);
    }

    @Test
    public void removeEdgeTest() {
        Graph g = new Graph(true, true);
        Vertex v1 = g.addVertex("A");
        Vertex v2 = g.addVertex("B");
        g.addEdge(v1, v2, 100);
        g.removeEdge(v1, v2);
        assertEquals("v1 should have 0 edges", g.getVertexByValue("A").getEdges().size(), 0);
    }

    @Test
    public void newWeightedGraph() {
        Graph g = new Graph(true, true);
        Vertex v1 = g.addVertex("A");
        Vertex v2 = g.addVertex("B");
        g.addEdge(v1, v2, 100);
        assertEquals("The weight between v1 and v2 should be 100", g.getVertexByValue("A").getEdges().get(0).getWeight(), 100);
    }
    @Test
    public void newUnewightedGraph() {
        Graph g = new Graph(false, true);
        Vertex v1 = g.addVertex("A");
        Vertex v2 = g.addVertex("B");
        g.addEdge(v1, v2, 100);
        assertEquals("The weight between v1 and v2 should be 0", g.getVertexByValue("A").getEdges().get(0).getWeight(), 0);
    }



}
