package operations;

import model.Node;

public class DistanceOf2NodesInBinaryTree {

	//https://www.geeksforgeeks.org/paytm-interview-experience-for-experienced-2/
	//to get the lowest common ancesor of a binary tree
	public Node getLowestCommonAncestor(Node root, int n1, int n2) {
		if(root==null)
			return root;
		
		if(root.getValue()==n1 || root.getValue()==n2) {
			return root;
		}
		
		Node left=getLowestCommonAncestor(root.left, n1, n2);
		Node right=getLowestCommonAncestor(root.right, n1, n2);
		
		if(left!=null && right!=null)
			return root;
		if(left!=null)
			return left;
		else
			return right;
	}
	
	//to get the distance of node from root in binary tree
	public int getDistanceFromRoot(Node root, int n) {
		if(root==null)
			return -999;
		if(root.getValue()==n)
			return 0;
		int distance_left=1+getDistanceFromRoot(root.left, n);
		int distance_right=1+getDistanceFromRoot(root.right, n);
		
		if(distance_left<0)
			return distance_right;
		if(distance_right<0)
			return distance_left;
		
		return Math.min(distance_left, distance_right);
	}
	
	//to get the distance between 2 nodes in ninary tree.
	public int getDistanceBetween2Nodes(Node root, int n1, int n2) {
		Node lca=getLowestCommonAncestor(root, n1, n2);
		return getDistanceFromRoot(lca, n1)+getDistanceFromRoot(lca, n2);
	}
}
