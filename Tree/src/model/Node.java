package model;

public class Node {
	private int value;
	public Node left;
	public Node right;
	public Node(int value) {
		this.value=value;
		left=null;
		right=null;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value=value;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Node n=(Node)obj;
		return this.getValue()==n.getValue();
	}
}
