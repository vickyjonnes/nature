package operations;

import model.Node;

public class DoubleBST {

	//duplicate every node and put that node at the left of original node. Final tree will also be bst
	public Node doubleBST(Node root) {
		if(root==null)
			return root;
		Node tempLeft=root.left;
		Node tempRight=root.right;
		root.left=new Node(root.getValue());
		root.left.left=doubleBST(tempLeft);
		root.right=doubleBST(tempRight);
		return root;
	}
}
