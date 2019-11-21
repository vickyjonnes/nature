package edu.graph.algo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import edu.graph.model.Graph;
import edu.graph.model.impl.UndirectedGraph;

public class Traversal<T> {

	//https://www.youtube.com/watch?v=vf-cxgUXcMk&list=PLdo5W4Nhv31bK5n8-RIGhvYs8bJbgJFDR&index=1
	//bfs -> queue, dfs -> stack
	public static void main(String[] args) {
		Graph<String> graph=new UndirectedGraph<>();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		graph.addEdge("A", "C");
		graph.addEdge("A", "B");
		graph.addEdge("A", "D");
		graph.addEdge("B", "C");
		graph.addEdge("C", "D");
		graph.addEdge("B", "E");
		graph.addEdge("D", "F");
		graph.addEdge("E", "F");
		graph.addEdge("F", "G");
		graph.addEdge("C", "E");
		graph.addEdge("E", "G");
		
		Traversal<String> traversal=new Traversal<>();
		traversal.bfs(graph, "G");
		System.out.println();
		traversal.dfs(graph, "A");
	}
	
	public void bfs(Graph<T> graph, T startVertex) {
		Queue<T> q=new LinkedList<>();
		Set<T> visited=new HashSet<>();
		q.add(startVertex);
		visited.add(startVertex);
		
		while(!q.isEmpty()) {
			T vertex=q.poll();
			graph.getAdjacentVertices(vertex)
				.stream()
				.filter(e->!visited.contains(e))
				.forEach(v->{
					q.add(v);
					visited.add(v);
				});
			System.out.print(vertex +" ");
		}
		
	}
	
	
	public void dfs(Graph<T> graph, T startVertex) {
		Stack<T> stack=new Stack<>();
		Set<T> visited = new HashSet<>();
		stack.push(startVertex);
		visited.add(startVertex);
		System.out.print(startVertex+" ");
		
		while(!stack.isEmpty()) {
			T vertex = stack.peek();
			Optional<T> next = graph.getAdjacentVertices(vertex)
					.stream()
					.filter(e->!visited.contains(e))
					.findFirst();
			
			if(next.isPresent()) {
				stack.push(next.get());
				visited.add(next.get());
				System.out.print(next.get()+" ");
			}else {
				stack.pop();
			}
			
		}
	}

}
