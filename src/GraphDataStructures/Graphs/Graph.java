package GraphDataStructures.Graphs;

import java.util.ArrayList;

public class Graph {
	private ArrayList<Vertex> vertices;
	private boolean isDirected;
	private boolean isWeighted;
	
	public Graph(boolean inputIsWeighted, boolean inputIsDirected) {
		this.vertices = new ArrayList<Vertex>();
		this.isWeighted = inputIsWeighted;
		this.isDirected = inputIsDirected;
	}
	
	public ArrayList<Vertex> getVertices() {
		return this.vertices;
	}
	
	public Vertex addVertex(String data) {
		Vertex newVertex = new Vertex(data);
		this.vertices.add(newVertex);
		return newVertex;
	}
	
	public void removeVertex(Vertex v){
		this.vertices.remove(v);
	}

	public void addEdge(Vertex v1, Vertex v2) {
		v1.addEdge(v2);
		if(!this.isDirected) {
			v2.addEdge(v1);
		}
	}

	public void addEdge(Vertex v1, Vertex v2, int weight) {
		if (!isWeighted) {
			weight = null;
		}
		v1.addEdge(v2, weight);
		if(!this.isDirected) {
			v2.addEdge(v1, weight);
		}
	}
	
	public void removeEdge(Vertex v1, Vertex v2) {
		v1.removeEdge(v2);
		if(!this.isDirected) {
			v2.removeEdge(v1);
		}
	}
	
	public Vertex getVertexByValue(String value) {
		//This is weird as well. Not sure what we should do if the vertex doesn't exist in the graph
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
		Graph trainNetwork = new Graph(true, false);
		Vertex atlantaStation = trainNetwork.addVertex("Atlanta");
		Vertex denverStation = trainNetwork.addVertex("Denver");
		Vertex newYorkStation = trainNetwork.addVertex("New York");
		trainNetwork.addEdge(atlantaStation, newYorkStation, 100);
		trainNetwork.addEdge(atlantaStation, denverStation, 200);
		trainNetwork.addEdge(denverStation, newYorkStation, 300);
		trainNetwork.removeEdge(atlantaStation, newYorkStation);

		trainNetwork.print();

		Graph unweightedNetwork = new Graph(false, false);
		Vertex v1 = unweightedNetwork.addVertex("v1");
		Vertex v2 = unweightedNetwork.addVertex("v2");
		Vertex v3 = unweightedNetwork.addVertex("v3");

		unweightedNetwork.addEdge(v1, v2);
		unweightedNetwork.addEdge(v2, v3);
		unweightedNetwork.print();
		
	}
}
