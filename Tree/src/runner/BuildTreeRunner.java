package runner;

import operations.BinaryTree;

public class BuildTreeRunner {

	public static void main(String[] args) {
		BuildTreeRunner btr=new BuildTreeRunner();
		int nodes[]= {4,8,3,5,7,9};
		BinaryTree bt=btr.buildTree(nodes);
		int nodesex[]= {2,11,19,15};
		btr.buildExistingTree(bt, nodesex);
		System.out.println("\nSize "+bt.size());
		
		System.out.println("\nSize "+bt.height());
		
	}
	
	public BinaryTree buildTree(int nodes[]) {
		BinaryTree bt=new BinaryTree();
		bt.build(nodes);
		return bt;
	}
	
	public BinaryTree buildExistingTree(BinaryTree tree, int values[]) {
		return tree.buildExistingTree(tree, values);
	}

}
