package com.sindu.datastructures;

/**
 * 
 * @author Sindura Ravichandran
 *
 */

public class LinkedList {
	
	private Node head; // this Node represents the head of the linked list. Please note that once we
	                   // know the head element of linked list, we can keep going next, next, next..
	                   // to traverse the entire linked list
	
/**
 * Adds a new node at the end of the linked list. The add algorithm is as follows.
 * 1. Check if the head element is null. If the head is null, then make the added node as head
 * 2. If the head is not null, then keep going next, next, next,.. until the last element is reached.
 * 3. Once the last element (that is the node that has null 'next' value) then make the new node as its next
 */
	public void addnew(Node newNode) {
		if(head == null) {
			// this linked list has a null head. That means the list is empty. Make the new node
			// as the head
			head = newNode;
		}
		else {
			Node currentNode = head;
			while(currentNode.nextNode() != null) {
				currentNode = currentNode.nextNode();
			}
			currentNode.setNextNode(newNode);
		}
		
	}
	
/**
 * Returns the number of nodes in the linked list. The algorithm is as follows.
 * 1. If the head node is null, return zero, since no nodes in the list
 * 2. If the head node is not null, start a while loop to keep getting the next nodes
 *    until the the next element comes out as null. Start a counter with a value of 1 outside the
 *    loop and keep incrementing until the loop ends. The final value of the counter is the
 *    length of the linked list
 *    
 * @return The number of nodes in the linked list
 */
	public int countNodes() {
		if(head == null) {
			return 0;
		}
		else {
			int count = 1;
			Node currentNode = head;
			while(currentNode.nextNode() != null) {
				count++;
				currentNode = currentNode.nextNode();
			}
			return count;
		}
	}
	
/**
 * Returns the middle node of the singly-linked list using a single pass through the list
 * 
 * @return Middle node
 */
	public Node returnMiddle() {
		Node current = head;
        int length = 0;
        Node middle = head;

        while(current.nextNode() != null){
            length++;
            if(length%2 ==0){
                middle = middle.nextNode();
            }
            current = current.nextNode();
        }

        if(length%2 == 1){
        	middle = middle.nextNode();
        }
		return middle;

	}
	
}
