package runner;

import operations.BinaryTree;
import operations.MorrisTraversal;

public class MorrisTraversalRunner {

	public static void main(String[] args) {
		BuildTreeRunner btr=new BuildTreeRunner();
		int nodes[]= {4,8,3,5,7,9,2,11,19,15};
		BinaryTree bt=btr.buildTree(nodes);
		MorrisTraversal mt=new MorrisTraversal();
		System.out.println("Morris Inorder:");
		mt.morrisInorderTraversal(bt.root);
		System.out.println();
		System.out.println("Morris Preorder:");
		mt.morrisPreorderTraversal(bt.root);
	}

}
