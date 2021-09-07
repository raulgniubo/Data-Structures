
/*
 * Queue class
 */

public class Queue {
	
	private static class Node {
		private int data;
		private Node next;
		
		private Node(int data) {
			this.data = data;
		}	
	}
	
	private Node head;  // remove stuff from here
	private Node tail;  // add stuff here
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int peek() {
		// note: it will throw an exception if head is null
		return head.data;
	}
	
	public void add(int data) {
		Node node = new Node(data);
		if (tail != null) {
			tail.next = node;
		}
		tail = node;
		if (head == null) {
			head = node;
		}
	}
	
	public int remove() {
		int data = head.data;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		return data;
	}
	
}
