package com.sindu.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testListLength() {
		
		// First create a linked list with 100 elements
		
		LinkedList list = new LinkedList();
		
		for(int i=0; i < 100; i++) {
			Node x = new Node(i,null);
			list.addnew(x);
		}
		assertEquals(list.countNodes(),100);
	}
	
	@Test
	public void testMiddleNode() {
		// Create a list with five nodes with integer values from 1-5
		LinkedList list = new LinkedList();
		for(int i=0; i < 5; i++) {
			list.addnew(new Node((i+1),null));
		}
		
		Node middle = list.returnMiddle();
		assertEquals(middle.getNode(),3);
	}

}
