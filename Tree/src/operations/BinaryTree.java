package operations;

import java.util.Arrays;

import model.Node;

public class BinaryTree {
	public Node root;
	public BinaryTree(Node node) {
		this.root=node;
	}
	public BinaryTree() {}
	
	public boolean insertNode(Node node) {
		Node ptr=root;
		while(ptr!=null) {
			if(node.getValue()<ptr.getValue()) {
				if(ptr.left!=null) {
					ptr=ptr.left;
				}else {
					ptr.left=node;
					return true;
				}
			}else if(node.getValue()>ptr.getValue()) {
				if(ptr.right!=null) {
					ptr=ptr.right;
				}else {
					ptr.right=node;
					return true;
				}
			}else {
				return false;
			}
		}
		return false;
	}
	
	public boolean deleteNode(Node node) {
		return false;
	}
	
	public BinaryTree build(int values[]) {
		if(values.length<1)
			return null;
		Arrays.stream(values).mapToObj((value)->{
			root=addNode(root, value);
			return root;
		}).forEach((n)->System.out.print(""));
		System.out.println("Tree created");
		return this;
	}
	
	public BinaryTree buildExistingTree(BinaryTree tree, int values[]) {
		if(tree==null || tree.root==null) {
			return build(values);
		}else {
			Arrays.stream(values).mapToObj((value)->{
				return addNode(root,value);
			}).forEach((n)->System.out.print(""));
			return tree;
		}
	}
	
	private Node addNode(Node current,int value) {
		if(current==null) {
			return new Node(value);
		}
		if(value<current.getValue()) {
			current.left=addNode(current.left,value);
		}else if(value>current.getValue()) {
			current.right=addNode(current.right, value);
		}else {
			return current;
		}
		return current;
	}
	
	public int size() {
		return calculateSize(this.root);
	}
	
	private int calculateSize(Node root) {
		if(root==null) {
			return 0;
		}else{
			return calculateSize(root.left)+calculateSize(root.right)+1;
		}
	}
	
	public int height() {
		return calculateHeight(this.root);
	}
	
	private int calculateHeight(Node root) {
		if(root==null) {
			return 0;
		}
		int leftHeight=calculateHeight(root.left);
		int rightHeight=calculateHeight(root.right);
		return 1+Math.max(leftHeight, rightHeight);
	}
}
