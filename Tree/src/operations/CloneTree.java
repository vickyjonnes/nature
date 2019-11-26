package operations;

import model.Node;

public class CloneTree {
	public Node cloneTree(Node root1) {
		if(root1==null)
			return root1;
		Node root2=new Node(root1.getValue());
		root2.left=cloneTree(root1.left);
		root2.right=cloneTree(root1.right);
		return root2;
	}
}
