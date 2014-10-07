package com.sindu.datastructures;

/**
 * 
 * @author Sindura Ravichandran
 *
 * Class that represents a 'node' in the list with an integer value
 */

public class Node {
	
	private int value;
	private Node next;
	
	public Node(int value, Node next) {
		
		this.value = value;
		this.next = next;
	}
		
	public int getNode() {
		return this.value;
	}
	
	public Node nextNode() {
		return this.next;
	}
	
/**
 * Sets the next node for a given node in the list.
 * @param newNode
 */
	public void setNextNode(Node newNode) {
		next = newNode;
	}

}