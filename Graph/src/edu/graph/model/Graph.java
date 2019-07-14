package edu.graph.model;

import java.util.Set;

public interface Graph<T> {
	public boolean addVertex(T v);
	public boolean removeVertex(T v);
	public boolean addEdge(T v1,T v2);
	public boolean removeEdge(T v1,T v2);
	public int getVertexCount();
	public int getEdgeCount();
	public Set<T> getAllVertices();
	public Set<T> getAdjacentVertices(T v);
}
