package runner;

import operations.BinaryTree;
import operations.LowestCommonAncestor;

public class LowestCommonAncestorFinder {

	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		bt.build(new int[]{10,-10,30,8,25,60,6,9,28,78});
		LowestCommonAncestor lca=new LowestCommonAncestor();
		System.out.println(lca.lowestCommonAncestor(bt.root, 28, 78));
		System.out.println(lca.lowestCommonAncestor(bt.root, 6, 9));
		System.out.println(lca.lowestCommonAncestor(bt.root, 30, 78));
	}

}
