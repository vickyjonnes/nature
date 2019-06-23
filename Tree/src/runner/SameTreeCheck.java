package runner;

import operations.BinaryTree;
import operations.SameTree;

public class SameTreeCheck {

	public static void main(String[] args) {
		BuildTreeRunner btr=new BuildTreeRunner();
		int nodes1[] = {12,3,6,19,0,-1};
		int nodes2[] = {12,3,6,19,0,-2};
		BinaryTree bt1=btr.buildTree(nodes1);
		BinaryTree bt2=btr.buildTree(nodes2);
		SameTree samecheck=new SameTree();
		System.out.println(samecheck.isSame(bt1.root, bt2.root));
	}

}
