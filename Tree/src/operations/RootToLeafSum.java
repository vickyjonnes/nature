package operations;

import model.Node;

public class RootToLeafSum {
	
	public boolean isPathPresentForSum(BinaryTree bt, int sum) {
		return findPathtoLeaf(bt.root, sum);
	}
	
	private boolean findPathtoLeaf(Node root, int sum) {
		if(root==null) return false;
		if(isLeaf(root)) {
			if(root.getValue()==sum) {
				System.out.print(root.getValue()+" ");
				return true;
			}else {
				return false;
			}
		}
		if(findPathtoLeaf(root.left, sum-root.getValue())) {
			System.out.print(root.getValue()+" ");
			return true;
		}
		if(findPathtoLeaf(root.right, sum-root.getValue())) {
			System.out.print(root.getValue()+" ");
			return true;
		}
		return false;
	}
	
	private boolean isLeaf(Node node) {
		if(node.left==null && node.right==null) {
			return true;
		}
		return false;
	}
}
