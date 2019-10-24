package runner;

import model.Node;
import operations.BinaryTree;
import operations.DoubleBST;
import operations.TreeTraversal;

public class DoubleBSTRuner {

	public static void main(String[] args) {
		BuildTreeRunner btr=new BuildTreeRunner();
		TreeTraversal traversal=new TreeTraversal();
		//int nodes[]= {2,1,3};
		int nodes[]= {3,1,4,0,2};
		BinaryTree bt=btr.buildTree(nodes);
		DoubleBST dbst=new DoubleBST();
		Node bstNode=dbst.doubleBST(bt.root);
		traversal.inorderTraversal(bstNode);

	}

}
