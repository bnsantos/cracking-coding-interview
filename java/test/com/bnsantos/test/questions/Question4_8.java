package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bnsantos.chapter4.Question8;
import com.bnsantos.utils.BinaryTreeNode;

public class Question4_8 {
	private BinaryTreeNode mRoot, mN2;
	private BinaryTreeNode mNodeOutSideTree;
	
	@Before
	public void init(){
		mNodeOutSideTree = new BinaryTreeNode("100");
		mRoot = new BinaryTreeNode("7");
		BinaryTreeNode n1 = new BinaryTreeNode("3");
		BinaryTreeNode n2 = new BinaryTreeNode("11");
		BinaryTreeNode n3 = new BinaryTreeNode("1");
		BinaryTreeNode n4 = new BinaryTreeNode("5");
		BinaryTreeNode n5 = new BinaryTreeNode("9");
		BinaryTreeNode n6 = new BinaryTreeNode("13");
		BinaryTreeNode n7 = new BinaryTreeNode("0");
		BinaryTreeNode n8 = new BinaryTreeNode("2");
		BinaryTreeNode n9 = new BinaryTreeNode("4");
		BinaryTreeNode n10 = new BinaryTreeNode("6");
		BinaryTreeNode n11 = new BinaryTreeNode("8");
		BinaryTreeNode n12 = new BinaryTreeNode("10");
		BinaryTreeNode n13 = new BinaryTreeNode("12");
		BinaryTreeNode n14 = new BinaryTreeNode("14");
		
		mNodeOutSideTree.setLeft(n3);
		mNodeOutSideTree.setRight(n4);
		mRoot.setLeft(n1);
		mRoot.setRight(n2);
		n1.setLeft(n3);
		n1.setRight(n4);
		n2.setLeft(n5);
		n2.setRight(n6);
		n3.setLeft(n7);
		n3.setRight(n8);
		n4.setLeft(n9);
		n4.setRight(n10);
		n5.setLeft(n11);
		n5.setRight(n12);
		n6.setLeft(n13);
		n6.setRight(n14);
		
		mN2 = n2;
	}

	@Test
	public void test1() {
		Assert.assertTrue(Question8.containTree(mRoot, mN2));
	}
	@Test
	public void test2() {
		Assert.assertFalse(Question8.containTree(mRoot, mNodeOutSideTree));
	}
}
