package edu.victor;

public class Stack {

	private Node topNode;
	
	public Stack() {
		this.topNode = null;
	}
	
	public Node getTopNode() {
		return topNode;
	}
	
	public boolean isEmpty() {
		return topNode == null ? true : false;	
	}
	
	public Node top() {
		return topNode;
	}
	
	public Node pop() {
		if (!isEmpty()) {
			Node previousTopNode = this.topNode;
			topNode = previousTopNode.getNextNode();
			return previousTopNode;
		}
		return null;
	}
	
	public void push(Node newNode) {
		Node previousTopNode = this.topNode;
		topNode = newNode;
		topNode.setNextNode(previousTopNode);
	}

	@Override
	public String toString() {
		
		Node currentNode = topNode;
		String nodesContent = "";
		Node nextNode = currentNode != null ? currentNode.getNextNode() : null;
		
		while (currentNode != null) {
			nodesContent = nodesContent + currentNode.getContent() + (nextNode != null ? ", ": "");
			currentNode = nextNode;
			nextNode = currentNode != null ? currentNode.getNextNode() : null;
		}
		
		return "Stack [" + nodesContent + "]";
	}
	
}
