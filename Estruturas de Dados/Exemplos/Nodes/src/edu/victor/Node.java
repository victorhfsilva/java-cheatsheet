package edu.victor;

public class Node <T> {
	
	
	private T content;
	private Node<T> nextNode;
	
	
	public Node(T content) {
		this.nextNode = null;
		this.content = content;
	}
	
	
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}


	@Override
	public String toString() {
		return "Node [content=" + content + "]";
	}
	
	
}
