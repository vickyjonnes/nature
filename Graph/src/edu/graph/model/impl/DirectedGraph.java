package edu.graph.model.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import edu.graph.model.Graph;

public class DirectedGraph<T> implements Graph<T>{

	private Map<T,Set<T>> adjMap=new HashMap<>();
	private int edgeCount=0;
	
	@Override
	public boolean addVertex(T v) {
		if(!adjMap.containsKey(v)) {
			adjMap.put(v, new HashSet<>());
			return true;
		}
		return false;
	}

	@Override
	public boolean removeVertex(T v) {
		if(adjMap.containsKey(v)) {
			adjMap.values().stream().forEach(e->e.remove(v));
			adjMap.remove(v);
			return true;
		}
		return false;
	}

	@Override
	public boolean addEdge(T v1, T v2) {
		if(adjMap.containsKey(v1) && adjMap.containsKey(v2)) {
			adjMap.get(v1).add(v2);
			edgeCount++;
			return true;
		}
		return false;
	}

	@Override
	public boolean removeEdge(T v1, T v2) {
		if(adjMap.containsKey(v1) && adjMap.containsKey(v2)) {
			adjMap.get(v1).remove(v2);
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
	public Set<T> getAdjacentVertices(T v) {
		return adjMap.get(v);
	}

}
