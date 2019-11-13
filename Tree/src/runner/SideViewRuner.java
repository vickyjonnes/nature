package runner;

import operations.BinaryTree;
import operations.SideView;

public class SideViewRuner {

	public static void main(String[] args) {
		BuildTreeRunner btr=new BuildTreeRunner();
		int nodes1[] = {12,3,6,19,0,-1};
		BinaryTree bt1=btr.buildTree(nodes1);
		SideView view=new SideView();
		view.printLeftView(bt1.root, 1);
		System.out.println();
		view.printRightView(bt1.root, 1);
	}

}
