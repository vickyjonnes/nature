package runner;

import model.Node;
import operations.BinarySearch;
import operations.BinaryTree;

public class BinarySearchRunner {

	public static void main(String[] args) {
		BuildTreeRunner btr=new BuildTreeRunner();
		int nodes[]= {3,4,5,1,6,7,10,-1};
		BinaryTree bt=btr.buildTree(nodes);
		BinarySearch bs=new BinarySearch();
		boolean isPresent=bs.searchNode(bt.root, new Node(8));
		System.out.println("Is node present? "+isPresent);
	}

}
