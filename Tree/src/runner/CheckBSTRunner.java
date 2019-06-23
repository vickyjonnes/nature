package runner;

import operations.BinaryTree;
import operations.CheckBST;
import operations.NonBSTree;

public class CheckBSTRunner {

	public static void main(String[] args) {
		int nodes[]= {10,0,25,-1,21,16,32};
		//int nodes[]= {10,-10,19,-20,0,17,20};
		NonBSTree nbst=new NonBSTree();
		BinaryTree bt=nbst.buildNonBSTree(nodes);
		CheckBST checkBst=new CheckBST();
		System.out.println("\n"+checkBst.isBST(bt));
	}

}
