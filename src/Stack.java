
/*
 * Stack class
 */

public class Stack {
	
	private static class Node {
		private int data;
		private Node next;
		
		private Node(int data) {
			this.data = data;
		}
	}
	
	private Node top;
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int peek() {
		return top.data;
	}
	
	public void push(int data) {
		Node newTopNode = new Node(data);
		newTopNode.next = top;
		top = newTopNode;
	}
	
	public int pop() {
		int topData = top.data;
		top = top.next;
		return topData;
	}
	
}
