package GraphDataStructures.GraphTraversal.workspace.exercise_3.start;

import GraphDataStructures.Graphs.Vertex;
import GraphDataStructures.Graphs.Edge;
import java.util.ArrayList;

class GraphTraverser {
	public static void depthFirstTraversal(Vertex start, ArrayList<Vertex> visitedVertices) {
		System.out.println(start.getData());

		for (Edge e: start.getEdges()) {
			Vertex neighbor = e.getEnd();

			if (!visitedVertices.contains(neighbor)) {
				visitedVertices.add(neighbor);
				GraphTraverser.depthFirstTraversal(neighbor, visitedVertices);
			}
		}
	}

	public static void breadthFirstTraversal() {
    }

	public static void main(String[] args) {
		TestGraph test = new TestGraph();
		Vertex startingVertex = test.getStartingVertex();
		ArrayList<Vertex> visitedVertices = new ArrayList<Vertex>();
        visitedVertices.add(startingVertex);
	}
}