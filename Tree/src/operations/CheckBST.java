package operations;

import model.Node;

public class CheckBST {
	private int max=Integer.MAX_VALUE;
	private int min=Integer.MIN_VALUE; 
	public boolean isBST(BinaryTree tree) {
		return check(tree.root,min,max);
	}
	
	private boolean check(Node node, int min, int max) {
		if(node==null) {
			return true;
		}
		if(node.getValue()< min || node.getValue()>max) {
			return false;
		}
		return check(node.left,min,node.getValue()) && check(node.right,node.getValue(),max);
	}
}
