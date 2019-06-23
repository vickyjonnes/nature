package operations;

import model.Node;

public class MorrisTraversal {
	public void morrisInorderTraversal(Node root) {
		Node current=root;
		while(current!=null) {
			if(current.left==null) {
				System.out.print(current.getValue()+" ");
				current=current.right;
			}else {
				Node predecessor=current.left;
				while(predecessor.right!=null && predecessor.right!=current) {
					predecessor=predecessor.right;
				}
				if(predecessor.right==null) {
					predecessor.right=current;
					current=current.left;
				}else {
					predecessor.right=null;
					System.out.print(current.getValue()+" ");
					current=current.right;
				}
			}
		}
	}
	
	
	public void morrisPreorderTraversal(Node root) {
		Node current=root;
		while(current!=null) {
			if(current.left==null) {
				System.out.print(current.getValue()+" ");
				current=current.right;
			}else {
				Node predecessor=current.left;
				while(predecessor.right!=null && predecessor.right!=current) {
					predecessor=predecessor.right;
				}
				if(predecessor.right==null) {
					predecessor.right=current;
					System.out.print(current.getValue()+" ");
					current=current.left;
				}else {
					predecessor.right=null;
					current=current.right;
				}
			}
		}
	}
}
