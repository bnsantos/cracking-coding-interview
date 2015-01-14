package com.bnsantos.test;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter2.Question6;
import com.bnsantos.utils.ListNode;

public class Question2_6 {

	@Test
	public void testLoop1() {
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		head.setNext(node2);
		ListNode node3 = new ListNode(3);
		node2.setNext(node3);
		ListNode node4 = new ListNode(4);
		node3.setNext(node4);
		ListNode node5 = new ListNode(5);
		node4.setNext(node5);
		ListNode beginning = new ListNode(6);
		node5.setNext(beginning);
		ListNode node7 = new ListNode(7);
		beginning.setNext(node7);
		ListNode node8 = new ListNode(8);
		node7.setNext(node8);
		ListNode node9 = new ListNode(9);
		node8.setNext(node9);
		ListNode node10 = new ListNode(10);
		node9.setNext(node10);
		ListNode node11 = new ListNode(11);
		node10.setNext(node11);
		node11.setNext(beginning);
		
		Assert.assertEquals(beginning, Question6.loopBeginning(head));
	}
	
	@Test
	public void testLoop2() {
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		head.setNext(node2);
		ListNode node3 = new ListNode(3);
		node2.setNext(node3);
		ListNode node4 = new ListNode(4);
		node3.setNext(node4);
		ListNode node5 = new ListNode(5);
		node4.setNext(node5);
		ListNode node6 = new ListNode(6);
		node5.setNext(node6);
		ListNode node7 = new ListNode(7);
		node6.setNext(node7);
		ListNode node8 = new ListNode(8);
		node7.setNext(node8);
		ListNode node9 = new ListNode(9);
		node8.setNext(node9);
		ListNode beginning = new ListNode(10);
		node9.setNext(beginning);
		ListNode node11 = new ListNode(11);
		beginning.setNext(node11);
		node11.setNext(beginning);
		
		Assert.assertEquals(beginning, Question6.loopBeginning(head));
	}
	
	@Test
	public void testNoLoop1() {
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		head.setNext(node2);
		ListNode node3 = new ListNode(3);
		node2.setNext(node3);
		ListNode node4 = new ListNode(4);
		node3.setNext(node4);
		ListNode node5 = new ListNode(5);
		node4.setNext(node5);
		ListNode node6 = new ListNode(6);
		node5.setNext(node6);
		ListNode node7 = new ListNode(7);
		node6.setNext(node7);
		ListNode node8 = new ListNode(8);
		node7.setNext(node8);
		ListNode node9 = new ListNode(9);
		node8.setNext(node9);
		ListNode node10 = new ListNode(10);
		node9.setNext(node10);
		ListNode node11 = new ListNode(11);
		node10.setNext(node11);
		
		Assert.assertEquals(null, Question6.loopBeginning(head));
	}
}
