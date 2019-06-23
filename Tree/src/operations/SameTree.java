package operations;

import model.Node;

public class SameTree {
	public boolean isSame(Node root1, Node root2) {
		if(root1==null && root2==null) {
			return true;
		}else if(root1==null || root2==null) {
			return false;
		}else {
			return root1.equals(root2) && isSame(root1.left,root2.left) && isSame(root1.right, root2.right);
		}
	}
}
