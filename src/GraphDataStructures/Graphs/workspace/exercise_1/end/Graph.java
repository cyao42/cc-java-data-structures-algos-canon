package GraphDataStructures.Graphs.workspace.exercise_1.end;

import java.util.ArrayList;

public class Graph {

	public ArrayList<Vertex> getVertices() {
		return this.vertices;
	}

	public Vertex getVertexByValue(String value) {
		//This is weird as well. Not sure what we should do if the vertex doesn't exist in the graph
		for(Vertex v: this.vertices) { 
			if (v.getData() == value) {
				return v;
			}
		}
		return new Vertex("");
	}
	
	public void print() {
		for(Vertex v: this.vertices) {
			v.print(isWeighted);
		}
	}
	
	public static void main(String[] args) {
		
	}
}
