package com.bnsantos.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bnsantos.chapter4.Question1;
import com.bnsantos.utils.BinaryTreeNode;

public class Question4_1 {
	private BinaryTreeNode mRoot;
	private BinaryTreeNode mNode8,mNode1;
	
	@Before
	public void init(){
		mRoot = new BinaryTreeNode("0");
		BinaryTreeNode n1 = new BinaryTreeNode("1");
		BinaryTreeNode n2 = new BinaryTreeNode("2");
		BinaryTreeNode n3 = new BinaryTreeNode("3");
		BinaryTreeNode n4 = new BinaryTreeNode("4");
		BinaryTreeNode n5 = new BinaryTreeNode("5");
		BinaryTreeNode n6 = new BinaryTreeNode("6");
		BinaryTreeNode n7 = new BinaryTreeNode("7");
		BinaryTreeNode n8 = new BinaryTreeNode("8");
		BinaryTreeNode n9 = new BinaryTreeNode("9");
		BinaryTreeNode n10 = new BinaryTreeNode("10");
		BinaryTreeNode n11 = new BinaryTreeNode("11");
		BinaryTreeNode n12 = new BinaryTreeNode("12");
		BinaryTreeNode n13 = new BinaryTreeNode("13");
		BinaryTreeNode n14 = new BinaryTreeNode("14");
		
		mRoot.setLeft(n1);
		mRoot.setRight(n8);
		
		n1.setLeft(n2);
		n1.setRight(n5);
		
		n2.setLeft(n3);
		n2.setRight(n4);
		
		n5.setLeft(n6);
		n5.setRight(n7);
		
		n8.setLeft(n9);
		n8.setRight(n12);
		
		n9.setLeft(n10);
		n9.setRight(n11);
		
		n12.setLeft(n13);
		n12.setRight(n14);
		
		mNode1 = n1;
		mNode8 = n8;
	}

	@Test
	public void testBalanced1() {
		Assert.assertTrue(Question1.isBalanced(mRoot));
	}
	
	@Test
	public void testBalanced2() {
		mNode8.setLeft(null);
		mNode8.setRight(null);

		mNode1.setLeft(null);
		mNode1.setRight(null);
		Assert.assertTrue(Question1.isBalanced(mRoot));
	}

	@Test
	public void testUnBalanced1() {
		mNode1.setLeft(null);
		mNode1.setRight(null);
		Assert.assertFalse(Question1.isBalanced(mRoot));
	}
	
	@Test
	public void testUnBalanced2() {
		mNode8.setLeft(null);
		mNode8.setRight(null);
		Assert.assertFalse(Question1.isBalanced(mRoot));
	}
}
