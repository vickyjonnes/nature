package edu.graph.algo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import edu.graph.model.Graph;
import edu.graph.model.impl.DirectedGraph;

public class TopologicalSort<T> {
	public static void main(String arr[]) {
		TopologicalSort<String> tSort=new TopologicalSort<>();
		Graph<String> graph=new DirectedGraph<>();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		graph.addEdge("A", "C");
		graph.addEdge("B", "C");
		graph.addEdge("C", "D");
		graph.addEdge("B", "E");
		graph.addEdge("D", "F");
		graph.addEdge("E", "F");
		graph.addEdge("F", "G");
		graph.addEdge("C", "E");
		Stack<String> stack=tSort.topSort(graph);
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
		
	}
	
	public Stack<T> topSort(Graph<T> graph) {
		Stack<T> stack=new Stack<>();
		Set<T> visited=new HashSet<>();
		for(T vertex : graph.getAllVertices()) {
			topSortUtil(vertex,visited,stack,graph);
		}
		return stack;
	}
	
	public void topSortUtil(T v,Set<T> visited, Stack<T> stack,Graph<T> graph){
		visited.add(v);
		for(T vertex : graph.getAdjacentVertices(v)) {
			if(visited.contains(vertex))
				continue;
			topSortUtil(vertex,visited,stack,graph);
		}
		if(!stack.contains(v)) {
			stack.push(v);
		}
		
	}
}
