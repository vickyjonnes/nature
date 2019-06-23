package operations;

import model.Node;

public class BinarySearch {
	public boolean searchNode(Node root, Node x) {
		if(root==null)
				return false;
		if(x.getValue()<root.getValue())
			return searchNode(root.left, x);
		else if(x.getValue()>root.getValue())
			return searchNode(root.right,x);
		return true;
	}
}
