package runner;

import model.Node;
import operations.DistanceOf2NodesInBinaryTree;

public class BTDistanceRunner {

	public static void main(String[] args) {
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        DistanceOf2NodesInBinaryTree distance=new DistanceOf2NodesInBinaryTree();
        System.out.println(distance.getLowestCommonAncestor(root, 4, 7).getValue());
        System.out.println(distance.getDistanceFromRoot(root, 4));
        System.out.println(distance.getDistanceBetween2Nodes(root, 4,7));
	}

}
