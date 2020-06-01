package GraphDataStructures.Graphs.workspace.exercise_4.end;

import java.util.ArrayList;

public class Graph {
	private ArrayList<Vertex> vertices;
	private boolean isWeighted;
	private boolean isDirected;

	public Graph() {
		this.vertices = new ArrayList<Vertex>();
	}

	public Vertex addVertex(String data) {
		Vertex newVertex = new Vertex(data);
		this.vertices.add(newVertex);

		return newVertex;
	}

	public void addEdge(Vertex vertex1, Vertex vertex2) {
		vertex1.addEdge(vertex2);
		vertex2.addEdge(vertex1);
	}

	public void removeVertex(Vertex vertex) {
		this.vertices.remove(vertex);
	}

	public ArrayList<Vertex> getVertices() {
		return this.vertices;
	}

	public Vertex getVertexByValue(String value) {
		for(Vertex v: this.vertices) { 
			if (v.getData() == value) {
				return v;
			}
		}

		return null;
	}
	
	public void print() {
		for(Vertex v: this.vertices) {
			v.print(isWeighted);
		}
	}
	
	public static void main(String[] args) {
		Graph trainNetwork = new Graph();
		Vertex atlantaStation = trainNetwork.addVertex("Atlanta");
		Vertex newYorkStation = trainNetwork.addVertex("New York");

		trainNetwork.addEdge(atlantaStation, newYorkStation);

		trainNetwork.print();
	}
}
