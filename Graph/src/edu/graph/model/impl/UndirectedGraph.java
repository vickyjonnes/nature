package edu.graph.model.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.graph.model.Edge;
import edu.graph.model.Graph;

public class UndirectedGraph<T> implements Graph<T>{

	private Map<T, Set<T>> adjMap=new HashMap<>();
	private ArrayList<Edge<T>> edges=new ArrayList<>();
	private int edgeCount=0;
	@Override
	public boolean addVertex(T vertex) {
		if(!adjMap.containsKey(vertex)) {
			adjMap.put(vertex, new HashSet<>());
			return true;
		}		
		return false;
	}

	@Override
	public boolean removeVertex(T vertex) {
		if(adjMap.containsKey(vertex)) {
			adjMap.values().stream().forEach(e->e.remove(vertex));
			adjMap.remove(vertex);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean addEdge(T vertex1, T vertex2, int weight) {
		if(adjMap.containsKey(vertex1) && adjMap.containsKey(vertex2)) {
			adjMap.get(vertex1).add(vertex2);
			adjMap.get(vertex2).add(vertex1);
			edges.add(new Edge<>(vertex1, vertex2, weight));
			edgeCount++;
			return true;
		}
		return false;
	}

	@Override
	public boolean addEdge(T vertex1, T vertex2) {
		return addEdge(vertex1, vertex2, 0);
	}

	@Override
	public boolean removeEdge(T vertex1, T vertex2) {
		if(adjMap.containsKey(vertex1) && adjMap.containsKey(vertex2)) {
			adjMap.get(vertex1).remove(vertex2);
			adjMap.get(vertex2).remove(vertex1);
			edges.removeIf(e->e.equals(new Edge<>(vertex1, vertex2, 0)));
			edgeCount--;
			return true;
		}
		return false;
	}

	@Override
	public int getVertexCount() {
		return adjMap.size();
	}

	@Override
	public int getEdgeCount() {
		return edgeCount;
	}

	@Override
	public Set<T> getAllVertices() {
		return adjMap.keySet();
	}

	@Override
	public Set<T> getAdjacentVertices(T vertex) {
		return adjMap.get(vertex);
	}

	@Override
	public List<Edge<T>> getAllEdges() {
		return edges;
	}
	
}
