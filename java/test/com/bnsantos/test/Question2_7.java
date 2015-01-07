package com.bnsantos.test;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter2.Question7;
import com.bnsantos.utils.Node;

public class Question2_7 {

	@Test
	public void testPalindrome() {
		Node head = new Node(1);
		Node node2 = new Node(2);
		head.setNext(node2);
		Node node3 = new Node(3);
		node2.setNext(node3);
		Node node4 = new Node(4);
		node3.setNext(node4);
		Node node5 = new Node(5);
		node4.setNext(node5);
		Node node6 = new Node(4);
		node5.setNext(node6);
		Node node7 = new Node(3);
		node6.setNext(node7);
		Node node8 = new Node(2);
		node7.setNext(node8);
		Node node9 = new Node(1);
		node8.setNext(node9);
		Assert.assertTrue(Question7.palindrome(head));
	}

}
