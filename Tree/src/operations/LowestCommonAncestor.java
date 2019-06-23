package operations;

import model.Node;

public class LowestCommonAncestor {
	public int lowestCommonAncestor(Node root,int n1, int n2) {
		if(root.getValue()>=n1 && root.getValue()<=n2) {
			return root.getValue();
		}
		if(root.getValue()<n1 && root.getValue()<n2 && root.right!=null)
			return lowestCommonAncestor(root.right, n1, n2);
		
		if(root.getValue()>n1 && root.getValue()>n2 && root.left!=null)
			return lowestCommonAncestor(root.left, n1, n2);
		
		return -99;
	}
}
