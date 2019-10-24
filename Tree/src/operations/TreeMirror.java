package operations;

import model.Node;

public class TreeMirror {
	
	public Node treeMirror(Node root) {
		if(root==null)
			return root;
		Node temp=root.left;
		root.left=treeMirror(root.right);
		root.right=treeMirror(temp);
		return root;
	}
	
}
