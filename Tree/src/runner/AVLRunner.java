package runner;

import operations.AVLTree;
import operations.TreeTraversal;

public class AVLRunner {

	public static void main(String[] args) {
		AVLTree tree=new AVLTree();
		tree=tree.build(10,5,-10,20,30);
		TreeTraversal treversal=new TreeTraversal();
		System.out.println("Preorder");
		treversal.preorderTraversal(tree.root);
	}

}
