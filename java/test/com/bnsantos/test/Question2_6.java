package com.bnsantos.test;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter2.Question6;
import com.bnsantos.utils.Node;

public class Question2_6 {

	@Test
	public void testLoop1() {
		Node head = new Node(1);
		Node node2 = new Node(2);
		head.setNext(node2);
		Node node3 = new Node(3);
		node2.setNext(node3);
		Node node4 = new Node(4);
		node3.setNext(node4);
		Node node5 = new Node(5);
		node4.setNext(node5);
		Node beginning = new Node(6);
		node5.setNext(beginning);
		Node node7 = new Node(7);
		beginning.setNext(node7);
		Node node8 = new Node(8);
		node7.setNext(node8);
		Node node9 = new Node(9);
		node8.setNext(node9);
		Node node10 = new Node(10);
		node9.setNext(node10);
		Node node11 = new Node(11);
		node10.setNext(node11);
		node11.setNext(beginning);
		
		Assert.assertEquals(beginning, Question6.loopBeginning(head));
	}
	
	@Test
	public void testLoop2() {
		Node head = new Node(1);
		Node node2 = new Node(2);
		head.setNext(node2);
		Node node3 = new Node(3);
		node2.setNext(node3);
		Node node4 = new Node(4);
		node3.setNext(node4);
		Node node5 = new Node(5);
		node4.setNext(node5);
		Node node6 = new Node(6);
		node5.setNext(node6);
		Node node7 = new Node(7);
		node6.setNext(node7);
		Node node8 = new Node(8);
		node7.setNext(node8);
		Node node9 = new Node(9);
		node8.setNext(node9);
		Node beginning = new Node(10);
		node9.setNext(beginning);
		Node node11 = new Node(11);
		beginning.setNext(node11);
		node11.setNext(beginning);
		
		Assert.assertEquals(beginning, Question6.loopBeginning(head));
	}
	
	@Test
	public void testNoLoop1() {
		Node head = new Node(1);
		Node node2 = new Node(2);
		head.setNext(node2);
		Node node3 = new Node(3);
		node2.setNext(node3);
		Node node4 = new Node(4);
		node3.setNext(node4);
		Node node5 = new Node(5);
		node4.setNext(node5);
		Node node6 = new Node(6);
		node5.setNext(node6);
		Node node7 = new Node(7);
		node6.setNext(node7);
		Node node8 = new Node(8);
		node7.setNext(node8);
		Node node9 = new Node(9);
		node8.setNext(node9);
		Node node10 = new Node(10);
		node9.setNext(node10);
		Node node11 = new Node(11);
		node10.setNext(node11);
		
		Assert.assertEquals(null, Question6.loopBeginning(head));
	}
}
