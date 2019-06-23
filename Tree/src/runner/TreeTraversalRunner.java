package runner;

import model.Node;
import operations.BinaryTree;
import operations.TreeTraversal;

public class TreeTraversalRunner {

	public static void main(String[] args) {
		BuildTreeRunner btr=new BuildTreeRunner();
		int nodes[]= {4,8,3,5,7,9};
		BinaryTree bt=btr.buildTree(nodes);
		bt.insertNode(new Node(2));
		int nodesex[]= {11,19,15};
		btr.buildExistingTree(bt, nodesex);
		TreeTraversal treversal=new TreeTraversal();
		System.out.println("Preorder");
		treversal.preorderTraversal(bt.root);
		System.out.println();
		System.out.println("Iterative Preorder");
		treversal.iterativPreorderTraversal(bt.root);
		System.out.println();
		System.out.println("Inorder");
		treversal.inorderTraversal(bt.root);
		System.out.println();
		System.out.println("Iterative Inorder");
		treversal.iterativeInorder(bt.root);
		System.out.println();
		System.out.println("Postorder");
		treversal.postorderTraversal(bt.root);
		System.out.println();
		System.out.println("Iterative Postorder with 2 Stack");
		treversal.iterativePostOrderWith2Stack(bt.root);
		System.out.println();
		System.out.println("Iterative Postorder with 1 Stack");
		treversal.iterativePostOrderWith2Stack(bt.root);
		System.out.println();
		System.out.println("Level Order");
		treversal.levelOrderTraversal(bt.root);
		System.out.println();
		System.out.println("Level By Level Order 2 Q");
		treversal.levelByLevelTraversalWith2Queue(bt.root);
		System.out.println();
		System.out.println("Level By Level Order 1 Queue");
		treversal.levelByLevelTraversalWith1Queue(bt.root);
		System.out.println();
		System.out.println("Reverse Level Order");
		treversal.reverseLevelTraversal(bt.root);
		System.out.println();
		System.out.println("Spiral Order with 2 Stacks");
		treversal.spiralOrderWith2Stacks(bt.root);
		System.out.println();
		System.out.println("Spiral Order with 1 Deque");
		treversal.spiralOrderWith1Deque(bt.root);
	}

}
