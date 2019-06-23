package runner;

import operations.BinaryTree;
import operations.RootToLeafSum;

public class RootToLeafSumRunner {

	public static void main(String[] args) {
		BuildTreeRunner btr=new BuildTreeRunner();
		int nodes[]= {3,4,5,1,6,7,10,-1};
		BinaryTree bt=btr.buildTree(nodes);
		RootToLeafSum rootToLeaf=new RootToLeafSum();
		System.out.println("\n"+rootToLeaf.isPathPresentForSum(bt, 3));

	}

}
