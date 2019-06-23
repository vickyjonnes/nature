package operations;

import model.Node;

public class NonBSTree {
	//public Node root;
	public BinaryTree buildNonBSTree(int nodes[]) {
		Node root=new Node(nodes[0]);
		root.left=new Node(nodes[1]);
		root.right=new Node(nodes[2]);
		root.left.left=new Node(nodes[3]);
		root.left.right=new Node(nodes[4]);
		root.right.left=new Node(nodes[5]);
		root.right.right=new Node(nodes[6]);
		return new BinaryTree(root);
	}
}
