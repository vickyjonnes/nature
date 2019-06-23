package operations;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import model.Node;

public class TreeTraversal {
	public void preorderTraversal(Node root) {
		if(root!=null) {
			System.out.print(root.getValue()+" ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}
	
	public void iterativPreorderTraversal(Node root) {
		Stack<Node> stack=new Stack<>();
		stack.push(root);
		while(root!=null && !stack.isEmpty()) {
			root=stack.pop();
			System.out.print(root.getValue()+" ");
			if(root.right!=null) stack.push(root.right);
			if(root.left!=null) stack.push(root.left);
		}
	}
	
	public void inorderTraversal(Node root) {
		if(root!=null) {
			inorderTraversal(root.left);
			System.out.print(root.getValue()+" ");
			inorderTraversal(root.right);
		}
	}
	
	public void iterativeInorder(Node root) {
		Stack<Node> stack=new Stack<>();
		if(root!=null) {
			stack.push(root);
			while(!stack.isEmpty()) {
				if(root==null) {
					root=stack.pop();
					System.out.print(root.getValue()+" ");
					if(root.right!=null) {
						root=root.right;
						stack.push(root);
					}else {
						root=null;
					}
				}else if(root.left!=null) {
					root=root.left;
					stack.push(root);
				}else if(root.left==null) {
					root=null;
				}
			}
		}
	}
	
	public void postorderTraversal(Node root) {
		if(root!=null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.getValue()+" ");
		}
	}
	
	public void iterativePostOrderWith2Stack(Node root) {
		Stack<Node> stack1=new Stack<>();
		Stack<Node> stack2=new Stack<>();
		if(root!=null) {
			stack1.push(root);
			while(root!=null && !stack1.isEmpty()) {
				root=stack1.pop();
				stack2.push(root);
				if(root.left!=null) stack1.push(root.left);
				if(root.right!=null) stack1.push(root.right); 
			}
		}
		while(!stack2.isEmpty()) {
			System.out.print(stack2.pop().getValue()+" ");
		}
	}
	
	public void iterativePostOrderWith1Stack(Node root) {
		Stack<Node> s=new Stack<>();
		if(root==null) return;
		Node current=root,temp=null;
		s.push(current);
		while(!s.isEmpty() || current!=null) {
			if(current.left!=null && current.left!=temp) {
				s.push(current.left);
				current=current.left;
			}else {
				if(s.peek().right!=null && s.peek().right!=temp) {
					current=s.peek().right;
					s.push(current);
				}else {
					temp=s.pop();
					System.out.print(temp.getValue()+" ");
					current=s.peek();
				}
			}
		}
	}
	
	public void levelOrderTraversal(Node root) {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(root!=null && !q.isEmpty()) {
			root=q.poll();
			System.out.print(root.getValue()+" ");
			if(root.left!=null) {
				q.add(root.left);
			}
			if(root.right!=null) {
				q.add(root.right);
			}
		}
	}
	
	public void levelByLevelTraversalWith2Queue(Node root) {
		Queue<Node> q1=new LinkedList<>();
		Queue<Node> q2=new LinkedList<>();
		q1.add(root);
		while(!q1.isEmpty() || !q2.isEmpty()) {
			while(!q1.isEmpty()) {
				root=q1.poll();
				System.out.print(root.getValue()+" ");
				if(root.left!=null) q2.add(root.left);
				if(root.right!=null) q2.add(root.right);
				if(q1.isEmpty()) {
					System.out.println();
					break;
				}
			}
			while(!q2.isEmpty()) {
				root=q2.poll();
				System.out.print(root.getValue()+" ");
				if(root.left!=null) q1.add(root.left);
				if(root.right!=null) q1.add(root.right);
				if(q2.isEmpty()) {
					System.out.println();
					break;
				}
			}
		}
	}
	
	public void levelByLevelTraversalWith1Queue(Node root) {
		Queue<Node> q=new LinkedList<>();
		q.add(root);q.add(null);
		while(!q.isEmpty()) {
			root=q.poll();
			if(root==null) {
				System.out.println();
				if(q.peek()!=null) q.add(null);
			}else {
				System.out.print(root.getValue()+" ");
				if(root.left!=null) q.add(root.left);
				if(root.right!=null) q.add(root.right);
			}
		}
	}
	
	public void reverseLevelTraversal(Node root) {
		Queue<Node> q=new LinkedList<>();
		Stack<Node> stack=new Stack<>();
		q.add(root);
		while(root!=null && !q.isEmpty()) {
			root=q.poll();
			if(root.right!=null) q.add(root.right);
			if(root.left!=null) q.add(root.left);
			stack.push(root);
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop().getValue()+" ");
		}
	}
	
	public void spiralOrderWith2Stacks(Node root) {
		Stack<Node> s1=new Stack<>();
		Stack<Node> s2=new Stack<>();
		s1.push(root);
		Node current;
		while(!s1.isEmpty() || !s2.isEmpty()) {
			while(!s1.isEmpty()) {
				current=s1.pop();
				if(current.left!=null) s2.push(current.left);
				if(current.right!=null) s2.push(current.right);
				System.out.print(current.getValue()+" ");
			}
			while(!s2.isEmpty()) {
				current=s2.pop();
				if(current.right!=null) s1.push(current.right);
				if(current.left!=null) s1.push(current.left);
				System.out.print(current.getValue()+" ");
			}
		}
	}
	
	public void spiralOrderWith1Deque(Node root) {
		Deque<Node> q=new ArrayDeque<>();
		Node n=new Node(999);
		q.add(n);
		q.addLast(root);
		Node current;
		while(!q.peekLast().equals(n) || !q.peekFirst().equals(n)) {
			while(!q.peekLast().equals(n)) {
				current=q.pollLast();
				if(current.left!=null) q.addFirst(current.left);
				if(current.right!=null) q.addFirst(current.right);
				System.out.print(current.getValue()+" ");
			}
			while(!q.peekFirst().equals(n)) {
				current=q.pollFirst();
				if(current.right!=null) q.addLast(current.right);
				if(current.left!=null) q.addLast(current.left);
				System.out.print(current.getValue()+" ");
			}
		}
	}
}
