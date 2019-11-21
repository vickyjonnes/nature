package edu.graph.model;

import java.util.List;
import java.util.Set;

public interface Graph<T> {
	public boolean addVertex(T vertext);
	public boolean removeVertex(T vertex);
	public boolean addEdge(T vertex1,T vertex2);
	public boolean addEdge(T vertex1,T vertex2,int weight);
	public boolean removeEdge(T vertex1,T vertex2);
	public int getVertexCount();
	public int getEdgeCount();
	public Set<T> getAllVertices();
	public Set<T> getAdjacentVertices(T vertex);
	public List<Edge<T>> getAllEdges();
}
