package operations;

import model.Node;

public class SideView {

	int maxLevel=0;
	public void printLeftView(Node root, int level) {
		if(root==null)
			return;
		
		if(level>maxLevel) {
			System.out.print(root.getValue()+" ");
			maxLevel=level;
		}
		
		printLeftView(root.left, level+1);
		printLeftView(root.right, level+1); 
	}
	
	
	int maxRightLevel=0;
	public void printRightView(Node root, int level) {
		if(root==null)
			return;
		
		if(level>maxRightLevel) {
			System.out.print(root.getValue()+" ");
			maxRightLevel=level;
		}
		
		printRightView(root.right, level+1); 
		printRightView(root.left, level+1);
	}
}
