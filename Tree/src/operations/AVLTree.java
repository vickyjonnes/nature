package operations;

import java.util.Arrays;

import model.Node;

public class AVLTree {
	public Node root;
	public AVLTree() {}
	public AVLTree(Node r) {
		this.root=r;
	}
	
	public AVLTree build(int ...values) {
		Arrays.stream(values).mapToObj(v->{
			root=addNode(root, v);
			return root;
		}).forEach(n->System.out.print(""));
		return this;
	}
	
	private Node addNode(Node current,int value) {
		if(current==null) {
			current=new Node(value);
			return current;
		}
		if(value<current.getValue()) {
			current.left=addNode(current.left, value);
		}else {
			current.right=addNode(current.right, value);
		}
		int balance=height(current.left)-height(current.right);
		if(balance>1) {
			if(height(current.left.left)>=height(current.left.right)) {
				return roatateRight(current);
			}else {
				current.left=roatateLeft(current.left);
				return roatateRight(current);
			}
		}
		if(balance<-1) {
			if(height(current.right.right)>=height(current.right.left)) {
				return roatateLeft(current);
			}else {
				current.right=roatateRight(current.right);
				return roatateLeft(current);
			}
		}
		return current;
	}
	
	public Node roatateRight(Node root) {
		if(root==null) return root;
		Node newRoot=root.left;
		root.left=newRoot.right;
		newRoot.right=root;
		return newRoot;
	}
	
	public Node roatateLeft(Node root) {
		if(root==null) return root;
		Node newRoot=root.right;
		root.right=newRoot.left;
		newRoot.left=root;
		return newRoot;
	}
	
	private int height(Node root) {
		if(root==null) return 0;
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		return Math.max(leftHeight, rightHeight)+1;
	}
}
