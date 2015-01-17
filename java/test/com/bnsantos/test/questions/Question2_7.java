package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter2.Question7;
import com.bnsantos.utils.ListNode;

public class Question2_7 {

	@Test
	public void testPalindrome() {
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		head.setNext(node2);
		ListNode node3 = new ListNode(3);
		node2.setNext(node3);
		ListNode node4 = new ListNode(4);
		node3.setNext(node4);
		ListNode node5 = new ListNode(5);
		node4.setNext(node5);
		ListNode node6 = new ListNode(4);
		node5.setNext(node6);
		ListNode node7 = new ListNode(3);
		node6.setNext(node7);
		ListNode node8 = new ListNode(2);
		node7.setNext(node8);
		ListNode node9 = new ListNode(1);
		node8.setNext(node9);
		Assert.assertTrue(Question7.palindrome(head));
	}

}
