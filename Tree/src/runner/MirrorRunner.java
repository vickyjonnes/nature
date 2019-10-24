package runner;

import model.Node;
import operations.BinaryTree;
import operations.TreeMirror;
import operations.TreeTraversal;

public class MirrorRunner {

	public static void main(String[] args) {
		BuildTreeRunner btr=new BuildTreeRunner();
		TreeTraversal traversal=new TreeTraversal();
		int nodes[]= {3,4,5,1,6,7,10,-1};
		BinaryTree bt=btr.buildTree(nodes);
		traversal.inorderTraversal(bt.root);
		System.out.println();
		TreeMirror mirror=new TreeMirror();
		Node root=mirror.treeMirror(bt.root);
		
		traversal.inorderTraversal(root);

	}

}
